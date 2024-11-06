package com.Project.SpringJpaMappingApplication.Repository;

import com.Project.SpringJpaMappingApplication.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
