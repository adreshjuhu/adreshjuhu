class Sorting 
{
   public static void insertion (int a[])
   {
     int le = arr.length ;
	 int data = a [le-1];
	 for(int i = ie-2 ; i>=0 ; i--)
	 if (a[i]>data)
	 {
	   a[i+1] = a[i];
	   display(a);
	 }
	 else{
        a[i+1] = data ;
		display (a);
		break ;
	 
	 }
	 if(i== 0 && (a[i]> data))
	 {
		a[i]= data ;
		display (a);
	 
	 }
     }     
	 
   }
   
   public static void displAY (int a)
   {
     for(int n :a)
	 {
	   System.out.println(n+" ");
	   
	 }
	 
   
   }
   public static void main (String args[])
   {
     int a[] = new int[]{1,2,4,5,3};
	 insertion(a);
   }

}
       