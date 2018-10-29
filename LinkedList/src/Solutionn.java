import java.util.Scanner;

class Solutionn
{
	public static void main(String args[])
	{
		Linkedlist obj=new Linkedlist();
		int b;
		do
		{
		  System.out.println("Enter your choice:");
		  System.out.println("1.Insert\t 2.Exit\t 3.Display\t 4.Delete First\t 5.Delete Last\t 6.Print Middle Element\t 7.Delete Middle Element 8.Insert After\t ");
		  @SuppressWarnings("resource")
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  switch(a)
		  {
		    case 1:
		    {
			      System.out.println("Enter data into the Node:");
			      int data=sc.nextInt();
			      obj.insert(data);
			      break;
		    }   
		    case 2:
		    {
		    	 System.out.println("Exit");
	             break;
		    }
		    case 3:
		    {
		    	 System.out.println("display");
		    	   obj.display();
		    	   break;
		    }
		    case 4:
		    {
		    	    System.out.println("Delete First element");
		    	    obj.deleteFisrt();
		    	    break;
		    }
		    case 5:
		    {
		    	    System.out.println("Delete Last element");
		    	    obj.deleteLast();
		    	    break;
		    }
		    case 6:
		    {
		    	 System.out.println("Print middle element");
		    	    obj.printMiddle();
		    	    break;
		    }
		    case 7:
		    {
		    	   System.out.println("Enter the element to be deleted:");
				   int c=sc.nextInt();
		    	   obj.deleteMiddle(c);
		    	   break;
		    }
		    case 8:
		    {
		    	   System.out.println("Enter the element to be inserted");
		    	   int d=sc.nextInt();
		    	   System.out.println("Enter the position:");
		    	   int e=sc.nextInt();
				   obj.insertAfter(d,e);
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





