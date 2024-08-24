package com.crypto07.SpringDataJPADemo.Controller;

import com.crypto07.SpringDataJPADemo.Entity.School;
import com.crypto07.SpringDataJPADemo.Repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolRepository schoolRepository;

    @PostMapping("/schools")
    public School saveSchool(
            @RequestBody School school
    ){

        return schoolRepository.save(school);

    }

    @GetMapping("/schools")
    public List<School> fetchAllSchools(){

        return schoolRepository.findAll();

    }

}
