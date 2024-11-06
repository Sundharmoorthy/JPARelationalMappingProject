package com.Project.SpringJpaMappingApplication.Service;


import com.Project.SpringJpaMappingApplication.DTO.DepartmentDTO;
import com.Project.SpringJpaMappingApplication.Mapper.DepartmentMapper;
import com.Project.SpringJpaMappingApplication.Model.Department;
import com.Project.SpringJpaMappingApplication.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentDTO> getAllDepartments() {
        return departmentRepository.findAll().stream()
                .map(DepartmentMapper::toDTO)
                .collect(Collectors.toList());
    }

    public DepartmentDTO getDepartmentById(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department not found"));
        return DepartmentMapper.toDTO(department);
    }

    public DepartmentDTO createDepartmentDTO(DepartmentDTO departmentDTO) {
        Department department = DepartmentMapper.toEntity(departmentDTO);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.toDTO(savedDepartment);
    }

    public DepartmentDTO updateDepartment(Long id, DepartmentDTO departmentDTO) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department not found"));
        department.setName(departmentDTO.getName());
        // Update other fields as needed
        Department updatedDepartment = departmentRepository.save(department);
        return DepartmentMapper.toDTO(updatedDepartment);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}

// service layer for all the fields in department
//    public Object createDepartment(Department department) {
//        Department depart = new Department(department.getId(), department.getName(), department.getCreatedAt(),department.getEmployees());
//        return departmentRepository.save(depart);
//    }

