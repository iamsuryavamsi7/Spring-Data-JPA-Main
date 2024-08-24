package com.crypto07.SpringDataJPADemo.Controller;

import com.crypto07.SpringDataJPADemo.DTO.StudentDTO;
import com.crypto07.SpringDataJPADemo.Entity.Student;
import com.crypto07.SpringDataJPADemo.Service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/students")
    public ResponseEntity<Student> saveStudent(
            @Valid @RequestBody StudentDTO request
    ){

        Student savedStudent = studentService.saveStudent(request);

        return ResponseEntity.ok(savedStudent);

    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> fetchAllStudents(){

        List<Student> students = studentService.fetchAllStudents();

        return ResponseEntity.ok(students);

    }

    @GetMapping("/students/{student-id}")
    public ResponseEntity<Student> fetchStudentByID(
            @PathVariable("student-id") Long id
    ){

        Student studentById = studentService.fetchStudentById(id);

        return ResponseEntity.ok(studentById);

    }

    @GetMapping("students/search/{firstName}")
    public ResponseEntity<List<Student>> studentByFirstName(
            @PathVariable("firstName") String firstName
    ){

        List<Student> studentByFirstName = studentService.findByFirstName(firstName);

        return ResponseEntity.ok(studentByFirstName);

    }

    @DeleteMapping("/students/{student-id}")
    public ResponseEntity<String> deleteStudentById(
            @PathVariable("student-id") Long id
    ){

        String deleteStudentById = studentService.deleteStudentById(id);

        return ResponseEntity.ok(deleteStudentById);

    }

}
