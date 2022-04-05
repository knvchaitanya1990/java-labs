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

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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
        Employee emp1 = new Employee();
        try{
            System.out.println("Please enter Employee Details (name,age,salary)");
            // Using Scanner for Getting Input from User
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            if(name.isEmpty())
                System.out.println("Name can't be blank");
            else
                emp1.setName(name);
            int age = in.nextInt();
            if(!(age>0) || (age > 120))
                System.out.println("Age Should be in between 0 & 120");
            else
                emp1.setAge(age);
            int sal = in.nextInt();
            if(!(sal>0))
                System.out.println("Salary must be more than Zero");
            else
                emp1.setSalary(sal);
            System.out.println(emp1.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

