export class Exercise {

    public id: number;
    public exerciseName: string;
    public exerciseURL: string;
    public exerciseSelected: boolean;

    constructor(exerciseName: string, exerciseURL: string, exerciseSelected: boolean){
        this.exerciseName = exerciseName;
        this.exerciseURL = exerciseURL;
        this.exerciseSelected = exerciseSelected;
    }



}
