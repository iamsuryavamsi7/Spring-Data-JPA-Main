package com.crypto07.SpringDataJPADemo.Repository;

import com.crypto07.SpringDataJPADemo.Entity.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
}
