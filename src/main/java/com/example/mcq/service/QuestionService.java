package com.example.mcq.service;

import com.example.mcq.model.Question;
import com.example.mcq.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Optional<Question> getQuestionById(Long id) {
        return questionRepository.findById(id);
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepository.findByCategory(category);
    }

    public List<Question> getQuestionsByDifficultyLevel(Integer level) {
        return questionRepository.findByDifficultyLevel(level);
    }

    public List<Question> getQuestionsByCategoryAndDifficulty(String category, Integer level) {
        return questionRepository.findByCategoryAndDifficultyLevel(category, level);
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}