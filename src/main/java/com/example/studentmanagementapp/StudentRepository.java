package com.example.studentmanagementapp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> db = new HashMap<>();
    public Student getStudent(int regNo){
        return db.get(regNo);
    }

    public void addStudent(Student student) {
        db.put(student.getRegNo(),student);
    }

    public Student getStudentUsingPath(int regNo) {
        return db.get(regNo);
    }

    public Student updateAgeUsingPath(int regNo, int age) {
        db.get(regNo).setAge(age);
         return db.get(regNo);
    }

    public void deleteStudent(int regNo) {
        db.remove(regNo);
    }

    public void deleteStudentUsingPath(int regNo) {
        db.remove(regNo);
    }

    public Student changeCourse(int regNo, String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    public Student changeCourseUsingPath(int regNo, String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    public Student changeCourseUsingPathandParam(int regNo, String course) {
        db.get(regNo).setCourse(course);
         return db.get(regNo);
    }

    public Student updateCourse(int regNo, Student student) {
        db.get(regNo).setCourse(student.getCourse());
        db.get(regNo).setAge(student.getAge());
         return db.get(regNo);
    }
}
