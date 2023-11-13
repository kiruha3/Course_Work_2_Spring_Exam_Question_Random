package com.kiruha.springsecondcoursework.service;

import com.kiruha.springsecondcoursework.entity.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestion(int amount);
}
