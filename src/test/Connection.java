package test;

import java.sql.DriverManager;

public class Connection {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/teste","root","");
		System.out.println(connection.getMetaData().getDriverName());
		
	}
	
}
