package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url="jdbc:mysql://localhost:3306/revainfo";
    	String uname="root";
    	String pwd="root";

        Connection con = null;
        Statement statement = null;

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, uname, pwd);

           
            statement = con.createStatement();

            System.out.println("Enter employee ID:");
            int empId = sc.nextInt();

            sc.nextLine(); 

            System.out.println("Enter employee name:");
            String empName = sc.nextLine();

            System.out.println("Enter employee salary:");
            int empSalary = sc.nextInt();

            System.out.println("Enter employee age:");
            int empAge = sc.nextInt();

          
            String sqlInsert = "INSERT INTO revature_emp (emp_id, emp_name, salary, age) VALUES (" 
                               + empId + ", '" 
                               + empName + "', " 
                               + empSalary + ", " 
                               + empAge + ")";

      
            int rowsInserted = statement.executeUpdate(sqlInsert);
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully in table that created by vilas");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
        }
    }

