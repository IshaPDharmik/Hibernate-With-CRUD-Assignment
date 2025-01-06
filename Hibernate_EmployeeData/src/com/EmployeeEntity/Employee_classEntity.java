package com.EmployeeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Class")
public class Employee_classEntity {

    // field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int salary;
    
    @Column(name="Employee_name")
    private String name;
    private String department;
    private int age;

    // No-arg constructor
    public Employee_classEntity() {
    }

    // Arg constructor 
    public Employee_classEntity(int salary, String name, String department, int age) {
        super();
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter methods 
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method 
    @Override
    public String toString() {
        return "Employee_classEntity [id=" + id + ", salary=" + salary + ", name=" + name + ", department=" + department + ", age=" + age + "]";
    }
}
