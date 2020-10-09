import java.util.Scanner;
public class insertionsort{
			static void sort(int arr[]){
			/*int n=arr.length;
			for(int i=1;i<n;i++){
				int c = arr[i];
				int j=i-1;

				while(j>=0 && arr[j]>c){
					arr[j+i] = arr[j];
					j=j-1;
				}
				arr[j+1] = c; 
			}*/

			int n = arr.length, i,j,z;

			for(i=0; i<n;i++){
				for(j=i-1;j>=0 && arr[j+1]<arr[j];j--){
					z = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = z;

				}
			}

		}
		public static void swapcom(int arr[]){
			for(int i=0; i<arr.length;i++){
				System.out.println(arr[i]);
			}
		}
	public static void main(String[] args){
		Scanner t= new Scanner(System.in);
		System.out.println("Enter the length of your array: ");
		int n = t.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements in your array: ");	
		for (int i = 0;i < n; i++){
			arr[i] = t.nextInt();
		}
		System.out.println("unsorted array are: ");
		for( int j=0; j<arr.length; j++){
			System.out.println(arr[j]);
		}

		System.out.println("sorted array are: ");
		sort(arr);
		swapcom(arr);
	}
}