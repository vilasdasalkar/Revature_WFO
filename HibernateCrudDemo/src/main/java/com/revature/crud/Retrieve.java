package com.revature.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.revature.session.SessionFactoryProvider;

import beans.Student;

public class Retrieve { 
    public static void main(String[] args) 
    { 
        SessionFactory sessionFactory=SessionFactoryProvider.provideSessionFactory(); 
        Session session=sessionFactory.openSession(); 
          
        Student s=session.get(Student.class, 101); 
        System.out.println("Id : "+s.getId()); 
        System.out.println("Name : "+s.getName()); 
        System.out.println("Class : "+s.getStd()); 
          
        sessionFactory.close(); 
    } 
  
}