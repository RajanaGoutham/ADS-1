public class MergeSort 
{
	void merge(int[] A,int left,int middle,int right)
	{
		int first=middle-left+1;
		int second=right-middle;
		
		int[] Left=new int[first];
		int[] Right=new int[second];
		
		for(int i=0;i<first;++i)
		{
			Left[i]=A[left+i];
		}
		for(int j=0;j<second;++j)
		{
			Right[j]=A[middle+1+j];
		}
		int i=0;
		int j=0;
		int k=left;
		while(i<first && j<second)
		{
			if(Left[i]<=Right[j])
			{
				A[k]=Left[i];
				i++;
			}
			else
			{
				A[k]=Right[j];
				j++;
			}
			k++;
		}
		while(i<first)
		{
			A[k]=Left[i];
			i++;
			k++;
		}
		while(j<second)
		{
			A[k]=Right[j];
			j++;
			k++;
		}
	}
	void Sort(int[] A,int left,int right)
	{
		if(left<right)
		{
			int middle=(left+right)/2;
			Sort(A,left,middle);
			Sort(A,middle+1,right);
			merge(A,left,middle,right);
		}
	}
	static void PrintArray(int[] A)
	{
		int n=A.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(A[i]+"");
		}
		System.out.println("");
	}
	public static void main(String args[])
	{
		int[] A= {23,5,29,7,63,3,98,9,55,1,113,0};
		System.out.println("Before MergeSort:");
		PrintArray(A);
		
		MergeSort obj=new MergeSort();
        obj.Sort(A, 0, A.length-1);
		System.out.println("After MergeSort:");
		PrintArray(A);
		
	}

}
