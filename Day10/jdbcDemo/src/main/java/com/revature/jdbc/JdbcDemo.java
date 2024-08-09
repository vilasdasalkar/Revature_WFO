package com.revature.jdbc;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcDemo {
	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter url");
	String url=sc.nextLine();
	

	System.out.println("enter user name");
	String uname=sc.nextLine();
	

	System.out.println("enter url");
	String pwd=sc.next();
	
	
	Connection con=null;
	Statement statement=null;
	ResultSet resultSet=null;
    
	//String url="jdbc:mysql://localhost:3306/revainfo";
	//String uname="root";
	//String pwd="root";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,uname,pwd);
		
		statement=con.createStatement();
		String sql1="select * from revature_emp";
		
		resultSet=statement.executeQuery(sql1);
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" , "+resultSet.getString(2)+" , "+resultSet.getInt(3)+" , "+resultSet.getInt(4));
		}
		resultSet.close();
		statement.close();
		
		
	}
	catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
	}
}
}
