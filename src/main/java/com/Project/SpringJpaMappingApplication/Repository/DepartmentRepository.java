package com.Project.SpringJpaMappingApplication.Repository;

import com.Project.SpringJpaMappingApplication.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
