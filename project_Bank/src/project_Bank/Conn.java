package project_Bank;

//import java.sql.DriverManager;
import java.sql.*;

public class Conn {
	public void connection()throws Exception
	{
	
		String url="jdbc:mysql://localhost:3306/bankproject";
		String name="root";
		String pass="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url,name,pass);
		Statement stat=cn.createStatement();
		
	

}
}