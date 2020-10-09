import java.util.Scanner;
public class bubblesort
{
    public static void main(String[] args) 
    {

        
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the length of your array: ");//array length 
        int n = t.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements in your array: ");


        for(int i = 0; i < n; i++)
        {
            arr[i] = t.nextInt();
           
        }

        System.out.println("unsorted array is :");
        for (int c=0;c<arr.length;c++){
            System.out.println(arr[c]);
        }

        int i,k,j;

       for(i=arr.length-1;i>0;i--)
       {
        for(j=0; j < i; j++){
            if(arr[j]>arr[j+1] ){  
                                 //swap elements  
                                 k = arr[j];  
                                 arr[j]=arr[j+1]  ;  
                                 arr[j+1] = k;  
                         }  
                          
                 }  
         }  
        System.out.println("sorted array is:");
                for (int w=0;w<arr.length;w++)
                {
                    System.out.println(arr[w]);
                }
    }

}