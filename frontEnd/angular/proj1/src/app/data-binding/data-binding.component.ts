import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {

  name='Mamatha';
  flag=false;
  twoWayData;

  imgURL="https://cdn.pixabay.com/photo/2019/12/15/17/05/cookies-4697588_960_720.jpg";

  constructor() { 
//     setInterval(()=>{

// this.flag=!this.flag;

//     }, 1000)
  }

  clickMe(input){
    //console.log(input);
    console.log(input.value);
    //this.flag=!this.flag;
  }

  printData(){
  console.log(this.twoWayData);
  }


  ngOnInit() {
  }



}
