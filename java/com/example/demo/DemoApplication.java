package com.example.demo;

import com.example.demo.algorith.controller.AlgorithmController;
import com.example.demo.phone.controller.PhoneController;
import com.example.demo.quiz.controller.QuizController;
import com.example.demo.student.controller.Membercontroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		PhoneController phoneController = new PhoneController();
		Membercontroller membercontroller = new Membercontroller();
		QuizController quizController = new QuizController();
		AlgorithmController algorithmController = new AlgorithmController();

		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.println("0. Exit 1.Auth 2.OOP 3.Quiz 4.Algorithm" );
			switch (scanner.next()){
				case "0" :
					System.out.println("### Exit ###"); return;
				case "1" :
					System.out.println("### Auth ###");
					phoneController.execute(scanner);
					break;
				case "2" :
					System.out.println("### OOP ###");
					membercontroller.execute(scanner);
					break;
				case "3" :
					System.out.println("### Quiz ###");
					quizController.execute(scanner);
					break;
				case "4" :
					System.out.println("### Algorithm ###");
					algorithmController.excute(scanner);
					break;
				default:
					System.out.println("Wrong Number");
					break;

			}
		}

	}

}
