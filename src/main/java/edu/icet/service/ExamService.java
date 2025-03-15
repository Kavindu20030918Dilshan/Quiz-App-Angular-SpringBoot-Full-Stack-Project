package edu.icet.service;

import edu.icet.dto.Exam;

import java.util.List;

public interface ExamService {

    void createExam(Exam exam);

    Exam getExamByCourseId(Integer integer);

    List<Exam> getAll();

    void updateExam(Exam exam);

    void deleteExamById(Integer integer);

    void deleteExamByCourseId(Integer integer);
}
