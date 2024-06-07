package com.bst.StudentEvaluation.service;

import com.bst.StudentEvaluation.model.StudentEvaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import com.bst.StudentEvaluation.repository.StudentEvaluationRepository;

import java.net.SocketOption;
import java.util.Optional;

@Service
@Scope("singleton")
public class StudentEvaluationService {

    @Autowired
    private StudentEvaluationRepository repository;

    public Iterable<StudentEvaluation> getStudentEvaluations() {
        return repository.findAll();
    }

    public StudentEvaluation addStudentEvaluation(StudentEvaluation evaluation) {
        return repository.save(evaluation);
    }

    public StudentEvaluation updateStudentEvaluation(int studentId, int marks) {
        Optional<StudentEvaluation> optionalStudentEvaluation = repository.findById(studentId);
        StudentEvaluation studentEvaluation = optionalStudentEvaluation.get();
        studentEvaluation.setTotalMarks(marks);
        repository.save(studentEvaluation);
        return studentEvaluation;
    }

    public StudentEvaluation getStudentEvaluation(int studentId) {
        Optional<StudentEvaluation> optionalStudentEvaluation = repository.findById(studentId);
        return optionalStudentEvaluation.get();
    }

    public void deleteStudentEvaluation(int studentId) {
        repository.deleteById(studentId);
    }
}
