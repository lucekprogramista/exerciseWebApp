import {HttpClient, HttpHeaders} from "@angular/common/http";
import {EventEmitter, Injectable} from "@angular/core";
import {Exercise} from "./exercise.model";
import {Observable} from "rxjs/Observable";

export interface ExercisePost {
    exerciseName: string;
    exerciseURL: string;
    exerciseSelected: string;
}

@Injectable()
export class ExerciseService {

    onExerciseAdded = new EventEmitter<Exercise>();

    constructor(private httpClient: HttpClient) {

    }

    getExercises() {
        return this.httpClient.get('/api/exercises');
    }

    addExercise(exercise: Exercise){
        return this.httpClient.post("/api/exercises/save", exercise);
    }
}
