package com.training.controller;

import com.training.domain.Exercise;
import com.training.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    private ExerciseService exerciseService;

    @Autowired
    public ExerciseController(final ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Exercise> list() {
        return exerciseService.list();
    }

    @PostMapping("/save")
    public Exercise saveTask(@RequestBody Exercise exercise) {
        return exerciseService.save(exercise);
    }

    @DeleteMapping("/delete_name/{exerciseName}")
    public void deleteExerciseByName(@PathVariable String exerciseName) {
        exerciseService.deleteExercise(exerciseName);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void deleteExerciseById(@PathVariable Long id) {
        exerciseService.deleteExerciseById(id);
    }
}
