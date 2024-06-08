package com.bst.StudentEvaluation.repository;

import com.bst.StudentEvaluation.model.StudentEvaluation;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Scope("singleton")
public interface StudentEvaluationRepository extends JpaRepository<StudentEvaluation, Integer> {

    List<StudentEvaluation> findByStudentName(String studentName);

    List<StudentEvaluation> findByTotalMarksGreaterThan(int totalMarks);
}
