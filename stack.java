public class stack{
	int top;
	int arr[];
	int size;

	public stack(int n){
		arr = new int [n];
		top = -1;
		size = 0;

	}
	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		return false;
	}

	public void push(int n){
		if (isEmpty()){
			arr[0] = n;
			top = 0;
		}
		else {
			arr[top + 1] = n; 
		}
		size = size + 1;
	}
	public int top(){
		if(isEmpty()){
			return 0;
		}
		else {
			return arr[0];
		}
	}
	public int pop(){
		if(isEmpty()){
			return 0;
		}
		else{
			top = top - 1;
			size = size - 1;
		}
		return arr[top + 1];
		

	}

	public static void main(String[] args) {
	stack obj1=new stack(10);
	obj1.push(3);
	obj1.push(5);
		
	System.out.println(obj1.isEmpty());
	System.out.println(obj1.size());
	System.out.println(obj1.top());
	System.out.println(obj1.pop());
}
}