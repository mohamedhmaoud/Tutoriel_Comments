package com.example.Tutoriel.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    // ManyToOne relationship to Tutorials
    @ManyToOne
    @JoinColumn(name = "tutorial_id")
    private Tutorials tutorial;
}

