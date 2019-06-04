
import java.util.Scanner;
import java.sql.*;


public class Class1 {
	public static void main(String[] args)
	{
		 try {
			 Scanner sc =new Scanner(System.in);
			 int rol=sc.nextInt();
			 sc.nextLine();
			 String fn=sc.nextLine();
			 String ln=sc.nextLine();
			 char g=sc.nextLine().charAt(0);
			 String c=sc.nextLine();
			 String add=sc.nextLine();
			 String sem=sc.nextLine();
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/csitfourth","root","");
			 System.out.println("Database Connection Success!");
			 
			 Statement stat= cn.createStatement();
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