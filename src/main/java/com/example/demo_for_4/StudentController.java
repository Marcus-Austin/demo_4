package com.example.demo_for_4;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
            new Student(1, "Alice", 20),
            new Student(2, "Bob", 22),
            new Student(3, "Charlie", 23)
        );
    }
}
