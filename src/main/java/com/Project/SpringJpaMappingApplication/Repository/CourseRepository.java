package com.Project.SpringJpaMappingApplication.Repository;

import com.Project.SpringJpaMappingApplication.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
