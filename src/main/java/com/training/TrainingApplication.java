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
			exerciseService.save(new Exercise(1L, "Bench Press", "url1", false));
			exerciseService.save(new Exercise(2L, "Deadlift","url2", false));
			exerciseService.save(new Exercise(3L, "Back Squat","url3", false));
			exerciseService.save(new Exercise(4L, "Front Squat","url4", false));
			exerciseService.save(new Exercise(5L, "Military Press","url5", false));
			exerciseService.save(new Exercise(6L, "Hip Mobility","url6", false));
			exerciseService.save(new Exercise(7L, "Face Pull","url7", false));
			exerciseService.save(new Exercise(8L, "Leg Press","url8", false));
			exerciseService.save(new Exercise(9L, "Biceps Curl","url9", false));
			exerciseService.save(new Exercise(10L, "Triceps sth","url10", false));
		};
	}
}
