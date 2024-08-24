package com.crypto07.SpringDataJPADemo.Service;

import com.crypto07.SpringDataJPADemo.DTO.StudentDTO;
import com.crypto07.SpringDataJPADemo.Entity.Student;
import com.crypto07.SpringDataJPADemo.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student saveStudent(StudentDTO request) {

        Student savingStudent = new Student();

        BeanUtils.copyProperties(request, savingStudent);

        return studentRepository.save(savingStudent);

    }

    public List<Student> fetchAllStudents() {

        return studentRepository.findAll();

    }

    public Student fetchStudentById(Long id) {

        return studentRepository.findById(id).orElse(new Student());

    }

    public List<Student> findByFirstName(String firstName) {

        return studentRepository.findAllByFirstNameContaining(firstName);

    }

    public String deleteStudentById(Long id) {

        studentRepository.deleteById(id);

        return "Student Deleted";

    }

}
