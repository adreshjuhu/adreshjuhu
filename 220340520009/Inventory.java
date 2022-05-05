

class Item implements Comparable<Item>
{
     int itemId ;
	 String itemName ;

   Item ( int itemId , Syring itemName)
   {
     this.itemId = itemid ;
	 this.itemName = itemName ; 
   }
   
   public String toString (){
      return this.itemId+" "+this.itemName ;
   }
   public void boolean equals (Object p)
   {
     if (p instaceOf Item)
	 {
	    item i = (Object)p ;
	 }
	 if ((this.equals(i.itemId))&&(this.itemName.equals(i.itemName))
	 {
	   return true ;
	 }
	 else 
	   return false ;
   }
   @override
   public int hashCode (){
     int a = 10 ;
	 a = a + a*this.itemId.hashcode();
	 a = a + a*this.itemName.hashcode();
	    return a;
   }
   @override 
   public int compareTo (Item e)
   {
    return this.itemId.compareTo(e.itemId);
   }
 }
 
 class Inventory {
	 public static void main (String [] args)
	 {
		Array<Item>List = new ArrayList<>;
		
		Item a1 = new Item ( 1,"Item1");
		Item a2 = new Item  (2,"Item2");
		Item a3 = new Item (3,"Item3");
		list.add (a1);
		list.add (a2);
		list.add (a3);
		
		System.out.println(list);
		collectios.sort(list);
		int n = list.size();
         for (int i = 0 ; i<n ; i++)
         {
		    if (list(i).equals.a4)
			System.out.print("can not add item");
			else
			list.add(a4);
		 };   
		 list.remove(a);
		 System.out.println(list);
		 
	 }
 }
