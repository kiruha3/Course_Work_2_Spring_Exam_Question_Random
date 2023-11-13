package com.kiruha.springsecondcoursework.service;

import com.kiruha.springsecondcoursework.entity.Question;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitJavaQuestionServiceTest {
    private final JavaQuestionService javaQuestionService = new JavaQuestionService();

    //    @InjectMocks
//    private QuestionService questionService;
    @Test
    void add_successInObject() {
        //Подготовка входных данных
        String question = "Question1";
        String answer = "Answer1";
        Set<Question> questions = new HashSet<>();
        questions.add(new Question(question, answer));
        //Подготовка ожидаемого результата

        Collection<Question> expectedAdd = questions;//
        //Начало теста
        javaQuestionService.questions.add(new Question(question, answer));
        Collection<Question> actualAdd = javaQuestionService.getAll();
        assertEquals(expectedAdd, actualAdd);
    }

    @Test
    void add_successQuestionAndAnswer() {
        //Подготовка входных данных
        String question = "Question1";
        String answer = "Answer1";
        Set<Question> questions = new HashSet<>();
        Question questionObject = new Question(question, answer);
        questions.add(questionObject);
        //Подготовка ожидаемого результата
        Collection<Question> expectedAdd = questions;//
        //Начало теста
        javaQuestionService.questions.add(new Question(question, answer));
        Collection<Question> actualAdd = javaQuestionService.getAll();
        assertEquals(expectedAdd, actualAdd);
    }

    @Test
    void remove_success() {
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
        questions.remove(new Question(question, answer));
        //Подготовка ожидаемого результата
        Collection<Question> expectedAdd = questions;//
        javaQuestionService.questions.add(new Question(question, answer));
        javaQuestionService.questions.add(new Question(question1, answer1));
        javaQuestionService.questions.add(new Question(question2, answer2));
        javaQuestionService.questions.remove(new Question(question, answer));
        //Начало теста
        Collection<Question> actualAdd = javaQuestionService.getAll();
        assertEquals(expectedAdd, actualAdd);
    }

    @Test
    void getAll_success() {
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
        //Подготовка ожидаемого результата
        Collection<Question> expectedAdd = questions;//
        javaQuestionService.questions.add(new Question(question, answer));
        javaQuestionService.questions.add(new Question(question1, answer1));
        javaQuestionService.questions.add(new Question(question2, answer2));
        //Начало теста
        Collection<Question> actualAdd = javaQuestionService.getAll();
        assertEquals(expectedAdd, actualAdd);

    }

    @Test
    void getRandomQuestion_success() {


    }


}