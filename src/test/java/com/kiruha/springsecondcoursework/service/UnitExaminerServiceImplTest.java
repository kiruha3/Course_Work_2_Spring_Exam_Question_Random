package com.kiruha.springsecondcoursework.service;

import com.kiruha.springsecondcoursework.Question;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitExaminerServiceImplTest {

    private final JavaQuestionService javaQuestionService = new JavaQuestionService();


    private Generator generator;

    @Test
    void getQuestion() {
        //Подготовка входных данных
        String question = "Question";
        String answer = "Answer";
        String question1 = "Question1";
        String answer1 = "Answer1";
        String question2 = "Question2";
        String answer2 = "Answer2";
        Set<Question> questions = new HashSet<>();
        javaQuestionService.questions.add(new Question(question, answer));
        javaQuestionService.questions.add(new Question(question1, answer1));
        javaQuestionService.questions.add(new Question(question2, answer2));
        //Подготовка ожидаемого результата
       List<Question> expectedAdd = javaQuestionService.getAll().stream()
                .sorted(Comparator.comparing(Question::toString))
                .collect(Collectors.toList());

        ExaminerServiceImpl examinerService = new ExaminerServiceImpl(javaQuestionService);

        javaQuestionService.questions.add(new Question(question, answer));
        javaQuestionService.questions.add(new Question(question1, answer1));
        javaQuestionService.questions.add(new Question(question2, answer2));
        //Начало теста
        List<Question> actualAdd = examinerService.getQuestion(3).stream()
                .sorted(Comparator.comparing(Question::toString))
                .collect(Collectors.toList());
        assertEquals(expectedAdd, actualAdd);
    }
}