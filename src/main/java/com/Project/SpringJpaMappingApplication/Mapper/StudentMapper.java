package com.Project.SpringJpaMappingApplication.Mapper;


import com.Project.SpringJpaMappingApplication.DTO.StudentDTO;
import com.Project.SpringJpaMappingApplication.Model.Student;

public class StudentMapper {

    public static StudentDTO toDTO(Student student) {
        return new StudentDTO(student.getId(), student.getName(), student.getCourses());
    }

    public static Student toEntity(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setCourses(studentDTO.getCourses());
        return student;
    }
}
