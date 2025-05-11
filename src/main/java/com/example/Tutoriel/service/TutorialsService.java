package com.example.Tutoriel.service;
import com.example.Tutoriel.entity.Comments;
import com.example.Tutoriel.entity.Tutorials;
import com.example.Tutoriel.repository.TutorialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TutorialsService {
    @Autowired

    private TutorialsRepository tutorialsRepository;

    public List<Tutorials> getAllTutorials(){
        return tutorialsRepository.findAll();
    }
    public Tutorials createTutorials(Tutorials tutorials){
        return tutorialsRepository.save(tutorials);
    }
public Optional<Tutorials> getTutorialsById(Long id){
        return tutorialsRepository.findById(id);
}
public void deleteTutorials(Long id){
        tutorialsRepository.deleteById(id);
}
}

