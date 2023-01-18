package pr;
import java.util.Scanner;
class Amazon
{
	int Product_ID ;
	String Product_Name;
	double Product_Price;
	//String Product_Size;
	
	
	private String Owener_Name;
	private long Mobile_No;
	
	//Setter Method To set/Modify Private Data
	public void setOwener_Name(String Owener_Name)
	{
		this.Owener_Name=Owener_Name;
	}
	
	//Permission ->getter Method-> to get Private Data
	public String getOwener_Name()
	{
		return Owener_Name;
	}
	
	//Setter Method To set/Modify Private Data
	public void setMobile_No(long Mobile_No)
	{
		this.Mobile_No= Mobile_No;
		
	}
	
	//Permission ->getter Method-> to get Private Data
	public long getMobile_No()
	{
		return Mobile_No;
	}
	
	
	
    public void pass(int Product_ID,String Product_Name,double Product_Price)
	{
		this.Product_ID=Product_ID;
    	this. Product_Name=Product_Name;
    	this.Product_Price=Product_Price;
    	//this. Product_Size= Product_Size;
    }
	
    public void getDetails()
	{
		   
		       Scanner scr=new Scanner(System.in);
		 	   System.out.print(" Enter your Name  :");
			   String a= scr.nextLine();
			   
			   setOwener_Name(a);
			   
			   System.out.println("---------------------------------");
			   System.out.print(" Enter your number :");
			   System.out.println("");
			   long b= scr.nextLong();

			   setMobile_No(b);
			   
   
			  //payment details			   System.out.println("");
			   System.out.println(" <1> Pay via Cash");
			   System.out.println(" <2> Pay via Google Pay");
			   System.out.println(" <3> Pay via Credit Card");
			   System.out.println("");
			   System.out.print(" Select Payment method :");
			   System.out.print("");
			   int n=scr.nextInt();
			   switch( n)
			   {
			   case 1:  System.out.println("");
				        System.out.println("  Pay via Cash");
			            System.out.println("---------------------------------");
			            Payment();
			   break;
			            
			   case 2:  System.out.println("");
				        System.out.println("  Pay via Google Pay");
			            System.out.println("---------------------------------");
			            Payment();
			   break;
			            
			   case 3:  System.out.println("");
				        System.out.println("  Pay via Credit Card");
			            System.out.println("---------------------------------");
			            Payment();
			   break;        
			   }
			   
			   System.out.println("");
			   
		       System.out.println("               ____INVOICE____                         ");
			    
			   System.out.println("");
			   
			   System.out.println("*******************");
		
			   System.out.println("");

			   System.out.println("                   <<<<Product Details>>>>                            ");
			   
			   System.out.println("");
			   System.out.println("********************");
	
			  
			   
			   System.out.println(" Product ID          :"+Product_ID);
			   
			   
			   System.out.println(" Produt Name         :"+Product_Name);
			   
			   
			   
			   System.out.println(" Product Price       :"+Product_Price);
			   
                
			  
			    
			   System.out.println(" owner name          :"+getOwener_Name());
			   System.out.println(" owner mobile number : "+getMobile_No());
			   
			   
			   System.out.println("");
			   System.out.println("");
			  
    }
	
	public void Payment()
	{
		System.out.println("");
		System.out.println(" Payment Done Successfully..!!");
	}
	
		
	
