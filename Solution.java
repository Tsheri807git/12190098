import java.util.*;

public class Solution<Key extends Comparable<Key>, Value>  {
    private Node root;
    int size = 0;             // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
      return size;
    }

    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public boolean contains(Key key) {
        Node t = root;
       if(key == null){
            throw new IllegalArgumentException("There is not key conatin in the root");
       }
       else{
            while(t.key != key){
                int cmp = key.compareTo(t.key);
                if(cmp < 0){
                    t = t.left;
                }
                else{
                    t = t.right;
                }
            }
            return true;
       }
    }

    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        if(key == null){
            System.out.println("argument to get value() is null");
        }
        Node t = root;
        while(t.key != key){
            int cmp = key.compareTo(t.key);
            if(cmp < 0){
                t = t.left;
            }
            else if(cmp > 0){
                t = t.right;
            }
        }
        if(t.key == key){
            System.out.println(t.val);
        }
        return t.val;
    }

    // /**
    //  * Inserts the specified key-value pair into the symbol table, overwriting the old 
    //  * value with the new value if the symbol table already contains the specified key.
    //  * Deletes the specified key (and its associated value) from this symbol table
    //  * if the specified value is {@code null}.
    //  *
    //  * @param  key the key
    //  * @param  val the value
    //  * @throws IllegalArgumentException if {@code key} is {@code null}
    //  */
    public void put(Key key, Value val) {
        Node newNode = new Node(key,val);
        if(root == null){
            root = newNode;
        }
        else{
            Node t = root;
            Node w;
            while(true){
                w = t;
                int cmp = key.compareTo(t.key);
                if(cmp < 0){
                    t = t.left;
                    if(t == null){
                        w.left = newNode;
                        size = size + 1;
                        return;
                    }
                    else if(t.key == key){
                        t.val = val;
                        return;
                    }
                }
                else if(cmp > 0){
                    t = t.right;
                    if(t == null){
                        w.right = newNode;
                        size = size + 1;
                        return;
                    }
                    else if(t.key == key){
                        t.val = val;
                        return;
                    }
                }
            }
        }
        size = size + 1;
    }

    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
       if(isEmpty()){
        throw new NoSuchElementException("There is no element in the tree");
       }
       else{
            Node t = root;
            while(t.left != null){
                t = t.left;
            }
            return t.key;
       }
    } 

    public Key max() { 
        if(isEmpty()){
            throw new NoSuchElementException("There is no element in the tree");
       }
       else{
            Node t = root;
            while(t.right != null){
                t = t.right;
            }
            return t.key;
       }
    } 

   

    /**
     * Returns the largest key in the symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in the symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key floor(Key key){
        if(isEmpty()){
            System.out.println("calls floor() with empty symbol table");
        }
        Node t = root;
        Node w = null;
        while(t != null){
            w = t;
            int cmp = key.compareTo(w.key);
            if(key == null){
                System.out.println("calls floor() with a null key");
            }
            if(cmp == 0){
                return w.key;
            }
            if(cmp < 0){
                t = w.left;
            }
            else if(cmp > 0){
                t = w.right;
                int cm = key.compareTo(t.key);
                if(cm < 0 ){
                    return w.key;
                }
                else{
                    t = w.right;
                } 
            }
        }
        return w.key;
    }

    /**
     * Return the key in the symbol table whose rank is {@code k}.
     * This is the (k+1)st smallest key in the symbol table.
     *
     * @param  k the order statistic
     * @return the key in the symbol table of rank {@code k}
     * @throws IllegalArgumentException unless {@code k} is between 0 and
     *        <em>n</em>–1
     */

    //Return key of rank k.
    public Key select(Key key){
        if(isEmpty()){
            System.out.println("calls floor() with empty symbol table");
        }
        Node t = root;
        Node w = null;
        while(t != null){
            w = t;
            int cmp = key.compareTo(w.key);
            if(key == null){
                System.out.println("calls floor() with a null key");
            }
            if(cmp > 0){
                t = w.right;
            }
            else if(cmp < 0){
                t = w.left;
                int cm = key.compareTo(w.key);
                if(cm > 0 ){
                    return t.key;
                }
                else{
                    t = w.left;
                } 
            }
        }
        return w.key;
    }
    /**
     * Returns all keys in the symbol table in the given range,
     * as an {@code Iterable}.
     *
     * @param  lo minimum endpoint
     * @param  hi maximum endpoint
     * @return all keys in the symbol table between {@code lo} 
     *         (inclusive) and {@code hi} (inclusive)
     * @throws IllegalArgumentException if either {@code lo} or {@code hi}
     *         is {@code null}
     */
    public void keys(Key lo, Key hi){
        if(lo == null || hi == null){
            System.out.println("calls keys() with a null key");
        }
        Node t = root;
        Node w;
        while(t != null) {
            w = t;
            if(w == null) { 
                return; 
            } 
            int cmp = lo.compareTo(w.key);
            int cm = hi.compareTo(w.key); 
            if (cmp < 0) { 
                t = w.left;
            }
            if (cmp <= 0 && cm >= 0) { 
                System.out.print(w.key + " "); 
            } 
            if (cm > 0) { 
                t = w.right;
            }
        }
    }
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
  
    
}