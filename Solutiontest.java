public class Solutiontest{
    public static void main(String[] args) { 
        Solution <String, Integer> theTree = new Solution <String, Integer>();
        theTree.put("ABDUL",1);
        theTree.get("ABDUL");
        theTree.put("HRITHIK",2);
        theTree.put("SAI",3);
        theTree.put("SAMAL",6);
        theTree.get("SAI");
        theTree.put("TASHI",4);
        System.out.println(theTree.size());
        System.out.println(theTree.min());
        System.out.println(theTree.floor("HRITHIK"));
        System.out.println(theTree.floor("HAHA"));
        System.out.println(theTree.select("HRITHIKH"));
        theTree.keys("ABDUL","TASHI");
        System.out.println();
        theTree.put("CHIMI",5);
        theTree.put("SAMAL",4);
        theTree.get("SAMAL");
        theTree.put("NIMA",7);
        System.out.println(theTree.size());
        theTree.get("CHIMI");
        System.out.println(theTree.floor("CHIMI"));
        theTree.put("SONAM",8);
        theTree.keys("ABDUL","TASHI");
    }
}