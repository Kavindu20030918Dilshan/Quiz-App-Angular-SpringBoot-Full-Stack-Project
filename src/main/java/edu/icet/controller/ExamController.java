package edu.icet.controller;

import edu.icet.dto.Exam;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {

    final ExamService service;

    // http://localhost:8080/exam/create-new
    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){
        service.createExam(exam);
    }
}