	public static void Micro() 
	{
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	
}

//Sub Class from Electronic
class Home_Appliances extends Amazon
{
	Amazon e1=new Amazon();
	public void HA()
	{
		 System.out.println("");
		 System.out.println(" WELCOME TO HOME APPLIANCES ");
		 System.out.println("___________");
		 System.out.println("");
		 
		 Home_Appliances a=new Television();//Upcasting
		 Television t1= (Television)a;//Downcasting
		 System.out.println(" <1>  For Televsion");
		 
		 Home_Appliances a1=new AC();//Upcasting
		 AC ac1= (AC)a1;//Downcasting
		 System.out.println(" <2>  For AC");
		 
		 Home_Appliances a2=new Iron();//Upcasting
		 Iron I1= (Iron)a2;//Downcasting
	     System.out.println(" <3>  For Iron");
	     
	     Home_Appliances a3=new Speaker();//Upcasting
	     Speaker s1= (Speaker)a3;//Downcasting
	     System.out.println(" <4>  For Speakers");
	    
	     System.out.println(" <5>  For Back To Page");
	     Scanner sc=new Scanner(System.in);
	     System.out.println("");
	 	 System.out.print(" Enter Yor Option :");
	 	 int n=sc.nextInt();
	 	 
	 	 System.out.println("=====================================");
		
	 	 switch(n)
		{
		case 1: System.out.println("");
			    System.out.println(" Select Which BRAND OF TV YOU WANT...");
			    System.out.println("");
		        t1.tel();
		break;
		
		case 2: System.out.println("");
	            System.out.println(" Select Which BRAND OF AC YOU WANT...");
	            System.out.println("");
                ac1.AC();
		break;
		
	    case 3: System.out.println("");
	            System.out.println(" Select Which BRAND OF Iron YOU WANT...");
	            System.out.println("");
	            I1.Ir();
		break;
		
	    case 4: System.out.println("");
	            System.out.println(" Select Which BRAND OF SPEAKERS YOU WANT...");
	            System.out.println("");
                s1.spek();
        break;
	    
	    case 5: Home t5=new Home();
                 t5.H();

        break;

	    default: System.out.println("  Enter Correct Option.............");
		
		break;
			
		}

	}
}

//sub Class
class Television extends Home_Appliances
{
	
	public void tel()
	{
		
		//System.out.println("");
		System.out.println(" <1> For Samsung");
		System.out.println(" <2> For Onida" );
		System.out.println(" <3> For LG");
		System.out.println(" <4> For Sony");
		System.out.println(" <5> For MI");
		System.out.println(" <6> For main page ");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Selected SAMSUNG TV ");
		        System.out.println("");
			    e1.pass(10,"SAMSUNG TV",50000);
			    e1.getDetails();
			    System.out.println(" **Thank You For Selecting Samsung TV Product**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Select ONIDA TV ");
		        System.out.println("");
			    e1.pass(11,"ONIDA TV",78000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Onida TV Product**");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Select LG TV ");
		        System.out.println("");
			    e1.pass(12,"LG TV",89000);
				e1.getDetails();
				System.out.println(" **Thank You For Select LG TV Product**");
				System.out.println(" ");
			
	    break;
		
		case 4: System.out.println("");
			    System.out.println(" You Select SONY TV ");
		        System.out.println("");
			    e1.pass(13,"SONY TV",66000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Sony TV Product**");
				System.out.println(" ");
			
		break;
		
		case 5: System.out.println("");
		        System.out.println("You selected MI TV");
		        e1.getDetails();
		        System.out.println("**Thank You for Selecting MI TV**");
		        System.out.println("");
		        
		break;
		
		case 6: Home_Appliances h1=new 	Home_Appliances();
		          h1.HA();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
		
		break;
			
		}
		
	}
}

//Sub Class
class AC extends Home_Appliances
{
	public void AC()
	{
		System.out.println("");
		System.out.println(" <1> For Whirlpool");
		System.out.println(" <2> For Haier" );
		System.out.println(" <3> For Godrej");
		System.out.println(" <5> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
	    
	    switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Select WHIRLPOOL AC ");
		        System.out.println("");
			    e1.pass(101,"WHIRLPOOL AC",45000);
				e1.getDetails();
				System.out.println(" **Thank You For Select Whirlpool AC**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Select HAIER AC");
		        System.out.println("");
			    e1.pass(102,"HAIER AC",37900);
				e1.getDetails();
				System.out.println(" **Thank You For Select Haier AC Product**");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Select GODREJ AC ");
		        System.out.println("");
			    e1.pass(103,"GODREJ AC",34700);
				e1.getDetails();
				System.out.println(" **Thank You For Select Godrej AC Product**");
				System.out.println(" ");
			
	    break;
		
		case 5: Home_Appliances h1=new 	Home_Appliances();
		          h1.HA();
				break;

		
		default: System.out.println(" Select Correct Option...");
		
		break;
			
		}
		
	}
}

//Sub Class
class Iron extends Home_Appliances
{
	public void Ir()
	{
		System.out.println("");
		System.out.println(" <1> For Usha");
		System.out.println(" <2> For Bajaj" );
		System.out.println(" <3> For Crompton");
		System.out.println(" <5> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
	    
	    switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Select USHA Iron");
		        System.out.println("");
			    e1.pass(111,"USHA Iron",2000);
				e1.getDetails();
				System.out.println(" **Thank You For Select Usha Iron **");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Select BAJAJ Iron ");
		        System.out.println("");
			    e1.pass(112,"BAJAJ Iron",3000);
			    e1.getDetails();
				System.out.println(" ");
				System.out.println(" **Thank You For Select Bajaj Iron Product**");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Select CROMPTON Iron ");
		        System.out.println("");
		        e1.pass(113,"CROMPTON Iron",2500);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Crompton Iron Product**");
				System.out.println(" ");
			
	    break;
		
		case 5: Home_Appliances h1=new 	Home_Appliances();
		          h1.HA();
				break;

		
		default: System.out.println("PLZ Select Correct Option..........");
		
		break;
			
		}
	}
}

//Sub Class
class Speaker extends Home_Appliances
{
	private Scanner sc;

