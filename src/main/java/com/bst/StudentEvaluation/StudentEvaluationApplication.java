package com.bst.StudentEvaluation;

import com.bst.StudentEvaluation.model.StudentEvaluation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentEvaluationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(StudentEvaluationApplication.class, args);

		StudentEvaluation marks = context.getBean(StudentEvaluation.class);
		System.out.println("Hello World !");
	}
}
