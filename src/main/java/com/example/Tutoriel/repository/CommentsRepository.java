package com.example.Tutoriel.repository;
import com.example.Tutoriel.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long> {

}
