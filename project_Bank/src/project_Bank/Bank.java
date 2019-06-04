package project_Bank;
import java.util.Scanner;

class Bank {
	public void banke()
	
	{
	 
	
		Scanner s=new Scanner(System.in);
		 System.out.println("\t\t_________________________________________________________");
		 System.out.println("\t\t|-----||||    WELLCOME TO OUT BANKING SERVICE ||||-------|");
		 System.out.println("\t\t|________________________________________________________|");
		System.out.println("\t\t\t\t***SELECT THE OPTION***");
		System.out.println("1.for create account inter 1  \t2.for deposit enter 2\t3. for go back enter 3.");
		int option=s.nextInt();
		switch(option)
		{
		case 1:
		CreateAccount oj=new CreateAccount()	;
		oj.account();
			break;
		case 2:
			Deposit o=new Deposit();
			o.deposit1();
		break;
		case 3:
		break;

		}
		
	 
	}}	 
	 

