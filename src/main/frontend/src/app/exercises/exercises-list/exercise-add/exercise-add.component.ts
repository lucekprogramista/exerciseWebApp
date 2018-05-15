import { Component, OnInit } from '@angular/core';
import {ExerciseService} from "../../exercise.service";
import {Exercise} from "../../exercise.model";

@Component({
  selector: 'app-exercise-add',
  templateUrl: './exercise-add.component.html',
  styleUrls: ['./exercise-add.component.css']
})
export class ExerciseAddComponent implements OnInit {

  addExerciseValue: string = null;

  constructor(private exerciseService: ExerciseService) { }

  ngOnInit() {
  }

  onExerciseAdd(event) {
      let exercise: Exercise = new Exercise(event.target.value, "tymczasowyURL", false);
      this.exerciseService.addExercise(exercise).subscribe(
          (newExercise: Exercise) => {
              //clear the input
              this.addExerciseValue = '';
              this.exerciseService.onExerciseAdded.emit(newExercise);
          }
      )
  }

}
