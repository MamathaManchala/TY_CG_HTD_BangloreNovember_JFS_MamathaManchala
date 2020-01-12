import { Component, OnInit, OnDestroy, DoCheck, AfterContentChecked, AfterViewInit, AfterViewChecked, AfterContentInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit, OnDestroy, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit,AfterViewChecked  {

  dataFromChild;


student = {
name: 'mammu',
age: 20,
marks: 50

};

getChildData(data){
  this.dataFromChild = data;
}


  constructor() { 
    console.log('parent called');
  }

  ngOnInit() {
    console.log('parent executed');
  }

  ngOnDestroy(){
    console.log('destroy excecuted');
  }
ngDoCheck(){
console.log('do Check executed');

}
ngAfterContentInit(){
  console.log('aftercontent init executed');

}

ngAfterContentChecked(){
  console.log('after content checked executed');
}
ngAfterViewInit(){
  console.log('after view executed');
}

ngAfterViewChecked(){
  console.log('after view checked executed');
}

}
