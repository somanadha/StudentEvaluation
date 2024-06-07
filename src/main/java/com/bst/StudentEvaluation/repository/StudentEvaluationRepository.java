package com.bst.StudentEvaluation.repository;

import com.bst.StudentEvaluation.model.StudentEvaluation;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Scope("singleton")
public interface StudentEvaluationRepository extends JpaRepository<StudentEvaluation, Integer> {
//    public Iterable<StudentEvaluation> findAll() {
//        return null;
//    }
//
//    public boolean save(StudentEvaluation evaluation) {
//        boolean isSaved = false;
//
//        return isSaved;
//
//    }
//
//    public boolean update(int studentId, int marks) {
//        boolean isUpdated = false;
//
//        return isUpdated;
//    }
//
//    public StudentEvaluation find(int studentId) {
//        return null;
//    }
//
//    public boolean delete(int studentId) {
//        boolean isDeleted = false;
//
//        return isDeleted;
//
//    }
}
