package com.Project.SpringJpaMappingApplication.Mapper;


import com.Project.SpringJpaMappingApplication.DTO.DepartmentDTO;
import com.Project.SpringJpaMappingApplication.Model.Department;

public class DepartmentMapper {

    // Convert Department entity to DepartmentDTO
    public static DepartmentDTO toDTO(Department department) {
        if (department == null) {
            return null;
        }

        DepartmentDTO dto = new DepartmentDTO();
        dto.setId(department.getId());
        dto.setName(department.getName());
        // Map other fields as needed, but not sensitive ones
        return dto;
    }

    // Convert DepartmentDTO to Department entity
    public static Department toEntity(DepartmentDTO dto) {
        if (dto == null) {
            return null;
        }

        Department department = new Department();
        department.setId(dto.getId());
        department.setName(dto.getName());
        // Map other fields as needed
        return department;
    }
}
