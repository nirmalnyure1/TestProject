import java.sql.*;

public class Class2
{ 
	 
	public static void main(String []args) 
	{
		//try {
		//String driverClass="com.mysql.cj.Driver";
		String url="jdbc:mysql://localhost:3306/nirmalnyure";
		String uname="root";
		String pass="";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn=DriverManager.getConnection(url,uname,pass);
		System.out.println("Database Connection Success!");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("Database connection failed");
			e.printStackTrace();
			
		}
		
		}
}