	public void spek()
	{
		System.out.println("");
		System.out.println(" <1> For JBL");
		System.out.println(" <2> For Sony" );
		System.out.println(" <3> For Bose");
		System.out.println(" <5> For main page");
		sc = new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
	    
	    switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Select JBL Speaker ");
		        System.out.println("");
			    e1.pass(22,"JBL Speaker",6000);
				e1.getDetails();
				System.out.println(" **Thank You For Select JBL Speaker **");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Select Sony Speaker ");
		        System.out.println("");
			    e1.pass(23,"Sony Speaker",3000);
			    e1.getDetails();
				System.out.println(" ");
				System.out.println(" **Thank You For Select Sony Speaker Product**");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Select Bose Speaker ");
		        System.out.println("");
		        e1.pass(24,"Bose Speaker",5500);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Bose Speaker Product**");
				System.out.println(" ");
			
	    break;
		
		case 5: Home_Appliances h1=new 	Home_Appliances();
		          h1.HA();
				break;

		
		default: System.out.println("PLZ Select Correct Option..........");
		
		break;
			
		}
		
	}
}

//Sub Class from Electronic
class Kitchen_Appliances extends Amazon
{
	Amazon e1=new Amazon();
	public void KA()
	{
		 System.out.println("");
		 System.out.println(" WELCOME TO KITCHEN APPLIANCES ");
		 System.out.println("___________");
		 System.out.println("");
		 
		 Kitchen_Appliances a=new Washing_Machine();//Upcasting
		 Washing_Machine w1= (Washing_Machine)a;//Downcasting
		 System.out.println(" <1>  For Washing Machine");
		 
		 Kitchen_Appliances a1=new Refrigerator();//Upcasting
		 Refrigerator r1= (Refrigerator)a1;//Downcasting
	     System.out.println(" <2>  For Refrizreter");
	     
	     Kitchen_Appliances a2=new Oven();//Upcasting
	     Oven o1= (Oven)a2;//Downcasting
	     System.out.println(" <3>  For Oven");
	     
	     Kitchen_Appliances a3=new Mixer();//Upcasting
	     Mixer m1= (Mixer)a3;//Downcasting
	     System.out.println(" <4>  For Mixer");
	     
	     Kitchen_Appliances a4=new Microwave();//Upcasting
	     Microwave mi= (Microwave)a4;//Downcasting
	     System.out.println(" <5>  For Microwave");
	     
	     System.out.println(" <6>  For Back To Page");
	     Scanner sc=new Scanner(System.in);
	     System.out.println("");
	 	 System.out.print(" Enter Yor Option :");
	 	 int n=sc.nextInt();
	 	 
	 	 System.out.println("=====================================");
		
	 	 switch(n)
		{
		case 1: System.out.println("");
			    System.out.println(" Select Which BRAND OF Washing Machine YOU WANT...");
			    System.out.println("");
		        w1.WM();
		break;
		
		case 2: System.out.println("");
	            System.out.println(" Select Which BRAND OF Refrizreter YOU WANT...");
	            System.out.println("");
                r1.Ref();
		break;
		
	    case 3: System.out.println("");
	            System.out.println(" Select Which BRAND OF Oven YOU WANT...");
	            System.out.println("");
	            o1.Ov();
		break;
		
	    case 4: System.out.println("");
	            System.out.println(" Select Which BRAND OF Mixer YOU WANT...");
	            System.out.println("");
                m1.Mix();
        break;
        
	    case 5: System.out.println("");
		        System.out.println(" Select Which BRAND OF Microwave YOU WANT...");
		        System.out.println("");
		        mi.Micro();
		       
        break;

	    
	    case 6: Home t5=new Home();
                 t5.H();

        break;

	    default: System.out.println("  Enter Correct Option.............");
		
		break;
			
		}
	 	 
	}
}

