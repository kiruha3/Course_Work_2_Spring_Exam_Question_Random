package com.kiruha.springsecondcoursework.service;

import com.kiruha.springsecondcoursework.Question;
import com.kiruha.springsecondcoursework.interfaceses.ExaminerService;
import com.kiruha.springsecondcoursework.interfaceses.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;
    public Set<Question> questionListGenerate = new HashSet<>();

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        questionListGenerate = new HashSet<>();
        if (amount > questionListGenerate.size()) {
            while (questionListGenerate.size() < amount) {
                Question question = questionService.getRandomQuestion();
                System.out.println(question);
                questionListGenerate.add(question);

            }
        }
        return questionListGenerate;
    }
}
