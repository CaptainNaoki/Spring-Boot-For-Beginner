package com.naoki.springdemo.student;

import java.time.LocalDate;

public class Student {
    private String fisrtname;

    private String lastname;

    private LocalDate dateofbirth;

    private String email;

    private int age;

    // getter/setter
    public String getFisrtname() {
        return fisrtname;
    }

    public void setFisrtname(String fisrtname) {
        this.fisrtname = fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    // constructor
    public Student(int age,
                   String email,
                   LocalDate dateofbirth,
                   String lastname,
                   String fisrtname) {
        this.age = age;
        this.email = email;
        this.dateofbirth = dateofbirth;
        this.lastname = lastname;
        this.fisrtname = fisrtname;
    }
}
