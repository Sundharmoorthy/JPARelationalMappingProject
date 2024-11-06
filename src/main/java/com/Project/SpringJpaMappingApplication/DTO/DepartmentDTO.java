package com.Project.SpringJpaMappingApplication.DTO;


import java.time.LocalDateTime;
import java.util.List;

public class DepartmentDTO {
    private Long id;
    private String name;
    private List<EmployeeDTO> employees;
    private LocalDateTime createdAt;

    public DepartmentDTO() {
    }

    public DepartmentDTO(Long id, String name, List<EmployeeDTO> employees, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.employees = employees;
        this.createdAt = createdAt;
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

    public List<EmployeeDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDTO> employees) {
        this.employees = employees;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
