package com.bst.StudentEvaluation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Accessors
@Scope("prototype")
@Data
@Entity
public class StudentEvaluation {
    @Id
    private int studentId;
    private String studentName;
    private int totalMarks;
}
