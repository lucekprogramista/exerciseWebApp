import { Component, OnInit } from '@angular/core';
import {Exercise} from "../exercise.model";
import {ExerciseService} from "../exercise.service";


@Component({
  selector: 'app-exercises-list',
  templateUrl: './exercises-list.component.html',
  styleUrls: ['./exercises-list.component.css']
})
export class ExercisesListComponent implements OnInit {

  exercises: Exercise[] = [];

  constructor(private exerciseService: ExerciseService) { }

  ngOnInit() {
    this.exerciseService.getExercises()
        .subscribe(
            (exercises: any[]) => {
                this.exercises = exercises
            },
            (error) => console.log(error)
        );

    this.exerciseService.onExerciseAdded.subscribe(
        (exercise: Exercise) => this.exercises.push(exercise));
  }

    onExerciseChange($event, exercise: Exercise) {
      console.log("Exercise has changed");
    }
}
