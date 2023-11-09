package com.kiruha.springsecondcoursework.controller;

import com.kiruha.springsecondcoursework.Question;
import com.kiruha.springsecondcoursework.service.JavaQuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaController {
    private final JavaQuestionService javaQuestionService;

    public JavaController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }
    @GetMapping(path = "/java")
    public  Collection allQuestion() {
//        return "hello";
        return javaQuestionService.getAll();
    }
    @GetMapping(path = "/java/add")
    public Question addQuestion(@RequestParam("question") String question,
                                @RequestParam("answer") String answer) {
        return javaQuestionService.add(new Question(question, answer));
    }

    @GetMapping(path = "/java/remove")
    public Question removeQuestion(@RequestParam("question") String question,
                                   @RequestParam("answer") String answer) {
        return javaQuestionService.remove(new Question(question, answer));
    }
}
