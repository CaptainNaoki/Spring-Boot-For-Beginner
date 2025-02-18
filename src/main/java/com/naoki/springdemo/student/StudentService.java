package com.naoki.springdemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface StudentService {
    Student save(Student s);
    List<Student> findSAllStudent();
    Student findByEmail(String email);
    Student update(Student s);
    void delete(String email);

}