package com.Project.SpringJpaMappingApplication.Mapper;


import com.Project.SpringJpaMappingApplication.DTO.EmployeeDTO;
import com.Project.SpringJpaMappingApplication.Model.Employee;

public class EmployeeMapper {

    public static EmployeeDTO toDTO(Employee employee) {
        return new EmployeeDTO(employee.getId(), employee.getName(), employee.getSalary(), employee.getDepartment());
    }

    public static Employee toEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employee.getId());
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employee.setDepartment(employeeDTO.getDepartment());
        return employee;
    }
}
