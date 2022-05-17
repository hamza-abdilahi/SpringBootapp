package com.example.demo.service;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    // keep business logic in here. e.g.
    @Autowired
private StudentRepository studentRepository;

    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Student save(Student student) {
    return studentRepository.save(student);
    }
}
