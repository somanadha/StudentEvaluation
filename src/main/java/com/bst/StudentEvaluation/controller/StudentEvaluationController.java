package com.bst.StudentEvaluation.controller;

import com.bst.StudentEvaluation.model.StudentEvaluation;
import com.bst.StudentEvaluation.service.StudentEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Scope("singleton")
public class StudentEvaluationController {
    @Autowired private StudentEvaluationService service;

    @PostMapping("StudentEvaluation")
    public StudentEvaluation addStudentEvaluation(StudentEvaluation evaluation){
        return service.addStudentEvaluation(evaluation);
    }

    @GetMapping("StudentEvaluationList")
    public Iterable<StudentEvaluation> getStudentEvaluations() {
        return service.getStudentEvaluations();
    }

    @GetMapping("StudentEvaluation")
    public StudentEvaluation getStudentEvaluation(int studentId) {
        return service.getStudentEvaluation(studentId);
    }


    @PatchMapping("StudentEvaluation")
    public StudentEvaluation updateStudentEvaluation(int studentId, int marks){
        return service.updateStudentEvaluation(studentId, marks);
    }

    @DeleteMapping("StudentEvaluation")
    public void deleteStudentEvaluation(int studentId){
        service.deleteStudentEvaluation(studentId);
    }
}
