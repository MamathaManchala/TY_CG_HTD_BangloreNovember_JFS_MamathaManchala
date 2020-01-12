import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {

  selectdMobile;

  mobiles = [

{
  name: 'Redmi',
  imgURL: 'https://cdn.pixabay.com/photo/2015/01/20/13/13/ipad-605439__340.jpg',
  details: 'MobilesLaptopsTabletsCamerasTVsPowerbanksSmartwatchesACsWashing M/CsRefrigeratorsFitnessbands. There are too many mobile phones in the market now.'

},

{
  name: 'Oppo',
  imgURL: 'https://cdn.pixabay.com/photo/2015/03/26/09/41/phone-690091__340.jpg',
  details: 'MobilesLaptopsTabletsCamerasTVsPowerbanksSmartwatchesACsWashing M/CsRefrigeratorsFitnessbands. There are too many mobile phones in the market now. '

},

{
  name: 'Real Me',
  imgURL: 'https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770__340.png',
  details: 'MobilesLaptopsTabletsCamerasTVsPowerbanksSmartwatchesACsWashing M/CsRefrigeratorsFitnessbands. There are too many mobile phones in the market now.'

}




  ];

  constructor() { }

  selectMobile(mobile){
    this.selectdMobile = mobile;
  }




  ngOnInit() {
  }

}
