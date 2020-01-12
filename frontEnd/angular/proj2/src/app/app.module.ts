import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { NgModule } from '@angular/core';
import { RouterModule, ChildActivationEnd } from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { MoviesComponent } from './movies/movies.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { MovieDetailsComponent } from './movie-details/movie-details.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CarsComponent,
    MoviesComponent,
    MobilesComponent,
    CarDetailsComponent,
    MovieDetailsComponent,
    MobileDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      { path: ' ', component: HomeComponent },
      { path: 'cars', component: CarsComponent },
      { path: 'movies', component: MoviesComponent },
      { path: 'mobiles', component: MobilesComponent }
     
]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
