public class BubbleSort 
{
     public static void bubbleSort(int[] A,int n)
     {
    	 for(int i=0;i<n-1;i++)
    	 {
    		 for(int j=i+1;j<n;j++)
    		 {
    			 if(A[j]<A[i])
    			 {
    				 int temp=A[i];
    				 A[i]=A[j];
    				 A[j]=temp;
    			 }
    		 }
    	 }
     }
	public static void main(String args[])
	{
		int[] A= {2,26,13,4,78,36,53,1};
		System.out.println("Before bubble sort");
		for(int i=0;i<8;i++)
		{
			System.out.println(" "+A[i]);
		}
		System.out.println(" ");
		bubbleSort(A,8);
		
		System.out.println("After bubble sort");
		
		for(int i=0;i<8;i++)
		{
			System.out.println(" "+A[i]);
		}
	}
}

