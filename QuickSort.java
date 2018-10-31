class QuickSort 
{ 
    int partition(int A[], int left, int right) 
    { 
        int pivot = A[left];  
        int i = left;
        int j=right;
        while(i<=j)
        { 
        	while(A[i]<pivot)
        	{
        		i++;
        	}
        	
        	while(A[j]>pivot)
        	{
        		j--;
        	}
        	
        	if(i<=j)
           {
        		int temp=A[i];
        		A[i]=A[j];
        		A[j]=temp;
        		i++;
        		j--;
        	}
        }
        return i;
      } 
    void sort(int A[], int left, int right) 
    { 
        if (left < right) 
        { 
            int p = partition(A, left, right);  
            sort(A, left, p-1); 
            sort(A, p, right); 
        } 
    } 
  
    static void printArray(int A[]) 
    { 
        int n = A.length; 
        for (int i=0; i<n; ++i)
        {
        	System.out.print(A[i]+" "); 
        }    
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        int A[] = {23,5,29,7,63,3,98,9};

        System.out.println("Before Quick Sort"); 
        printArray(A);
        
        QuickSort obj = new QuickSort(); 
        obj.sort(A, 0, A.length-1); 
  
        System.out.println("After Quick Sort"); 
        printArray(A); 
    } 
} 