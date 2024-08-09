package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc_PreparedStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url="jdbc:mysql://localhost:3306/revainfo";
    	String uname="root";
    	String pwd="root";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            con = DriverManager.getConnection(url, uname, pwd);

           
            System.out.println("Enter employee ID to update:");
            int empId = sc.nextInt();

            sc.nextLine(); 

            System.out.println("Enter new salary:");
            int newSalary = sc.nextInt();

            String sqlUpdate = "UPDATE revature_emp SET salary = ? WHERE emp_id = ?";
            pstmt = con.prepareStatement(sqlUpdate);
            pstmt.setInt(1, newSalary);
            pstmt.setInt(2, empId);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee's salary updated successfully!");
            }

            pstmt.close(); 
            

            // DELETE operation
            System.out.println("Enter employee age to delete:");
            int deleteAge = sc.nextInt();

            String sqlDelete = "DELETE FROM revature_emp WHERE age = ?";
            pstmt = con.prepareStatement(sqlDelete);
            pstmt.setInt(1, deleteAge);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully!");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
        
    }
}
