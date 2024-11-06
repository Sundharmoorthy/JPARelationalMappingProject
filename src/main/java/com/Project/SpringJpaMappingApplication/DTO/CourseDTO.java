package com.Project.SpringJpaMappingApplication.DTO;

import com.Project.SpringJpaMappingApplication.Model.Student;

import java.util.List;

public class CourseDTO {
    private Long id;
    private String title;
    private List<Student> students;

    public CourseDTO(Long id, String title, List<Student> students) {
        this.id = id;
        this.title = title;
        this.students = students;
    }

    public CourseDTO() {
    }

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
