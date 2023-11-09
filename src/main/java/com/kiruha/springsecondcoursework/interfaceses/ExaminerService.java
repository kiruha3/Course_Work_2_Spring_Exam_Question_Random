package com.kiruha.springsecondcoursework.interfaceses;

import com.kiruha.springsecondcoursework.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestion(int amount);
}
