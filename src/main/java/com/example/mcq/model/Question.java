package com.example.mcq.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String text;
    
    @ElementCollection
    private List<String> options = new ArrayList<>();
    
    private Integer correctOptionIndex;
    
    private String explanation;
    
    private String category;
    
    private Integer difficultyLevel;
}