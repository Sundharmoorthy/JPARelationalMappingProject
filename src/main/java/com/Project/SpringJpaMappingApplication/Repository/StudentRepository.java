package com.Project.SpringJpaMappingApplication.Repository;

import com.Project.SpringJpaMappingApplication.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
