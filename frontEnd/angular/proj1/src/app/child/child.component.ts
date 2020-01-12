import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input() dataFromParent;

  @Output() childEvent = new EventEmitter();

  constructor() {
    setTimeout(()=>{ 
    console.log(this.dataFromParent);
   }, 2000 );
   }
   
//to send the data to parent Component

   sendData(data){
     this.childEvent.emit(data);
   }

  ngOnInit() {
  }

}
