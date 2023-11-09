package com.kiruha.springsecondcoursework.service;

import com.kiruha.springsecondcoursework.Question;
import com.kiruha.springsecondcoursework.interfaceses.ExaminerService;
import com.kiruha.springsecondcoursework.interfaceses.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;

@Service
public class ExaminerServiceImpl implements ExaminerService {



    private QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        Random random = new Random();
        int a = random.nextInt();
        return null;
    }
}
