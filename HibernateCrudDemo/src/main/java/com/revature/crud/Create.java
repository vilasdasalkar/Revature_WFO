package com.revature.crud;

import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;


import com.revature.session.*;

import beans.Student; 
  
public class Create { 
    public static void main(String[] args) 
    { 
        SessionFactory sessionFactory=SessionFactoryProvider.provideSessionFactory(); 
        Session session=sessionFactory.openSession(); 
        Transaction t=session.beginTransaction(); 
          
        Student s=new Student(102,"yyy",12); 
        session.save(s); 
        t.commit(); 
          
        sessionFactory.close(); 
    } 
} 