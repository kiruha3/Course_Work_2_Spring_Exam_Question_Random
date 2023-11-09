package com.kiruha.springsecondcoursework.service;

import com.kiruha.springsecondcoursework.Question;
import com.kiruha.springsecondcoursework.interfaceses.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {
    public Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question q = new Question(question, answer);
        questions.add(q);
        return q;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        int desiredIndex = new Random().nextInt(questions.size());
        int currentIndex = 0;
        for (Question element : questions) {
            if (currentIndex == desiredIndex) {
                return element;
            }
            currentIndex++;

        }return null;
    }
}
