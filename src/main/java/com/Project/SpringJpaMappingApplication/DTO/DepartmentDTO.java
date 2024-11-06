package com.Project.SpringJpaMappingApplication.DTO;


import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

public class DepartmentDTO {
    private Long id;
    private String name;
    private List<EmployeeDTO> employees;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    public DepartmentDTO() {
    }

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Long id, String name, List<EmployeeDTO> employees) {
        this.id = id;
        this.name = name;
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

    public List<EmployeeDTO> getEmployees() {
        return employees;
    }

    public void setEmployees (List<EmployeeDTO> employees)  {
        this.employees = employees;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
