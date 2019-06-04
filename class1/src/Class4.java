import java.util.Scanner;
import java.sql.*;

public class Class4 {
	public static void main(String[] args)
	{
		 try {
			 Scanner sc =new Scanner(System.in);
			
			System.out.println("enter id of name which you want to update");
		    String rol=sc.nextLine();
			 System.out.println("enter the data  for update");
			 
			 System.out.println("enter the first_name ");
			 String fn=sc.nextLine();
			 
			 System.out.println("enter the last name of the student");
			 String ln=sc.nextLine();
			 System.out.println("gender  of the student");
			 char g=sc.nextLine().charAt(0);
			 System.out.println("course of the student");
			 String c=sc.nextLine();
			 System.out.println("enter address of the student");
			 String add=sc.nextLine();
			 System.out.println("semester of the student");
			 String sem=sc.nextLine();
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/csitfourth","root","");
			 System.out.println("Database Connection Success!");
			 
			 Statement stat= cn.createStatement();
			 
			 String sql="Update student set first_name='"+fn+"' ,last_name='"+ln+"', gender='"+g+"', course='"+c+"',address='"+add+"',semester='"+sem+"' where rollno ='"+rol+"'";
		      stat.executeUpdate(sql);
		 
		 }
		 catch (ClassNotFoundException | SQLException e) {
			 System.out.println("database connection failed");
			 e.printStackTrace();
			 
		 }
	}
}