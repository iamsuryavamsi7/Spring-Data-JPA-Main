package com.crypto07.SpringDataJPADemo.Repository;

import com.crypto07.SpringDataJPADemo.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
