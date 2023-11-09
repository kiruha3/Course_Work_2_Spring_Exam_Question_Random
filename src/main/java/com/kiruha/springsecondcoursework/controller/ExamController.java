package com.kiruha.springsecondcoursework.controller;

import com.kiruha.springsecondcoursework.service.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerServiceImpl examinerService;

    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("{amount}")
    public Collection getQuestion(@PathVariable int amount) {
        return examinerService.getQuestion(amount);
    }
}
