package com.crypto07.SpringDataJPADemo.Repository;

import com.crypto07.SpringDataJPADemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByFirstNameContaining(String firstName);
}
