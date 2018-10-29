public class InsertionSort
{  
    public static void insertionSort(int A[],int n)
    {  
       for(int j=1;j<n;j++)
       {
    	   int temp=A[j];
    	   int k=j-1;
    	   while(k>=0 && temp<A[k])
    	   {
    		   A[k+1]=A[k];
    		   k--;  
    	   }
    	   A[k+1]=temp;
       }
    }  
       
    public static void main(String args[])
    {    
        int[] A = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i=0;i<8;i++)
        {    
            System.out.print(A[i]+" ");    
        }    
        System.out.println();    
            
        insertionSort(A,8);    
           
        System.out.println("After Insertion Sort");    
        for(int i=0;i<8;i++)
        {    
        	 System.out.print(A[i]+" ");    
        }    
    }    
}    
