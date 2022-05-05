class Details
{
		private String name ;
		private int mob ;
		private String address ;
		int Shirts ; 
		int Tshirts ;
		int Pants ; 
		
    public void Order()
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter name");
	  name = sc.nextLine();
	
	
	System.out.println("enter Adress");
	 adress = sc.nextLine();
	
	
	System.out.println("Enter mobile no.");
	  num = sc.nextLine();
	
	System.out.println("Enter Quantity of shirts.");
	 shirts = sc.nextInt();
	
	
	System.out.println("Enter Quantity of Tshirts.");
	 Tshirts = sc.nextInt();
	
	System.out.println("Enter Quantity of pants.");
	 pants = sc.nextInt();
	
	System.out.println();
	
	
	System.out.println("your personal details are:");
	
	System.out.println("Name:" + name);
	System.out.println("Adress:" + adress);
	System.out.println("Mobile No:" + num);
	System.out.println();
	System.out.println("Your stuff details are:");
	
	System.out.println("shirts:" + shirts);
	System.out.println("Tsirts:" + Tshirts);
	System.out.println("pants:" + pants);
	System.out.println();
		}
		void Bill()
		{
		  d.Order ;
		  Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Quantity of shirts.");
		int Shirts = sc1.nextInt();
	
	
		System.out.println("Enter Quantity of Tshirts.");
		int Tshirts = sc1.nextInt();
	
		System.out.println("Enter Quantity of pants.");
		int Pants = sc1.nextInt();
		
		
		int Shirt_price = Shirts*10;
		int Tshirts_price = Tshirts*10;
		int Pants_price = Pants*10;
		
		System.out.println(" price for shirts:" + Shirt_price );
		System.out.println("price for Tsirts:" + Tshirts_price );
		System.out.println("price for pants:" + Pants_price );
		
		
		int Total = Shirt_price + Tshirts_price + Pants_price;
		System.out.println("Total amount to pay:" +Total );
		System.out.println();
		
		}
		 
  }
  
  class GoldMember extends Details
  {
	  
	  public void goldBill ()
	  {  
	     d.Order ;
	   Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Quantity of shirts.");
		int Shirts = sc2.nextInt();
	
	
		System.out.println("Enter Quantity of Tshirts.");
		int Tshirts = sc2.nextInt();
	
		System.out.println("Enter Quantity of pants.");
		int Pants = sc2.nextInt();
		
		
		int Shirt_price = Shirts*7;
		int Tshirts_price = Tshirts*7;
		int Pants_price = Pants*7;
		
		System.out.println(" price for shirts:" + Shirt_price );
		System.out.println("price for Tsirts:" + Tshirts_price );
		System.out.println("price for pants:" + Pants_price );
		
		
		int Total = Shirt_price + Tshirts_price + Pants_price;
		System.out.println("Total amount to pay:" +Total );
		System.out.println();
		}
  }
  class PlatinumMember extends Details
  {
	  public void platinumBill()
	  {
	    d.Order ;
	   Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter Quantity of shirts.");
		int Shirts = sc3.nextInt();
	
	
		System.out.println("Enter Quantity of Tshirts.");
		int Tshirts = sc3.nextInt();
	
		System.out.println("Enter Quantity of pants.");
		int Pants = sc3.nextInt();
		
		
		int Shirt_price = Shirts*5;
		int Tshirts_price = Tshirts*7;
		int Pants_price = Pants*5;
		
		System.out.println(" price for shirts:" + Shirt_price );
		System.out.println("price for Tsirts:" + Tshirts_price );
		System.out.println("price for pants:" + Pants_price );
		
		
		int Total = Shirt_price + Tshirts_price + Pants_price;
		System.out.println("Total amount to pay:" +Total );
		System.out.println();
		}
  }
  
  class LaundryManagement
  {
      public static void main (String [] args)
	  {  
	     Details d = new Details();
	    Thread t1 = new Thread();
		Scanner op = new Scanner (System.in);
		System.out.println("Enter your option");
		 int option = op.nextInt();
		 if(option == 1)
		 {
		   System.out.println("WELCOME SIR TO CHANDU LAUNDRY SHOP");
		   
		   System.out.println("Wait a sec .... Let me check which type Member you are..");
		   
		   System.out.println("You choose option 1");
		   System.out.println("you are normal member");
		   System.out.println (name\n+mob\n+address\n);
		    d.Bill ;
		    System.out.println("your order will recieve soon...");
			 System.out.println("Thank you ");
		 }
		 else
		 {
		 if (option == 2)
		 {
		    System.out.println("WELCOME SIR TO CHANDU LAUNDRY SHOP");
		    
		   System.out.println("Wait a sec .... Let me check which type Member you are..");
		    t1.sleep(5000);
		   System.out.println("You choose option 2");
		   System.out.println("you are gold member");
		    System.out.println (name\n+mob\n+address\n);
		    d.goldBill ;
		    System.out.println("your order will recieve soon...");
			 System.out.println("Thank you ");  
		 }
		 else
		 {
		 if (option == 3)
		 {
		    System.out.println("WELCOME SIR TO CHANDU LAUNDRY SHOP");
		    t1.sleep(2000);
		   System.out.println("Wait a sec .... Let me check which type Member you are..");
		    t1.sleep(5000);
		   System.out.println("You choose option 3");
		   System.out.println("you are platinum member");
		    System.out.println (name\n+mob\n+address\n);
		    d.platinumBill ;
		    System.out.println("your order will recieve soon...");
			 System.out.println("Thank you ");
		 }
		 else
		 {
		  System.out.println("you choose invaid option");
		  System.out.println ("please try again";)
		  }
		 } 
		}
	  }
  }