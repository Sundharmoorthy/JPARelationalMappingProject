package com.Project.SpringJpaMappingApplication.DTO;

import com.Project.SpringJpaMappingApplication.Model.Course;

import java.util.List;

public class StudentDTO {
    private Long id;
    private String name;
    private List<Course> courses; // Many-to-Many relationship with CourseDTO

    public StudentDTO(String name, Long id, List<CourseDTO> courses) {
    }

//    public StudentDTO(Long id,
//                      String name,
//                      List<CourseDTO> courses) {
//        this.id = id;
//        this.name = name;
//        this.courses = courses;
//    }

    public StudentDTO(Long id, String name, List<Course> courses) {
          this.id = id;
          this.name = name;
          this.courses = courses;
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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

