package com.kiruha.springsecondcoursework.service;

import com.kiruha.springsecondcoursework.Question;
import com.kiruha.springsecondcoursework.interfaceses.ExaminerService;
import com.kiruha.springsecondcoursework.interfaceses.QuestionService;
import com.kiruha.springsecondcoursework.selfexception.IndexQuestionBoundException;
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
        if (amount > questionService.getAll().size()) {
            throw new IndexQuestionBoundException("Запрашивоемое количество вопросов больше чем существующее");
        }
        while (questionListGenerate.size() < amount) {
            Question question = questionService.getRandomQuestion();
            questionListGenerate.add(question);
        }
        return questionListGenerate;
    }
}

