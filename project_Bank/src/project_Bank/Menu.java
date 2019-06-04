package project_Bank;

import java.util.Scanner;



public class Menu {
   public static void main(String [] args) { 
	 System.out.println("\t\t______________________________________________________");
	 System.out.println("\t\t|-----||||    WELLCOME TO BANKING SYSTEM  ||||-------|");
	 System.out.println("\t\t|____________________________________________________|");
	   int menu;
	
	
	   
	  do {
	     System.out.println("\t\t\t\t***SELECT THE OPTION***");
	   System.out.println("1. To go to Bank enter 1 \t2.To go to ATM enter 2\t 3.To exit enter 3");
	   Scanner sc=new Scanner(System.in);
	    menu=sc.nextInt();
	  switch(menu) 
	  {   case 1:
		  System.out.println("");
		  Bank obj=new Bank();
		  obj.banke();
		  

		
		  
		 
			 System.out.println("\t\t***THANK YOU  FOR USING OUR BANKING SERVICE*** \n\n");
			 
		 
		 break;
	   
	  
	  
	  case 2:
		
		  Atm obj3=new Atm();
		  obj3.at();
		  
		  System.out.println("\n\n\t\t***THANK YOU  FOR USING OUR ATM SERVICE*** \n\n");
		 
	  break;
	  
	  
	  case 3:
		 System.exit(0);
		  
		  
		  
		  default:
			  System.out.println("invalid input");
			  break;
			  
	  
	  }
	  
	  }while(menu!=3);
   }

   
}

