package com.example.mcq.repository;

import com.example.mcq.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByCategory(String category);
    List<Question> findByDifficultyLevel(Integer difficultyLevel);
    List<Question> findByCategoryAndDifficultyLevel(String category, Integer difficultyLevel);
}
