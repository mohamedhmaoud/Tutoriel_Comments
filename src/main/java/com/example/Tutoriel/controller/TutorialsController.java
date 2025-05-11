package com.example.Tutoriel.controller;
import com.example.Tutoriel.entity.Tutorials;
import com.example.Tutoriel.service.TutorialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tutorials")
public class TutorialsController {

    @Autowired
    private TutorialsService tutorialsService;

    @GetMapping
    public List<Tutorials> getAllTutoriel(){
        return tutorialsService.getAllTutorials();
    }

    @PostMapping
    public Tutorials addtutorials(@RequestBody Tutorials tutorials) {
        return tutorialsService.createTutorials(tutorials);
    }


    @GetMapping("/{id}")
    public Optional<Tutorials> getTutorialsById(@PathVariable Long id) {
        return tutorialsService.getTutorialsById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTutorials(@PathVariable Long id){
        tutorialsService.deleteTutorials(id);
    }

}
