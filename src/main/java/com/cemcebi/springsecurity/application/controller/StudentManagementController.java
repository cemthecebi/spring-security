package com.cemcebi.springsecurity.application.controller;

import com.cemcebi.springsecurity.domain.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENT_LIST = Arrays.asList(
            new Student(1L, "Bruce Wayne"),
            new Student(2L, "Oswald Cobblepot"),
            new Student(3L, "Alfred Pennyworth")
    );

    @GetMapping
    public List<Student> getAll() {
        System.out.println("get-all-student");
        return STUDENT_LIST;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println("register-new-student");
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        System.out.println("delete-student");
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId, @RequestBody Student student) {
        System.out.println("update-student");
        System.out.println(String.format("%s %s", studentId, student));
    }
}
