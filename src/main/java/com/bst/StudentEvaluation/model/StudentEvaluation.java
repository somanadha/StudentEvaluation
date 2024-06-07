package com.bst.StudentEvaluation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Accessors
@Scope("prototype")
@Entity
public class StudentEvaluation {

    @Id @Getter @Setter private int studentId;
    @Getter @Setter private String studentName;
    @Getter @Setter private int totalMarks;
}
