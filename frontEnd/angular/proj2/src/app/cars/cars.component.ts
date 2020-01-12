import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  selectdCar;

  cars = [

{
  name: 'BMW',
  imgURL: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
  details: 'Get details about all new car models in India. Visit us and find new car models, car prices, car features, car comparison of different variants in India'

},

{
  name: 'Ferari',
  imgURL: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
  details: 'Get details about all new car models in India. Visit us and find new car models, car prices, car features, car comparison of different variants in India '

},

{
  name: 'Audie',
  imgURL: 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
  details: 'Get details about all new car models in India. Visit us and find new car models, car prices, car features, car comparison of different variants in India '

}




  ];

  constructor() { }

  selectCar(car){
    this.selectdCar = car;
  }


 

  ngOnInit() {
  }

}
