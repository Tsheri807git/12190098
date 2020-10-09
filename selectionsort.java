import java.util.Scanner;
public class selectionsort
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

        System.out.println("unsorted arrays are:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

         for (int i = 0; i < arr.length - 1; i++)  
        {  
            int k = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[k]){  
                    k = j;//searching for lowest index  
                }  
            }  
            int smallNumber = arr[k];   
            arr[k] = arr[i];  
            arr[i] = smallNumber;  
        }  

         System.out.println("sorted arrays are:");
                for (int j=0;j<arr.length;j++)
                {
                    System.out.println(arr[j]);
                }

    }
 }       