package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
            StudentService studentService;

   @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
       return studentService.getStudent(regNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/getByPath/{id}")
    public ResponseEntity getStudentUsingPath(@PathVariable("id") int regNo){
        Student student = studentService.getStudentUsingPath(regNo);
        if(student == null){
            return new ResponseEntity("Id doesn't found",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(student,HttpStatus.FOUND);
    }

    @PutMapping("/update-age")
    public Student updateAgeUsingPath(@RequestParam("id") int regNo, @RequestParam("age") int age){
        return studentService.updateAgeUsingPath(regNo,age);
    }
    @DeleteMapping("/delete-student")
    public String deleteStudent(@RequestParam("q") int regNo){
       return studentService.deleteStudent(regNo);
    }
    @DeleteMapping("/deletePath/{id}")
    public String deleteStudentUsingPath(@PathVariable("id") int regNo){
        return studentService.deleteStudentUsingPath(regNo);
    }
    @PutMapping("/change-course")
    public Student changeCourse(@RequestParam("id")int regNo, @RequestParam("C")String course){
        return studentService.changeCourse(regNo,course);
    }

    @PutMapping("/change-course/{id}/{C}")
    public Student changeCourseUsingPath(@PathVariable("id") int regNo, @PathVariable("C") String course){
        return studentService.changeCourseUsingPath(regNo,course);
    }
    @PutMapping("/change-course/{id}")
    public Student changeCourseUsingPathandParam(@PathVariable("id") int regNo, @RequestParam("C") String course){
        return studentService.changeCourseUsingPathandParam(regNo,course);
    }
    @PutMapping("/change-course-age")
    public Student updateCourse(@RequestParam("id") int regNo, @RequestBody Student student){
        return studentService.updateCourse(regNo,student);
   }
}
