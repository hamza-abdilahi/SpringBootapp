package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController // apply additional functionality to the code.
public class StudentController {
    //controller talks to the client
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(Student student) {
        return studentService.getAll();
    }

    @PostMapping("/students")
    Student post(@RequestBody Student student){
        return studentService.save(student);
    }
}
