public class SelectionSort
{
   public static void selectionSort(int[] A,int n)
   {  
     for ( int i = 0; i < n - 1; i++)  
     {  
        int Min = i;  
        for ( int j = i + 1; j < n; j++)
        {  
          if (A[j] < A[Min])
          {  
             Min = j; 
          }  
        }  
        int temp =A[i];   
        A[i] = A[Min];  
        A[Min] = temp;  
     }  
   }      
    public static void main(String args[])
    {  
        int[] A = {25,73,2,29,11,61};  
        System.out.println("Before Selection Sort"); 
        
		for(int i=0;i<6;i++)
        {  
            System.out.print(A[i]+" ");  
        }
		System.out.println(" ");
        selectionSort(A,6);
         
        System.out.println("After Selection Sort"); 
        
        for(int i=0;i<6;i++)
        {  
            System.out.print(A[i]+" ");  
        }  
    }  
}  