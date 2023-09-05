package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public Student getStudent(int regNo) {
        Student student = studentRepository.getStudent(regNo);
        return student;
    }

    public String addStudent(Student student) {
        studentRepository.addStudent(student);
        return "Student added successfully";
    }

    public Student getStudentUsingPath(int regNo) {
        Student student = studentRepository.getStudentUsingPath(regNo);
        return student;
    }

    public Student updateAgeUsingPath(int regNo, int age) {
        return studentRepository.updateAgeUsingPath(regNo,age);
    }

    public String deleteStudent(int regNo) {
        studentRepository.deleteStudent(regNo);
        return "Student removed successfully";
    }

    public String deleteStudentUsingPath(int regNo) {
        studentRepository.deleteStudentUsingPath(regNo);
        return "Student removed successfully";
    }

    public Student changeCourse(int regNo, String course) {
        Student student = studentRepository.changeCourse(regNo,course);
        return student;
    }

    public Student changeCourseUsingPath(int regNo, String course) {
        Student student = studentRepository.changeCourseUsingPath(regNo,course);
        return student;
    }

    public Student changeCourseUsingPathandParam(int regNo, String course) {
        Student student = studentRepository.changeCourseUsingPathandParam(regNo,course);
        return student;
    }

    public Student updateCourse(int regNo, Student student) {
        Student student1 = studentRepository.updateCourse(regNo,student);
        return student1;
    }
}
