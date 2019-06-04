import java.util.Scanner;
import java.sql.*;


public class Class3 {
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		 try {
			 
			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/csitfourth","root","");
			 System.out.println("Database Connection Success!");
			 
			 Statement stat= cn.createStatement();
			 System.out.println("enter the rollno of the student");
			 String rol=sc.nextLine();
			 System.out.println("enter the first name of the student");
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
			 String sql="INSERT INTO student(rollno,first_name,last_name,gender,course,address,semester) VALUES "
			 		+ "('"+rol+"' ,'"+fn+"','"+ln+"','"+g+"','"+c+"','"+add+"','"+sem+"')";			 
		     stat.executeUpdate(sql);
		 
		 }
		 catch (ClassNotFoundException | SQLException e) {
			 System.out.println("database connection failed");
			 e.printStackTrace();
			 
		 }
	}
}