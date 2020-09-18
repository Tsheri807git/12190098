public class demo2{
	public static int[] resize(int n, int[] t){
	int[] t1 = new int[n];
	for (int i=0; i< t.length; i++){
		t1[i] = t[i];
}
	t1[n-1] = 4;

	return t1;
	public static void main(String[] args){
		int[] t ={1,2,3};
		int[] value = resize(4, t);
		for (int i=0; i<value.length; i++){
	System.out.println(value[i]);
}
}
}
}
