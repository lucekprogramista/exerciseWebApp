import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { ExercisesComponent } from './exercises/exercises.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ExercisesListComponent } from './exercises/exercises-list/exercises-list.component';
import { ExercisesDetailComponent } from './exercises/exercises-detail/exercises-detail.component';
import { ExerciseItemComponent } from './exercises/exercises-list/exercise-item/exercise-item.component';
import { ExerciseAddComponent } from './exercises/exercises-list/exercise-add/exercise-add.component';
import {ExerciseService} from "./exercises/exercise.service";
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [
    AppComponent,
    ExercisesComponent,
    HeaderComponent,
    FooterComponent,
    ExercisesListComponent,
    ExercisesDetailComponent,
    ExerciseItemComponent,
    ExerciseAddComponent
  ],
  imports: [
    BrowserModule,
      HttpClientModule
  ],
  providers: [ExerciseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
