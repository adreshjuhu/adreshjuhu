class Stack
{
	 int data ;
	int t1 ;
	int t2 ;
	int a[];
	int n ;
	Stack(int s)
	{
	  data = 0 ;
	  t1 = -1;
	  t2 = s ;
	  n = s;
	  a = new int[s];
	}
	public void push1(int data)
	{
	 if(t1 < t2 -1)
	 {
	   a[++t1]= data ;
	 }
	 else 
	 {
	   System.out.println("stack full");
	 }
	
	}
	public void push2(int data)
	{
	   if(t1 < t2 - 1)
	   {
	    a[--t2]= data ; 
	   }
	   else
	   {
	     System.out.println("stsck full");
	   }
	}
	public int pop1()
	{
	   if (t1 >= 0)
		{
		  int data = a[t1];
		  t1-- ;
		  return data ;
		}
		else
		{
		  System.out.println("stack empty");
		}
		return 0 ;
	}
	public int pop2()
	{
	  if (t2 <= n)
	  {
	    int data = a[t2];
		t2++ ;
		return data ;
	  }
	  else
	  {
	    System.out.println("Stack empty");
	  }
	  return 0 ;
	}
	
}
class Stack2
{
     public static void main(String args[])
	 {
	   Stack s1 = new Stack(10);
	   s1.push1(5);
	   s1.push2(10);
	   s1.push2(15);
	   s1.push1(11);
	   s1.push2(7);
	   s1.push2(40);
	   System.out.println("popped element from stack1 is "+s1.pop1());
	    System.out.println("popped element from stack2 is "+s1.pop2());
	 }


}