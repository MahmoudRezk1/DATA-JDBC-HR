package com.globalhr.datajdbchrproject.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "employees")
public class Employee {
    @Id
    @Column("id")
    private Integer employeeID;
    @Column("name")
    private String name;
    @Column("salary")
    private Double salary;

    public Employee() {
    }

    public Employee(Integer employeeID, String name, Double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }
    public Employee( String name, Double salary) {

        this.name = name;
        this.salary = salary;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
