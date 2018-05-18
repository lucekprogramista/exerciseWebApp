package com.training;

import com.training.domain.Exercise;
import com.training.service.ExerciseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(ExerciseService exerciseService) {
		return args -> {
			exerciseService.save(new Exercise("Bench Press", "url1", false));
			exerciseService.save(new Exercise("Deadlift","url2", false));
			exerciseService.save(new Exercise("Back Squat","url3", false));
			exerciseService.save(new Exercise("Front Squat","url4", false));
			exerciseService.save(new Exercise("Military Press","url5", false));
			exerciseService.save(new Exercise("Hip Mobility","url6", false));
			exerciseService.save(new Exercise("Face Pull","url7", false));
			exerciseService.save(new Exercise("Leg Press","url8", false));
			exerciseService.save(new Exercise("Biceps Curl","url9", false));
			exerciseService.save(new Exercise( "Triceps sth","url10", false));
		};
	}
}
