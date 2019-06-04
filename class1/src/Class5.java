import java.util.Scanner;

import java.sql.*;
public class Class5 {
	
	public static void main(String []args)
	
	
	{
		
		try {
			
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/csitfourth","root","");
		Statement st=cn.createStatement();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter rollno which data you want to delete");
		int rl=sc.nextInt();
		sc.nextLine();
		String sql="delete from student where rollno='"+rl+"'";
		st.executeUpdate(sql);
		
		}
		
		
		catch( ClassNotFoundException| SQLException e)
		{ System.out.println("database connection failed");
		 e.printStackTrace();
		}
		
  }

}
