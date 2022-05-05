class LinkedList
{
	 Node head ;
	
	class Node
	{
		int data ;
		Node next ;
		Node(int d)
		{
		   data = d ;
		   next = null ;
		}
	}
	 void insert(int d)
	{
		Node newnode = new Node(d);
		newnode.next = head ;
		head = newnode ;
	}
	void printlist()
	{
		
		while (head != null)
		{
			System.out.print(head.data+"-->");
			head = head.next;
		}
	}
	
    Node reverse(Node head)
	{
		Node prev = null;
		Node current = head ;
		Node next = null ;
		while(current != null)
		{
			next = current.next ;
			current.next = prev ;
			prev = current ;
			current= next ;
		}
		head = prev;
		return head;
	}
	
	public static void main (String []args)
	{
		LinkedList l = new LinkedList();
		
		l.insert(1);
		l.insert(5);
	    l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.printlist();
		l.reverse(l.head);
	
	}
}