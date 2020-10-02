public class queue{
	int arr [];
	int length;
	int rear;
	int front;

	public queue(int e){
		arr = new int[e];
		length = 0;
	}

	public int len(){
		return length;
	}

	public boolean isEmpty(){
		if(length==0){
			return true;
		}
		else{
			return false;
		}
	}
	public int first(){
		if (isEmpty()){
			return 0;
		}
		else{
			return arr[front];
		}
	}

	public void enqueue(int e){
		if (isEmpty()){
			arr[0] = 0;
		}
		else{
			arr[rear + 1] = 0;
			rear++;
		}
		length = length + 1;
	}
	public int dequeue(){
		if (isEmpty()){
			return 0;
		}
		else{
			return arr[front+1];
		}
			
		
	}
	public static void main(String[] args){

		queue obj2 = new queue(10);
		obj2.enqueue(2);
		obj2.enqueue(4);
		obj2.enqueue(1);
		obj2.enqueue(9);


		System.out.println(obj2.len());
		System.out.println(obj2.isEmpty());
		System.out.println(obj2.dequeue());
		System.out.println(obj2.first());
	}
}