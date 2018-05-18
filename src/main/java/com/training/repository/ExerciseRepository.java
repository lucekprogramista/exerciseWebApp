package com.training.repository;

import com.training.domain.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ExerciseRepository extends CrudRepository<Exercise, Long> {

    @Transactional
    void deleteExercisesByExerciseName(String exerciseName);
}
