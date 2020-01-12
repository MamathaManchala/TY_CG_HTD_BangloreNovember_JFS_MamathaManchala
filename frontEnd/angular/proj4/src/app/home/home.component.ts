import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription, interval } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy {

  mySubcription: Subscription;


  constructor(private router: Router) {  
    this.mySubcription = interval(2000).subscribe(data => {
      console.log(data);
    });
  }
  goToId(id, name, imgURL) { 
    // this.router.navigateByUrl(`/user/${id}`);

    this.router.navigate([`/user/${id}`], {
queryParams: {userName: name, userImage: imgURL}
    });
  }

  ngOnInit() {
  }

  ngOnDestroy() {
    this.mySubcription.unsubscribe();
  }

}
