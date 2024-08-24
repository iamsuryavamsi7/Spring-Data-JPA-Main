package com.crypto07.SpringDataJPADemo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(
        name = "student_profile"
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bio;

    @OneToOne
    @JoinColumn(
            name = "student_id"
    )
    @JsonBackReference
    private Student student;

}
