import { Component, OnInit, DefaultIterableDiffer } from '@angular/core';

@Component({
  selector: 'app-late-commers',
  templateUrl: './late-commers.component.html',
  styleUrls: ['./late-commers.component.css']
})
export class LateCommersComponent implements OnInit {

  flag: false;

  person ='mammu';

  message: String;

  lateCommers: String[] =[
    'mammu',
    'kavi',
    'jyo',
    'yashu',
    'Ammu'

  ]

  constructor() { }

  deleteLateCommer(name : String){
    this.lateCommers.splice(this.lateCommers.indexOf(name),1);
    this.message=`${name} is deleted`;
    setTimeout(()=>{
      this.message=null;
    },2000
    );
   
  }

  ngOnInit() {
  }

}
