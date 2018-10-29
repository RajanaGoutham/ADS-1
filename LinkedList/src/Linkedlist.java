public class Linkedlist 
{
    Node head;
    Node back;
   
    void insert(int data)
    {
    	 Node n=new Node(data);
    	 if(head==null)
    	 {
    		 head=n;
    	 }
    	 else
    	 {
    		 Node temp;
    		 temp=head;
    	 
    	   while(temp.next!=null)
    	   {
    		 temp=temp.next;
    	   }
    	 temp.next=n;
    	 }
    	 
    }
    void display()
    {
		Node n;
    	n=head;
    	while(n!=null)
    	{
    		System.out.println(""+n.data);
    		n=n.next;
    	}
    	
    }
    void deleteFisrt()
    {
    	if(head!=null)
    	{
    		head=head.next;
    	}
		
    }
    void deleteLast()
    {
    	Node temp = head;
		if(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
    	
    }
    void printMiddle()
    {
    	
		Node Slow=head;
    	
		Node Fast=head;
    	if(head!=null)
    	{
    		while(Fast!=null && Fast.next!=null)
    		{
    			Fast=Fast.next.next;
    			Slow=Slow.next;
    		}
    		System.out.println(" "+Slow.data);
    	}
    }
    void deleteMiddle(int data)
    {
    	Node temp=head.next;
    	Node temp2=head;
		while(temp.data!=data)
    	{
    		temp=temp.next;
    		temp2=temp2.next;
    	}
    	temp2.next=temp.next;
    }
    void insertAfter(int data1,int data)
    {
    	Node temp=head.next;
    	Node temp2=head;
		while(temp.data!=data)
    	{
    		temp=temp.next;
    		temp2=temp2.next;
    	}
    	//temp2.next=temp.next;
    	Node n=new Node(data1);
    	n.next=temp2.next;
    	temp2.next=n;
    }
   
}