//Sub Class
class Washing_Machine extends Kitchen_Appliances
{
	
	public void WM()
	{
		System.out.println(" <1> For Samsung");
		System.out.println(" <2> For Whirlpool" );
		System.out.println(" <3> For LG");
		System.out.println(" <4> For Panasonic");
		System.out.println(" <5> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Select SAMSUNG Washing Machine ");
		        System.out.println("");
			    e1.pass(1,"Samsung Washing Machine",10000);
			    e1.getDetails();
			    System.out.println(" **Thank You For Select Samsung Washing Machine Product**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Select Whirlpool Washing_Machine ");
		        System.out.println("");
			    e1.pass(2,"Whirlpool Washing Machine",20000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Whirlpool Washing_Machine Product**");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Select LG Washing Machine ");
		        System.out.println("");
			    e1.pass(3,"LG Washing Machine",15000);
				e1.getDetails();
				System.out.println(" **Thank You For Select LG Washing Machine Product**");
				System.out.println(" ");
			
	    break;
		
		case 4: System.out.println("");
			    System.out.println(" You Select Panasonic Washing Machine ");
		        System.out.println("");
			    e1.pass(3,"Panasonic Washing Machine",250000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Panasonic Washing Machine Product**");
				System.out.println(" ");
			
		break;
		
		case 5: Kitchen_Appliances h1=new 	Kitchen_Appliances();
		          h1.KA();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
			
		}
		
     }
}

//Sub class
class Refrigerator extends Kitchen_Appliances
{
	public void Ref() 
	{
		System.out.println(" <1> For Godrej");
		System.out.println(" <2> For Whirlpool" );
		System.out.println(" <3> For Haire");
		System.out.println(" <4> For croma");
		System.out.println(" <5> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Select Gogrej Refrigerator ");
		        System.out.println("");
			    e1.pass(121,"Godrej Refrigerator",33000);
			    e1.getDetails();
			    System.out.println(" **Thank You For Select Gogrej Refrigerator  Product**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Select Whirlpool Refrigerator ");
		        System.out.println("");
			    e1.pass(122,"Whirlpool Refrigerator",27000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Whirlpool Refrigerator Product**");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Select Haire Refrigerator ");
		        System.out.println("");
			    e1.pass(123,"Haire Refrigerator",38000);
				e1.getDetails();
				System.out.println(" **Thank You For Select Haire Refrigerator Product**");
				System.out.println(" ");
			
	    break;
		
		case 4: System.out.println("");
			    System.out.println(" You Select croma Refrigerator ");
		        System.out.println("");
			    e1.pass(124,"croma Refrigerator",29000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select croma Refrigerator Product**");
				System.out.println(" ");
			
		break;
		
		case 5: Kitchen_Appliances h1=new 	Kitchen_Appliances();
		          h1.KA();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
			
		}
		

		
	}
}

//Sub class
class Oven extends Kitchen_Appliances
{
	public void Ov()
	{
		System.out.println(" <1> For Gogrej");
		System.out.println(" <2> For Samsung" );
		System.out.println(" <3> For Haire");
		System.out.println(" <4> For Panasonic");
		System.out.println(" <5> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Select Gogrej Oven ");
		        System.out.println("");
			    e1.pass(111,"Gogrej Oven",20000);
			    e1.getDetails();
			    System.out.println(" **Thank You For Select Gogrej Oven  Product**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Select Samsung Oven ");
		        System.out.println("");
			    e1.pass(122,"Samsung Oven ",22000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Samsung Oven Product**");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Select Haire Oven ");
		        System.out.println("");
			    e1.pass(123," Haire Oven",34000);
				e1.getDetails();
				System.out.println(" **Thank You For Select Haire Oven Product**");
				System.out.println(" ");
			
	    break;
		
		case 4: System.out.println("");
			    System.out.println(" You Select Panasonic Oven ");
		        System.out.println("");
			    e1.pass(124,"Panasonic Oven ",25000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Panasonic Oven Product**");
				System.out.println(" ");
			
		break;
		
		case 5: Kitchen_Appliances h1=new 	Kitchen_Appliances();
		          h1.KA();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
			
		}

	}
}

