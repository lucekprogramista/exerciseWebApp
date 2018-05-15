package com.training.service;

import com.training.domain.Exercise;
import com.training.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private ExerciseRepository exerciseRepository;

    @Autowired
    public ExerciseServiceImpl(final ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public Iterable<Exercise> list() {
        return exerciseRepository.findAll();
    }

    @Override
    public Exercise save(final Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public void deleteExercise(final String exerciseName){
        exerciseRepository.deleteByExerciseName(exerciseName);
    }

    @Override
    public void deleteExerciseById(final Long id) {
        exerciseRepository.deleteById(id);
    }
}
