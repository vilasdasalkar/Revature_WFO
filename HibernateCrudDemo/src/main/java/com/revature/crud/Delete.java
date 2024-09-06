package com.revature.crud;



import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;


import com.revature.session.SessionFactoryProvider;

import beans.Student;

 
  
public class Delete { 
    public static void main(String[] args) 
    { 
        SessionFactory sessionFactory=SessionFactoryProvider.provideSessionFactory(); 
        Session session=sessionFactory.openSession(); 
        Transaction t=session.beginTransaction(); 
          
        Student s=session.get(Student.class, 101); 
        session.delete(s); 
        t.commit(); 
          
        sessionFactory.close(); 
    } 
} 