//Sub class
class Mixer extends Kitchen_Appliances
{
	public void Mix()
	{
		System.out.println(" <1> For Bajaj");
		System.out.println(" <2> For Havells" );
		System.out.println(" <3> For Sujata");
		System.out.println(" <4> For Eveready");
		System.out.println(" <5> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Select Bajaj Mixer ");
		        System.out.println("");
			    e1.pass(1,"Bajaj Mixer ",1200);
			    e1.getDetails();
			    System.out.println(" **Thank You For Select Bajaj Mixer  Product**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Select Havells Mixer ");
		        System.out.println("");
			    e1.pass(2,"Havells Mixer ",33000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Havells Mixer Product**");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Select Sujata Mixer ");
		        System.out.println("");
			    e1.pass(3,"Sujata Mixer ",4000);
				e1.getDetails();
				System.out.println(" **Thank You For Select Sujata Mixer Product**");
				System.out.println(" ");
			
	    break;
		
		case 4: System.out.println("");
			    System.out.println(" You Select Eveready Mixer ");
		        System.out.println("");
			    e1.pass(3,"Eveready Mixer ",5000);
			    e1.getDetails();
				System.out.println(" **Thank You For Select Eveready Mixer Product**");
				System.out.println(" ");
			
		break;
		
		case 5: Kitchen_Appliances h1=new 	Kitchen_Appliances();
		          h1.KA();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
			
		}

	}
}

class Microwave extends Kitchen_Appliances
{
	//polymorphism using method shadowing....
	//polymorphism using variable shadowing...
	//variable declaration with same name as same as parent class...
	String Capacity="16L";
	String Price="7999";
	public static void Micro() 
	{
		
		Microwave ref=new Microwave();//sub-Class
		System.out.println(" <1> For Bajaj");
		System.out.println(" <2> For Samsung" );
		System.out.println(" <5> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Select Bajaj Microwave ");
		        System.out.println("");
		        System.out.println(" Product Capacity:" +ref.Capacity);
		        System.out.println(" Product Capacity:" +ref.Price);
		        Amazon.Micro();
		        System.out.println("");
			    System.out.println(" **Thank You For Select Bajaj Mixer  Product**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Select Samsung Microwave ");
		        System.out.println("");
		        System.out.println(" Product Capacity:" +ref.Capacity);
		        System.out.println(" Product Capacity:" +ref.Price);
		        System.out.println("");
				System.out.println(" **Thank You For Select Havells Mixer Product**");
				System.out.println(" ");
		break;
		
	    case 3: Kitchen_Appliances h1=new 	Kitchen_Appliances();
		          h1.KA();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
			
		}
	}
}

//sub class from Electronic
class Mobile extends Amazon{
	Amazon e1 = new Amazon();
	public void Mb()
	{
		 System.out.println("");
		 System.out.println(" WELCOME TO Mobile Section ");
		 System.out.println("___________");
		 System.out.println("");
		 
		Mobile m=new Android();//Upcasting
		 Android ad1= (Android)m;//Downcasting
		 System.out.println(" <1>  For Android mobiles");
		 
		 Mobile m1=new Iphone();//Upcasting
		 Iphone i1= (Iphone)m1;//Downcasting
	     System.out.println(" <2>  For iPhone");
	     
	     	     
	     System.out.println(" <3>  For Back To Page");
	     Scanner sc=new Scanner(System.in);
	     System.out.println("");
	 	 System.out.print(" Enter Yor Option :");
	 	 int n=sc.nextInt();
	 	System.out.println("=====================================");
		
	 	 switch(n)
		{
		case 1: System.out.println("");
			    System.out.println(" Select Which BRAND OF Android Mobile YOU WANT...");
			    System.out.println("");
		        ad1.An();
		break;
		
		case 2: System.out.println("");
	            System.out.println(" Select Which BRAND OF Refrizreter YOU WANT...");
	            System.out.println("");
               i1.Ip();
		break;
			    	        
	    case 3: Home t5=new Home();
                t5.H();

       break;

	    default: System.out.println("  Enter Correct Option.............");
		
		break;
		}	
	}
}

