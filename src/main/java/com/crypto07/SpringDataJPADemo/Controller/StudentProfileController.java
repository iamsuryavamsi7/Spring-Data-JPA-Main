package com.crypto07.SpringDataJPADemo.Controller;

import com.crypto07.SpringDataJPADemo.Entity.StudentProfile;
import com.crypto07.SpringDataJPADemo.Repository.StudentProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/studentProfile")
public class StudentProfileController {

    private final StudentProfileRepository studentProfileRepository;

    @GetMapping("/studentProfile")
    public List<StudentProfile> fetchAllStudentProfiles(){

        return studentProfileRepository.findAll();

    }

    @PostMapping("/studentProfile")
    public StudentProfile SaveStudentProfile(
            @RequestBody StudentProfile request
    ){

        return studentProfileRepository.save(request);

    }

}
