public class arraylist
{
	double full_1over4 = 0.25;
	double full_3over4 = 0.75;
	int capacity = 4;
	static int a;
	int remove;
	int top = 0;
	static double length;
	static int Array[];
	public arraylist()
	{
		Array = new int[capacity];
	}
	public void add(int e)
	{
		Array[top] = e;
		top++;
	}
	public void pop()
	{
		top--;
		remove = Array[top];
		Array[top] = 0;
		int count = 0;
		for(int i = 0; i < Array[i]; i++) {
			count++;
		}
		a = count;
		length = (double)a/capacity;
		System.out.println("Remove Element " +remove);
	}
	
	public void resize()
	{
		if(length == full_1over4 ) {
			int newArray[] = new int[(capacity/2)*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			Array = newArray;
			capacity = capacity/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == full_3over4) {
			int newArray[] = new int[capacity*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			capacity = capacity * 2;
			Array = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange");
		}
	}
	public int size()
	{
		return capacity;
	}
	public String toString()
	{
		String s = Integer.toString(capacity);
		return s;
	}

	public static void main(String[] args) {
		arraylist obj = new arraylist();
		obj.add(4);
		obj.add(7);
		obj.add(3);
		obj.add(1);
		obj.pop();
		obj.resize();
		System.out.println("toString " +obj.toString());
		System.out.println("The number of elements in the new Array is " +a);
		System.out.println("The Size of new Array is " +obj.size());
	}
}
