package com.example.Tutoriel.controller;
import com.example.Tutoriel.entity.Comments;
import com.example.Tutoriel.service.CommentsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    //Ajout un commentaire
    @PostMapping
 public Comments CreateNewComments(@RequestBody Comments comments){
        return commentsService.createNewComments(comments);
    }

    //Récuperer tous les commentaires
@GetMapping
   public List<Comments> getAllComments(){
        return commentsService.getAllComments();
}

// Récupere les commentaire selon ID
@GetMapping(" /id" )
    public Optional<Comments> getCommentById(@PathVariable Long id){
        return commentsService.getCommentsById(id);

}

 //Supprission
@DeleteMapping("/{id}")
    public void deleteComments(@PathVariable Long id){
        commentsService.deleteComments(id);
}
}