class Android extends Mobile{
	public void An() 
	{
		System.out.println(" <1> For Samsung");
		System.out.println(" <2> For Redmi" );
		System.out.println(" <3> For ONEPLUS");
		System.out.println(" <4> For realme");
		System.out.println(" <5> For OPPO");
		System.out.println(" <6> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Selected SAMSUNG  Mobile ");
		        System.out.println("");
			    e1.pass(1,"Samsung Washing Machine",12000);
			    e1.getDetails();
			    System.out.println(" **Thank You For Selecting Samsung mobile**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Selected Redmi Mobile ");
		        System.out.println("");
			    e1.pass(2,"Redmi Mobile",20000);
			    e1.getDetails();
				System.out.println(" **Thank You For Selecting Redmi Mobile**");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Selected ONEPLUS Mobile ");
		        System.out.println("");
			    e1.pass(3,"ONEPLUS Mobile",15000);
				e1.getDetails();
				System.out.println(" **Thank You For Selecting ONEPLUS Mobile**");
				System.out.println(" ");
			
	    break;
		
		case 4: System.out.println("");
			    System.out.println(" You Selected realme Mobile");
		        System.out.println("");
			    e1.pass(4,"realme mobile",25000);
			    e1.getDetails();
				System.out.println(" **Thank You For Selecting realme mobile**");
				System.out.println(" ");
			
		break;
		
		case 5: Mobile m=new Mobile();
		          m.Mb();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
			
	}
}
}

class Iphone extends Mobile{
	public void Ip() 
	{
		System.out.println(" <1> For Apple iPhone 12 Black");
		System.out.println(" <2> For Apple iPhone 12 Blue" );
		System.out.println(" <3> For Apple iPhone 12 Purple ");
		System.out.println(" <4> For Apple iPhone 13 Black");
		System.out.println(" <5> For Apple iPhone 13 Blue");
		System.out.println(" <6> For Apple iPhone 13 Purple");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Selected iPhone 12 Black ");
		        System.out.println("");
			    e1.pass(1,"iPhone 12 Black",55900);
			    e1.getDetails();
			    System.out.println(" **Thank You For Selecting iPhone 12 Black**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Selected iPhone 12 Blue ");
		        System.out.println("");
			    e1.pass(2,"iPhone 12 Blue",55900);
			    e1.getDetails();
				System.out.println(" **Thank You For Selecting iPhone 12 Blue **");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Selected iPhone 12 Purple ");
		        System.out.println("");
			    e1.pass(3,"iPhone 12 Purple",49900);
				e1.getDetails();
				System.out.println(" **Thank You For Selecting iPhone 12 Purple**");
				System.out.println(" ");
			
	    break;
		
		case 4: System.out.println("");
			    System.out.println(" You Selected iPhone 13 Black ");
		        System.out.println("");
			    e1.pass(4,"iPhone 13 Black",69499);
			    e1.getDetails();
				System.out.println(" **Thank You For Selecting iPhone 13 Black**");
				System.out.println(" ");
			
		break;
		
		case 5: System.out.println("");
	    System.out.println(" You Selected iPhone 13 Blue ");
        System.out.println("");
	    e1.pass(5,"iPhone 13 Blue",69499);
	    e1.getDetails();
		System.out.println(" **Thank You For Selecting iPhone 13 Blue**");
		System.out.println(" ");
	
        break;

		case 6: System.out.println("");
	            System.out.println(" You Selected iPhone 13 Blue ");
                System.out.println("");
	            e1.pass(6,"iPhone 13 Blue",69499);
	            e1.getDetails();
		        System.out.println(" **Thank You For Selecting iPhone 13 Blue**");
		        System.out.println(" ");
	
        break;

		
		case 7: Mobile m=new Mobile();
		          m.Mb();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
			
	}
}
}


