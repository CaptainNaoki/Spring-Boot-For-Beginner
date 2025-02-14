package com.naoki.springdemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findSAllStudent(){
    return List.of(
            new Student(
                       34,
                               "naonao@gmail.com",
                       LocalDate.now(),
                       "PAKOU",
                               "Isidor"

                               ),
                               new Student(
                        55,
                                "kam@gmail.com",
                        LocalDate.now(),
                        "ORIO",
                                       "QAURIOPO"

                                )



                                );

}
}