package com.example.Tutoriel.entity;
import com.sun.jdi.PrimitiveValue;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Tutorials {

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean published;

    @OneToMany(mappedBy = "tutorial")
private List<Comments> comments = new ArrayList<>();
    public List<Comments> getComments(){
        return comments;
    }
    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}
