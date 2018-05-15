package com.training.service;

import com.training.domain.Exercise;

public interface ExerciseService {
    Iterable<Exercise> list();
    Exercise save(Exercise exercise);
    void deleteExercise(String exerciseName);
    void deleteExerciseById(Long id);
}
