package com.Project.SpringJpaMappingApplication.Mapper;


import com.Project.SpringJpaMappingApplication.DTO.CourseDTO;
import com.Project.SpringJpaMappingApplication.Model.Course;

public class CourseMapper {

    public static CourseDTO toDTO(Course course) {
        return new CourseDTO(course.getId(), course.getTitle(),course.getStudents());
    }

    public static Course toEntity(CourseDTO courseDTO) {
        Course course = new Course();
        course.setTitle(courseDTO.getTitle());
        return course;
    }
}
