import java.util.*;
class Details
{
		public String name ;
		public String mob ;
	   public String address ;
		int Shirts ; 
		int Tshirts ;
		int Pants ; 
		  Scanner sc = new Scanner (System.in) ;
		  Scanner sc1 = new Scanner (System.in) ;
		  Scanner sc2 = new Scanner (System.in) ;
		  Scanner sc3 = new Scanner (System.in) ;
    public  void Order() 
	{ 
	  try{
	  System.out.println("enter name");
	   name = sc.nextLine();
	  }
	  catch(InputMismatchException e){
	  System.out.println("Please Enter valid name");
	  Order();
	  }
	  try{
	System.out.println("enter Adress");
	 address = sc.nextLine();
	 }
	 catch(InputMismatchException e1){
	 System.out.println("Please Enter Valid address");
	 Order(); 
	 }
	 try{
	 System.out.println("Enter mobile no.");
	      mob = sc.nextLine();
		  }
		 catch(InputMismatchException e2)
         {
		  System.out.println("Please Enter Valid MOBILE NUMBER");
		  Order();
		 }		 
	    int mobNum = mob.length();
		
	  if(mobNum < 10  )
	 {
		 System.out.println("Enter invaild mobile number.");
		  System.out.println("Please enter 10 digit mobile number");
		 System.out.println("please try again.");
          Order();		 
	 }
	 System.out.println("------------------------------------");
	System.out.println("Enter Quantity of shirts.");
	try{
	 Shirts = sc.nextInt();
	 }
	 catch(InputMismatchException e4)
	 {
	 System.out.println("Please Enter A Number not ANY ALPHABET or SPECIAL CHARACTER");
	 }
	 
	System.out.println("Enter Quantity of Tshirts.");
	try{
	 Tshirts = sc.nextInt();
	 }
	 catch(InputMismatchException e5)
	 {
	    System.out.println("Please Enter A Number not ANY ALPHABET or SPECIAL CHARACTER");
	 }
	 
	System.out.println("Enter Quantity of pants.");
	try{
	 Pants = sc.nextInt();
	 }
	 catch(InputMismatchException e6)
	 {
	    System.out.println("Please Enter A Number not ANY ALPHABET or SPECIAL CHARACTER");
	 }
	 
	System.out.println();
	
    System.out.println("------------------------------------");
	System.out.println("your personal details are:");
	
	System.out.println("Name:" + name);
	System.out.println("Adress:" + address);
	System.out.println("Mobile No:" + mob);
	System.out.println();
	System.out.println("Your stuff details are:");
	
	System.out.println("shirts:" + Shirts);
	System.out.println("Tsirts:" + Tshirts);
	System.out.println("pants:" + Pants);
	  System.out.println("------------------------------------");
	System.out.println();
		}
		public void Bill()throws InputMismatchException
		{
		  Order() ;
		    System.out.println();
		    System.out.println("------------------------------------");
			System.out.println("Enter Again For Bill Receipet");
		    System.out.println("Enter Quantity of shirts.");
		     int Shirts1 = sc1.nextInt();
		if (Shirts1 != Shirts) 
		{
			System.out.println("Please Enter same number as you enter at order time");
			Bill();
		}
	
	
		    System.out.println("Enter Quantity of Tshirts.");
		int Tshirts1 = sc1.nextInt();
		if (Tshirts1 != Tshirts) 
		{
			System.out.println("Please Enter same number as you enter at order time");
			Bill();
		}
	
		    System.out.println("Enter Quantity of pants.");
		    int Pants1 = sc1.nextInt();
		if (Pants1 != Pants) 
		{
			System.out.println("Please Enter same number as you enter at order time");
			Bill();
		}
		
		
		int Shirt_price = Shirts*10;
		int Tshirts_price = Tshirts*10;
		int Pants_price = Pants*10;
		
		   System.out.println(" price for shirts:" + Shirt_price );
		   System.out.println("price for Tsirts:" + Tshirts_price );
		   System.out.println("price for pants:" + Pants_price );
		
		
		int Total = Shirt_price + Tshirts_price + Pants_price;
		  System.out.println("Total amount to pay:" +Total );
		  System.out.println("------------------------------------");
		  System.out.println();
		
		
		}
		 
  }
  
  class GoldMember extends Details
  {
	  
	  public void goldBill ()throws InputMismatchException
	  {  
	    Order() ;
		  System.out.println();
	      System.out.println("------------------------------------");
		  System.out.println("Enter Again For Bill Receipet");
		  System.out.println("Enter Quantity of shirts.");
		  int Shirts2 = sc2.nextInt();
		if (Shirts2 != Shirts) 
		{
			System.out.println("Please Enter same number as you enter at order time");
			goldBill();
		}
	
	
		  System.out.println("Enter Quantity of Tshirts.");
		int Tshirts2 = sc2.nextInt();
		if (Tshirts2 != Tshirts) 
		{
		  System.out.println("Please Enter same number as you enter at order time");
			goldBill();
		}
	
		  System.out.println("Enter Quantity of pants.");
		int Pants2 = sc2.nextInt();
		if (Pants2 != Pants) 
		{
		  System.out.println("Please Enter same number as you enter at order time");
			goldBill();
		}
		
		
		int Shirt_price = Shirts*7;
		int Tshirts_price = Tshirts*7;
		int Pants_price = Pants*7;
		
		  System.out.println(" price for shirts:" + Shirt_price );
		  System.out.println("price for Tsirts:" + Tshirts_price );
		  System.out.println("price for pants:" + Pants_price );
		
		
		int Total = Shirt_price + Tshirts_price + Pants_price;
		  System.out.println("Total amount to pay:" +Total );
		  System.out.println("------------------------------------");
		  System.out.println();
		}
  }
  class PlatinumMember extends GoldMember
  {
	  public void platinumBill() throws InputMismatchException
	  {
	   Order() ;
	     System.out.println("------------------------------------");
		 System.out.println("Enter Again For Bill Receipet");
		 System.out.println("Enter Quantity of shirts.");
		int Shirts3 = sc3.nextInt();
		if (Shirts3 != Shirts) 
		{
		 System.out.println("Please Enter same number as you enter at order time");
			platinumBill();
		}
		 System.out.println("Enter Quantity of Tshirts.");
		int Tshirts3 = sc3.nextInt();
		if (Tshirts3 != Tshirts) 
		{
		 System.out.println("Please Enter same number as you enter at order time");
			platinumBill();
		}
		 System.out.println("Enter Quantity of pants.");
		int Pants3 = sc3.nextInt();
		if (Pants3 != Pants) 
		{
		 System.out.println("Please Enter same number as you enter at order time");
			platinumBill();
		}
		
		
		int Shirt_price = Shirts*5;
		int Tshirts_price = Tshirts*7;
		int Pants_price = Pants*5;
		
		 System.out.println(" price for shirts:" + Shirt_price );
		 System.out.println("price for Tsirts:" + Tshirts_price );
		 System.out.println("price for pants:" + Pants_price );
		
		
		int Total = Shirt_price + Tshirts_price + Pants_price;
		 System.out.println("Total amount to pay:" +Total );
		 System.out.println();
		 System.out.println("YOUR BILL AMOUNT:"+Total);
		 System.out.println("------------------------------------");
		}
  }
  
  class LaundryManagement 
  {
      public static void main (String [] args) throws InputMismatchException 
	  { 
		  Details d = new Details();
		  GoldMember e = new GoldMember();
		  PlatinumMember f = new PlatinumMember();
		Scanner op = new Scanner (System.in);
		   System.out.println("Enter your option");
		 int option = op.nextInt();
		 if(option == 1)
		 {
		   System.out.println("WELCOME SIR TO CHANDU LAUNDRY SHOP");
		   System.out.println("------------------------------------");
		   System.out.println("Wait a sec .... Let me check which type Member you are..");
		
		   System.out.println("You choose option 1");
		   System.out.println("you are normal member");
		
		    d.Bill() ;
		   System.out.println();
		   System.out.println("your order will recieved soon...");
		   System.out.println("Thank you ....");
		   System.out.println();
		   System.out.println("Want To Be  GoldMember Or Platinum Member . ");
		   System.out.println();
		   System.out.println("TYPE YESA FOR GOLD AND YESB FOR PLATINUM ELSE COOSE NOOO");
			  Scanner a = new Scanner(System.in);
			  String s = a.nextLine();
			  char ch = s.charAt(3);
			  if (ch == 'A')
			   {
				  System.out.println();
				  System.out.println("WELCOME TO GOLD FAMILY");
			      System.out.println("FIRST PAY THE FEE 100");
				  System.out.println("MY GOOGLE PAY NUMBER IS : 9007869008");
				  System.out.println("SEND THE FEE PAYEMENT SCREENSHOT ON MY WHATSAPP NO : 9140787665");
				  System.out.println("I WILL ADD YOU IN FEW MINUTES");
				   System.out.println();
			    }
			  else
			    {
				  if (ch == 'B')
				  {
				  System.out.println();
				  System.out.println("WELCOME TO platinum FAMILY");
			      System.out.println("FIRST PAY THE FEE 200 rupees");
				  System.out.println("MY GOOGLE PAY NUMBER IS : 9007869008");
				  System.out.println("SEND THE FEE PAYEMENT SCREENSHOT ON MY WHATSAPP NO : 9140787665"); 
				  System.out.println("I WILL ADD YOU IN FEW MINUTES");
				  System.out.println();
				  }
				  else
				  System.out.println("HAVE A NICE DAY . if you take membership ,you can get discount on your order");
			    }
		    }
		 else
		 {
		 if (option == 2)
		 {
		    System.out.println("WELCOME SIR TO CHANDU LAUNDRY SHOP");
		   System.out.println("------------------------------------");
		   System.out.println("Wait a sec .... Let me check which type Member you are..");
		   System.out.println();
		   System.out.println("You choose option 2");
		   System.out.println("you are gold member");
		   System.out.println();
		    
		   e.goldBill() ;
		   System.out.println();
		   System.out.println("your order will recieved soon...");
		   System.out.println("Thank you....... ");  
		 }
		 else
		 {
		 if (option == 3)
		  {
		    System.out.println("WELCOME SIR TO CHANDU LAUNDRY SHOP");
			System.out.println("------------------------------------");
		
		    System.out.println("Wait a sec .... Let me check which type Member you are..");
		    System.out.println();
		    System.out.println("You choose option 3");
		    System.out.println("you are platinum member");
		    System.out.println();
		
		   f. platinumBill() ;
		    System.out.println();
		    System.out.println("your order will recieve soon...");
			System.out.println("Thank you ........");
		  }
		 else
		 {
		  System.out.println("you choose invaid option");
		  System.out.println ("please try again");
		  }
		}
		
	  }
		   System.out.println("Please Enter 1 For Continue order Or Enter 2 For Exit");
		   Scanner scan = new Scanner (System.in);
		   int entry = scan.nextInt();
            switch (entry)
			{
              case 1 : 
			  {
                    d.Order();
                    d.Bill();
                    break ;
			  }
              case 2 :
			   {
                   System.out.println("---------------THANKYOU-----------------------");
				   break ;
			    }
			  default :  System.out.println("--------------------------------------");
			}
			      System.out.println("---------------THANKYOU-----------------------");
	    } 
	}
  

  