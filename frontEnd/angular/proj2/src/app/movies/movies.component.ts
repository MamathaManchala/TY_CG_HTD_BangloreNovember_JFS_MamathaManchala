import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  selectdMovie;

  movies = [

{
  name: 'BMW',
  imgURL: 'https://upload.wikimedia.org/wikipedia/en/7/75/Gang_Leader_2019_film_poster.jpg',
  details: 'Watch Best Quality and Collection Of Telugu Hit Movies, Old Telugu Movies, Classic Telugu Movies, Full HD Movies In Our Official Youtube Channel.'

},

{
  name: 'Honda',
  imgURL: 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcR50mJL_MORiJt09KTU_Dn8Dp3uV6GktbXDoxf4i2MTsHPgzYtf',
  details: 'Watch Best Quality and Collection Of Telugu Hit Movies, Old Telugu Movies, Classic Telugu Movies, Full HD Movies In Our Official Youtube Channel.'

},

{
  name: 'REC 350',
  imgURL: 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRIzI77MormbRDhPc4SG5g8ToNf-v48LrTTujWUL4MEY2pYNa5H',
  details: 'Watch Best Quality and Collection Of Telugu Hit Movies, Old Telugu Movies, Classic Telugu Movies, Full HD Movies In Our Official Youtube Channel.'

}




  ];

  constructor() { }

  selectMovie(movie){
    this.selectdMovie = movie;
  }



  ngOnInit() {
  }

}