class Fashion extends Amazon{
	Amazon e1 = new Amazon();
	public void Fs()
	{
		 System.out.println("");
		 System.out.println(" WELCOME TO Fashion Section ");
		 System.out.println("___________");
		 System.out.println("");
		 
		Fashion f=new Men();//Upcasting
		 Men me= (Men)f;//Downcasting
		 System.out.println(" <1>  For Men");
		 
		 Fashion f1=new Women();//Upcasting
		 Women w1= (Women)f1;//Downcasting
	     System.out.println(" <2>  For Women");
	     
	     	     
	     System.out.println(" <3>  For Back To Page");
	     Scanner sc=new Scanner(System.in);
	     System.out.println("");
	 	 System.out.print(" Enter Yor Option :");
	 	 int n=sc.nextInt();
	 	System.out.println("=====================================");
		
	 	 switch(n)
		{
		case 1: System.out.println("");
			    System.out.println(" Select Which BRAND OF Clothes YOU WANT...");
			    System.out.println("");
		        me.Me();
		break;
		
		case 2: System.out.println("");
	            System.out.println(" Select Which BRAND OF Refrizreter YOU WANT...");
	            System.out.println("");
               w1.Wo();
		break;
			    	        
	    case 3: Home t5=new Home();
                t5.H();

       break;

	    default: System.out.println("  Enter Correct Option.............");
		
		break;
		}	
	}
}

class Men extends Fashion
{
	public void Me() {
		System.out.println(" <1> For T-Shirts & Polos ");
		System.out.println(" <2> For Shirts " );
		System.out.println(" <3> For Jeans ");
		System.out.println(" <4> For Suits & Blazers");
		System.out.println(" <5> For Ethnic Wear");
		System.out.println(" <6> For Shorts");
		System.out.println(" <7> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Selected T-Shirts & Polos  ");
		        System.out.println("");
			    e1.pass(1,"Western Wear",3900);
			    e1.getDetails();
			    System.out.println(" **Thank You For Selecting T-Shirts & Polos**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Selected Shirts ");
		        System.out.println("");
			    e1.pass(2,"Shirts",1900);
			    e1.getDetails();
				System.out.println(" **Thank You For Selecting Shirts **");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Selected Jeans ");
		        System.out.println("");
			    e1.pass(3,"Jeans",2900);
				e1.getDetails();
				System.out.println(" **Thank You For Selecting Jeans**");
				System.out.println(" ");
			
	    break;
		
		case 4: System.out.println("");
			    System.out.println(" You Selected Suits & Blazers ");
		        System.out.println("");
			    e1.pass(4,"Suits & Blazers",8499);
			    e1.getDetails();
				System.out.println(" **Thank You For Selecting Suits & Blazers**");
				System.out.println(" ");
			
		break;
		
		case 5: System.out.println("");
	    System.out.println(" You Selected Ethnic Wear ");
        System.out.println("");
	    e1.pass(5,"Ethnic Wear",5499);
	    e1.getDetails();
		System.out.println(" **Thank You For Selecting Ethnic Wear**");
		System.out.println(" ");
	
        break;

		case 6: System.out.println("");
	            System.out.println(" You Selected Shorts ");
                System.out.println("");
	            e1.pass(6,"Shorts",499);
	            e1.getDetails();
		        System.out.println(" **Thank You For Selecting Shorts**");
		        System.out.println(" ");
	
        break;

		
		case 7: Fashion f=new Fashion();
		          f.Fs();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
			
	}
	}
}

class Women extends Fashion
{ 
	
	public void Wo() {
		System.out.println(" <1> For Western Wear");
		System.out.println(" <2> For Ethnic Wear" );
		System.out.println(" <3> For Jeans ");
		System.out.println(" <4> For Maternity");
		System.out.println(" <5> For Accessories");
		System.out.println(" <6> For Shorts");
		System.out.println(" <7> For main page");
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.print(" Enter Your Option :");
	    int a=sc.nextInt();
	    
	    System.out.println("=====================================");
		switch(a)
		{
		case 1: System.out.println("");
			    System.out.println(" You Selected Western Wear ");
		        System.out.println("");
			    e1.pass(1,"Western Wear",3900);
			    e1.getDetails();
			    System.out.println(" **Thank You For Selecting Western Wear**");
				System.out.println(" ");

		break;
				
		case 2:	System.out.println("");
			    System.out.println(" You Selected Ethnic Wear ");
		        System.out.println("");
			    e1.pass(2,"Ethnic Wear",2900);
			    e1.getDetails();
				System.out.println(" **Thank You For Ethnic Wear **");
				System.out.println(" ");
		break;
		
		case 3:	System.out.println("");
			    System.out.println(" You Selected Jeans ");
		        System.out.println("");
			    e1.pass(3,"Jeans",2900);
				e1.getDetails();
				System.out.println(" **Thank You For Selecting Jeans**");
				System.out.println(" ");
			
	    break;
		
		case 4: System.out.println("");
			    System.out.println(" You Selected Maternity ");
		        System.out.println("");
			    e1.pass(4,"Maternity",1499);
			    e1.getDetails();
				System.out.println(" **Thank You For Selecting Maternity clothes**");
				System.out.println(" ");
			
		break;
		
		case 5: System.out.println("");
	    System.out.println(" You Selected Accessories ");
        System.out.println("");
	    e1.pass(5,"Accessories",5499);
	    e1.getDetails();
		System.out.println(" **Thank You For Selecting Accessories**");
		System.out.println(" ");
	
        break;

		case 6: System.out.println("");
	            System.out.println(" You Selected Shorts ");
                System.out.println("");
	            e1.pass(6,"Shorts",499);
	            e1.getDetails();
		        System.out.println(" **Thank You For Selecting Shorts**");
		        System.out.println(" ");
	
        break;

		
		case 7: Fashion f=new Fashion();
		          f.Fs();
				break;

		
		default: System.out.println(" PLZ Select Correct Option...");
			
	}
	}
}




