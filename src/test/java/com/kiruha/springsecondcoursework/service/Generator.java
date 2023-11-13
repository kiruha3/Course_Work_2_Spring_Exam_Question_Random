package com.kiruha.springsecondcoursework.service;

import com.kiruha.springsecondcoursework.entity.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Generator {

    public Question getRandomQuestion(Set<Question> questions) {
        int desiredIndex = new Random().nextInt(questions.size());
        int currentIndex = 0;
        for (Question element : questions) {
            if (currentIndex == desiredIndex) {
                return element;
            }
            currentIndex++;

        }
        return null;
    }
    public Collection<Question> setUp(){
        //Подготовка входных данных
        String question = "Question";
        String answer = "Answer";
        String question1 = "Question1";
        String answer1 = "Answer1";
        String question2 = "Question2";
        String answer2 = "Answer2";
        Set<Question> questions = new HashSet<>();
        questions.add(new Question(question, answer));
        questions.add(new Question(question1, answer1));
        questions.add(new Question(question2, answer2));
        return questions;
    }
}
