package com.learn.java.labs;
import java.util.Scanner;
class Employee {
    private String name;
    private int age;
    private int salary;
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(" ", 123, 0);
        if (emp1.name == " ")
            System.out.println("Name can't be blank");
        if (emp1.age > 120)
            System.out.println("Age can't be more than 120");
        if (emp1.salary < 0)
            System.out.println("Salary can't be negative");
        System.out.println(emp1.toString());
    }
}

