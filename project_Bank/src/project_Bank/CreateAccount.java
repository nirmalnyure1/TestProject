package project_Bank;
import java.sql.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateAccount {

	public void account() {
			try	 {
		
		
	//GetInfo obj1=new GetInfo();
	//obj1.info();
		Scanner sc =new Scanner(System.in);
		 
			 
			Class.forName("com.mysql.jdbc.Driver");
			 
	 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankproject","root","");
			 //System.out.println("Database Connection Success!");
			 Statement stat= cn.createStatement();
			System.out.println("fill your information to create your account\n");
		
			
		
			
			//catch(Exception e){ System.out.println("cpatital"); }
			System.out.println("enter account number"); 
			 String an=sc.nextLine();
			
			Date date=new Date(10);
			
			 System.out.println("enter the first name of user");
			 String fn=sc.nextLine();
			 System.out.println("enter the last name of the user");
			 String ln=sc.nextLine();
			 System.out.println("enter your pin");
			 String p=sc.nextLine();
			 
			 System.out.println("enter phone number");
			 String pn=sc.nextLine();
			 System.out.println("occupation");
			 String o=sc.nextLine();
			 System.out.println("enter citizenship number");
			 String cno=sc.nextLine();
			 System.out.println("gender");
			 String g=sc.nextLine();
			 System.out.println("marital status");
			 String ms=sc.nextLine();
			 
			 
			 
			 String sql="INSERT INTO getdata(acnumber,fname,lname,pin,pnumber,occupation,citizenshipnumber,gender,maritalstatus) VALUES "
			 		+ "('"+an+"' ,'"+fn+"','"+ln+"','"+p+"','"+pn+"','"+o+"','"+cno+"','"+g+"','"+ms+"')";			 
		     stat.executeUpdate(sql);
		     System.out.println("your account  is created ");
		     
			
	 }
		catch (ClassNotFoundException |SQLException e) {
			 System.out.println("invalid infromation \n");
			// e.printStackTrace();
		}
	}}