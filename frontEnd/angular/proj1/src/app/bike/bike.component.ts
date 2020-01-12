import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {

  selectdBike;

  bikes = [

{
  name: 'BMW',
  imgURL: 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
  details: 'bmw bike'

},

{
  name: 'Honda',
  imgURL: 'https://cdn.pixabay.com/photo/2014/04/23/20/34/dirt-bike-330815__340.jpg',
  details: 'Honds Bike '

},

{
  name: 'REC 350',
  imgURL: 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
  details: 'REC 350 '

}




  ];

  constructor() { }

  selectBike(bike){
    this.selectdBike = bike;
  }

  ngOnInit() {
  }

}
