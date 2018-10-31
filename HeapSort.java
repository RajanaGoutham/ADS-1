public class HeapSort 
{
	void Sort(int A[])
	{
		int n=A.length-1;
		for(int i=n/2;i>=0;i--)
		{
			Heapify(A,n,i);
		}
		for(int i=n;i>=0;i--)
		{
			int t=A[0];
			A[0]=A[i];
			A[i]=t;
			Heapify(A,i,0);
		}
	}
	void Heapify(int A[],int x,int i)
	{
		int max=i;
		int left=(2*i)+1;
		int right=(2*i)+2;
		if(left<x && A[left]>A[max])
		{
			max=left;
		}	
		if(right<x && A[right]>A[max])
		{
			max=right;
		}
		if(max!=i)
		{
			int temp=A[i];
			A[i]=A[max];
			A[max]=temp;
			Heapify(A,x,max);
		}
		
	}
	static void Print(int A[])
	{
		int n=A.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int A[]= {23,5,29,7,63,3,98,9,55,1,113,0};
		HeapSort hs=new HeapSort();
		
		System.out.println("Before HeapSort");
		Print(A);
		
		hs.Sort(A);
		
		System.out.println("After HeapSort");
		Print(A);
		
	}

}

