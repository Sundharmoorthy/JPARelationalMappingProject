package com.Project.SpringJpaMappingApplication.DTO;


import com.Project.SpringJpaMappingApplication.Model.Department;

public class EmployeeDTO {
    private Long id;
    private String name;
    private Double salary;
    private Department department;


    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String name, Double salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

