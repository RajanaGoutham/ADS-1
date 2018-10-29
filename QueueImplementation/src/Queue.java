import java.util.Scanner;

public class Queue
{
   int front;
   int rear;
   int A[];
  
   
   Queue()
   {
	   front=0;
	   rear=-1;
	   A=new int[100];
   }
   void enqueue(int a)
   {
	   if(rear==100)
	   {
		   System.out.println("Queue is full");
	   }
	   else
	   {
		   A[++rear]=a;
		   System.out.println(a+"enequed into the queue");
	   }
   }
   int dequeue()
   {
	  if(rear==-1)
	  {
		  System.out.println("Queue is empty");
		  return 0;
	  }
	  else
	  {
		  return A[front++];
	  }
   }
   void display()
   {
	   for(int i=front;i<=rear;i++)
	   {
		   System.out.println("The elements in the queue are: "+A[i]);
	   }
   }
  
}
class Solution
{
	public static void main(String args[])
	{
		int b=0;
		Queue obj=new Queue();
		do
		{
			System.out.println("Enter your choice:");
			System.out.println("1.Enqueue\t 2.Dequeue\t 3.Display\t");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			switch(a)
			{
			   case 1:
			   {
				   System.out.println("Enter the element that you want to enqueue into the Queue");
				   int c=sc.nextInt();
				   obj.enqueue(c);
				   break;
				   
			   }
			   case 2:
			   {
				    System.out.println(obj.dequeue()+"Dequeued from Queue");
				    break;
			   }
			   case 3:
			   {
				   System.out.println("Display the items in the queue");
				   obj.display();
				   break;
			   }
			}
			 System.out.println("Enter your choice:");
			 System.out.println("1.Continue\t 2.Exit\t");
			 b=sc.nextInt();	
		}
		while(b==1);
	}
}

