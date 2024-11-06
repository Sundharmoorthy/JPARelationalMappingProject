package com.Project.SpringJpaMappingApplication.Service;


import com.Project.SpringJpaMappingApplication.DTO.CourseDTO;
import com.Project.SpringJpaMappingApplication.Mapper.CourseMapper;
import com.Project.SpringJpaMappingApplication.Model.Course;
import com.Project.SpringJpaMappingApplication.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseDTO> getAllCourses() {
        return courseRepository.findAll().stream()
                .map(CourseMapper::toDTO)
                .collect(Collectors.toList());
    }

    public CourseDTO getCourseById(Long id) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
        return CourseMapper.toDTO(course);
    }

    public CourseDTO createCourse(CourseDTO courseDTO) {
        Course course = CourseMapper.toEntity(courseDTO);
        Course savedCourse = courseRepository.save(course);
        return CourseMapper.toDTO(savedCourse);
    }

    public CourseDTO updateCourse(Long id, CourseDTO courseDTO) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
        course.setTitle(courseDTO.getTitle());
        // Update other fields as needed
        Course updatedCourse = courseRepository.save(course);
        return CourseMapper.toDTO(updatedCourse);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}