class Home
{ 
	public void H()
	{
	       System.out.println("");
	       System.out.println(" SELECT YOUR FAVIOURATE OPTION...");
	       System.out.println("");
	       System.out.println(" <1> select  Home Appliances");
	       System.out.println("");
	       System.out.println(" <2> select  Kitchen Appliances");
	       System.out.println("");
	       System.out.println(" <3> select  Mobile");
	       System.out.println("");
	       System.out.println(" <4> select  Fashion");
	       System.out.println("");
	       Scanner sc3=new Scanner(System.in);
	       System.out.print(" Enter Your Option :");
	       int a=sc3.nextInt();
	       
	       System.out.println("=====================================");
	       System.out.println("");
	       
	       switch(a)
	       {
	              case 1: Home_Appliances h1=new Home_Appliances();
	                       h1.HA();
	              break;
	            	  
	              case 2: Kitchen_Appliances h2=new Kitchen_Appliances();
                           h2.KA();
       	          break;
       	          
	              case 3: Mobile h3 = new Mobile();
	                      h3.Mb();
	                      
       	          break;
       	          
	              case 4: Fashion h4 = new Fashion();
       	                  h4.Fs();
       	                  
       	          break;
       	          
       	          
	              default: System.out.println(" invalid Option");
	             
	              break;
	       }
	       
	   }
}
 

 
//Driver Class
public class Customer 
{
    public static void main(String [] args)
	{
			Home h=new Home();
			h.H();
		  
		   System.out.println("============================================");
		   System.out.println("");
	       System.out.println(" Would you like to visit 1)Yes / 2)No");
	       System.out.println(" ");
	       Scanner sc3=new Scanner(System.in);
	    		   int n2 = sc3.nextInt();
	       if(n2==1)
	       {
	       	 Home h1=new Home();
	       	 h1.H();
	       }
	       else if(n2==2)
	       {
	       	System.out.println(" Thank you visit again AMAZON....!!!!!!");
	       	
	       }} 
	
	
	static 
	{
		
		
		  System.out.println("");
		  System.out.println("<------------------------------------------------------>");
		  System.out.println("      *WELCOME TO AMAZON*    ");
		  System.out.println("<------------------------------------------------------>");
		  
		  System.out.println("");
	      System.out.println(" ___USER LOGIN____");
	      System.out.println("");
	      Scanner sc1=new Scanner(System.in);
	      System.out.print(" ENTER YOUR USERNAME:");
	       //System.out.print("--------------------");
	      String s=sc1.next();
	       
	      System.out.println("");
	       
	      Scanner sc2=new Scanner(System.in);
	      System.out.print(" ENTER YOUR PASSWORD:");
	      // System.out.print("---------------------");
	      String s1=sc2.next();
	       
	      System.out.println("");
	       if(s.equals("shivani")&& (s1.equals("pass123")))
	       {
	    	   System.out.println(" YOUR LOGIN SUCCESSFULLY..!!");
	    	   System.out.println("");
	       }
	      else
	      {
	    	 System.out.println(" INVALID USERNAME AND PASSWORD..");
	    	  System.out.println("");
	       }
	       
	       System.out.println("=====================================");
		
		     
	}

}
