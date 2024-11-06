package com.Project.SpringJpaMappingApplication.Model;

import com.Project.SpringJpaMappingApplication.DTO.EmployeeDTO;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department() {
    }

    public Department(Long id, String name, LocalDateTime createdAt, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.employees = employees;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}

