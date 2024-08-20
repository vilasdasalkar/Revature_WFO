package com.revature.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return "{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
}

public class EmployeeSortDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Vilas", 5569));
        employees.add(new Employee(1, "Abhijeet", 7000));
        employees.add(new Employee(2, "Pratik", 7000));
        employees.add(new Employee(4, "Shubham", 6000));

        Collections.sort(employees);

        employees.sort(new SortById());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

