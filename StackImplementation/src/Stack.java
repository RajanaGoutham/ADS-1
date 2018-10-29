import java.util.Scanner;

public class Stack 
{
    int top;
    int A[];
    Stack()
    {
    	top=-1;
    	A=new int[100];
    }

boolean isEmpty()
{
	if(top<0)
	{
		System.out.println("Stack is empty");
		
	}
	else
	{
		System.out.println("Stack is not empty");
	}
	return false;
}
void push(int q)
{
	if(top>100)
	{
		System.out.println("Stack overflow");
	}
	else
	{
		A[++top]=q;
		System.out.println(q+"Pushed into the stack");
	}
}
int pop()
{
	int w = 0;
	if(top<0)
	{
		System.out.println("Stack underflow");
		
	}
	else
	{
		
		w=A[top--];
		
	}
	return w;
}
}
class Solution
{
	public static void main(String args[])
	{  
		int b = 0;
		Stack obj=new Stack();
		do
		{
			System.out.println("Enter your choice:");
			System.out.println("1.Push\t 2.Pop\t 3.IsEmpty\t");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			switch(a)
			{
			   case 1:
			   {
				   System.out.println("Enter the element that you want to push into the stack");
				   int c=sc.nextInt();
				   obj.push(c);
				   break;
				   
			   }
			   case 2:
			   {
				    System.out.println(obj.pop()+"popped out from stack");
				    break;
			   }
			   case 3:
			   {
				   System.out.println("Check whether the stack is empty or not");
				   obj.isEmpty();
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