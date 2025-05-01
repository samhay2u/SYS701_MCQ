package com.example.mcq.controller;

import com.example.mcq.model.Question;
import com.example.mcq.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable Long id) {
        return questionService.getQuestionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return ResponseEntity.ok(questionService.getQuestionsByCategory(category));
    }

    @GetMapping("/difficulty/{level}")
    public ResponseEntity<List<Question>> getQuestionsByDifficulty(@PathVariable Integer level) {
        return ResponseEntity.ok(questionService.getQuestionsByDifficultyLevel(level));
    }

    @PostMapping
    public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
        return ResponseEntity.status(HttpStatus.CREATED).body(questionService.saveQuestion(question));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(@PathVariable Long id, @RequestBody Question question) {
        return questionService.getQuestionById(id)
                .map(existingQuestion -> {
                    question.setId(id);
                    return ResponseEntity.ok(questionService.saveQuestion(question));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        return questionService.getQuestionById(id)
                .map(question -> {
                    questionService.deleteQuestion(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}