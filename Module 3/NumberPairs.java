import java.util.Arrays;
public class NumberPairs
{
   public static void main(String[] args) 
   {
		// TODO Auto-generated method stub
	   int array[]= {8,5,9,3,3,0,6,8,2,4};
	   Arrays.sort(array);
	   System.out.printf("The Sorted Array is :%s",Arrays.toString(array));
	   @SuppressWarnings("unused")
	int count=0;
	   for(int i = 0;i<array.length-1;i++)
	   {
		   if(array[i]==array[i+1])
		   {
			   count++;
		   }
	   }
	   System.out.println("Numberpairs:"+count);
	}
}

