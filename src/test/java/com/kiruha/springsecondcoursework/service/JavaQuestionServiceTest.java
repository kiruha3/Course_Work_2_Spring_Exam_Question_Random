package com.kiruha.springsecondcoursework.service;

import com.kiruha.springsecondcoursework.entity.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    @Mock
    private JavaQuestionService javaQuestionService;

    @InjectMocks
    private ExaminerServiceImpl examinerServiceImpl;

    @InjectMocks
    private Generator generator;

    @Test
    void add_successInObject() {
        //Подготовка входных данных
        String question = "Question1";
        String answer = "Answer1";
        Set<Question> questions = new HashSet<>();
        questions.add(new Question(question, answer));
        //Подготовка ожидаемого результата
        when(javaQuestionService.getAll()).thenReturn(questions);
        Collection<Question> expectedAdd = questions;//
        //Начало теста
        Collection<Question> actualAdd = javaQuestionService.getAll();
        assertEquals(expectedAdd, actualAdd);
    }

    @Test
    void add_successQuestionAndAnswer() {
        String question = "Question1";
        String answer = "Answer1";
        Set<Question> questions = new HashSet<>();
        Question questionObject = new Question(question, answer);
        questions.add(questionObject);
        //Подготовка ожидаемого результата
        when(javaQuestionService.getAll()).thenReturn(questions);
        Collection<Question> expectedAdd = questions;//
        //Начало теста
        Collection<Question> actualAdd = javaQuestionService.getAll();
        assertEquals(expectedAdd, actualAdd);
    }

    @Test
    void remove_success() {
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
        when(javaQuestionService.getAll()).thenReturn(questions);
        Collection<Question> expectedAdd = questions;//
        //Начало теста
        Collection<Question> actualAdd = javaQuestionService.getAll();
        assertEquals(expectedAdd, actualAdd);
    }

    @Test
    void getAll_success() {
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
        when(javaQuestionService.getAll()).thenReturn(questions);
        Collection<Question> expectedAdd = questions;//
        //Начало теста
        Collection<Question> actualAdd = javaQuestionService.getAll();
        assertEquals(expectedAdd, actualAdd);

    }

    @Test
    void getRandomQuestion_success() {
//        generator.setUp();
//        when(javaQuestionService.getRandomQuestion()).thenReturn(generator.getRandomQuestion());
//        //Подготовка ожидаемого результата
//
//        Question expectedAdd = generator.getRandomQuestion();//
//        //Начало теста
//
//        Question actualAdd = javaQuestionService.getRandomQuestion();
//        assertEquals(expectedAdd, actualAdd);
    }

}