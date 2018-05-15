package com.training.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Exercise {

    @Id
    @GeneratedValue
    private Long id;
    private String exerciseName;
    private String exerciseURL;
    private boolean exerciseSelected;
    public Exercise() {
    }

    public Exercise(final Long id, final String exerciseName, final String exerciseURL, final boolean exerciseSelected) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.exerciseURL = exerciseURL;
        this.exerciseSelected = exerciseSelected;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(final String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseURL() {
        return exerciseURL;
    }

    public void setExerciseURL(final String exerciseURL) {
        this.exerciseURL = exerciseURL;
    }

    public boolean isExerciseSelected() {
        return exerciseSelected;
    }

    public void setExerciseSelected(final boolean exerciseSelected) {
        this.exerciseSelected = exerciseSelected;
    }
}
