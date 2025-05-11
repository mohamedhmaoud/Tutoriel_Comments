package com.example.Tutoriel.service;


import com.example.Tutoriel.entity.Comments;
import com.example.Tutoriel.repository.CommentsRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {

    @Autowired
    private CommentsRepository commentsRepository;

    /*Ajouter un commentaire*/

public Comments createNewComments(Comments comments){
    return commentsRepository.save(comments);
}

    //Récuprer tous les Commentaires

    public List<Comments> getAllComments(){
    return commentsRepository.findAll();
    }

    //Récuperer un commentaire pat ID
    public Optional<Comments> getCommentsById(Long id){
    return commentsRepository.findById(id);
    }

    //Supprimer un commenatire

    public void deleteComments(Long id){
    commentsRepository.deleteById(id);
    }

}
