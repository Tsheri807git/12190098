import java.util.*;

public class BST<Key extends Comparable<Key>, Value>  {
    private Node root;
    int size = 0;
              
    private class Node {
        private Key key;         
        private Value val;         
        private Node left, right;  

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    public int size() {
      return size;
    }

     public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    public Value get(Key key) {
        if(key == null){
            System.out.println("key cannot be null");
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

    

    public Key floor(Key key){
        if(isEmpty()){
            System.out.println("error");
        }
        Node t = root;
        Node w = null;
        while(t != null){
            w = t;
            int cmp = key.compareTo(w.key);
            if(key == null){
                System.out.println("key cannot ne null");
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

    public Key select(Key key){
        if(isEmpty()){
            System.out.println("empty symbol table");
        }
        Node t = root;
        Node w = null;
        while(t != null){
            w = t;
            int cmp = key.compareTo(w.key);
            if(key == null){
                System.out.println("null key");
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
     public static void main(String[] args) { 
        BST <String, Integer> obj = new BST <String, Integer>();
        obj.put("Ada",1);
      	obj.put("Ballerina",3);
      	obj.get("Ada");
        obj.put("Html",5);
        obj.put("Java",7);
        obj.get("Java");
        System.out.println(obj.size());
        System.out.println(obj.min());
        System.out.println(obj.floor("Ballerina"));
        // System.out.println(obj.select(3));
        obj.keys("Ada","Java");
        System.out.println();
        obj.put("Java",8);
        obj.put("Dart",9);
        obj.get("Java");
        System.out.println(obj.size());
        obj.keys("Ballerina","Java");
    }  
}
