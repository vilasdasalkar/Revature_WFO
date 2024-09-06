package com.revature.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.revature.utils.HibernateUtils;

public class HQLExample {

    public static void main(String[] args) {
        // Insert test data into the database
        insertTestData();

        // SELECT Query
        String hql = "FROM Student";
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<Student> students = session.createQuery(hql, Student.class).getResultList();
        students.forEach(System.out::println);
        session.close();

        // WHERE Clause - Using positional parameter
        hql = "FROM Student S WHERE S.firstName = ?1"; // positional parameter
        session = HibernateUtils.getSessionFactory().openSession();
        Query<Student> query = session.createQuery(hql, Student.class);
        query.setParameter(1, "Shrey");
        students = query.getResultList();
        students.forEach(System.out::println);
        session.close();

        // ORDER BY Clause
        hql = "FROM Student S ORDER BY S.lastName ASC";
        session = HibernateUtils.getSessionFactory().openSession();
        students = session.createQuery(hql, Student.class).getResultList();
        students.forEach(System.out::println);
        session.close();

        // Aggregate function: COUNT
        hql = "SELECT COUNT(S.id) FROM Student S";
        session = HibernateUtils.getSessionFactory().openSession();
        Long count = (Long) session.createQuery(hql).getSingleResult();
        System.out.println("Total Students: " + count);
        session.close();

        // Group By and Having Clause
        hql = "SELECT S.lastName, COUNT(S.id) FROM Student S GROUP BY S.lastName HAVING COUNT(S.id) > 1";
        session = HibernateUtils.getSessionFactory().openSession();
        List<Object[]> results = session.createQuery(hql).getResultList();
        for (Object[] result : results) {
            System.out.println("Last Name: " + result[0] + ", Count: " + result[1]);
        }
        session.close();
    }

    // Method to insert test data into the Student table
    private static void insertTestData() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();

        Student student1 = new Student("John", "Doe", "john.doe@example.com");
        Student student2 = new Student("Shrey", "Patel", "shrey.patel@example.com");
        Student student3 = new Student("Jane", "Doe", "jane.doe@example.com");

        session.save(student1);
        session.save(student2);
        session.save(student3);

        session.getTransaction().commit();
        session.close();
    }
}
