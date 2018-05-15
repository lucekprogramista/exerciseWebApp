package com.training.repository;

import com.training.domain.Exercise;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityManager;

public interface ExerciseRepository extends CrudRepository<Exercise, Long> {

    void deleteByExerciseName(String exerciseName);
}
