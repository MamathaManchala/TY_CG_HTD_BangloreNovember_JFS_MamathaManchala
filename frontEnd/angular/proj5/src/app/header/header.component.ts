import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router: Router) { }

  isAdmin() {
    let userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if(userDetails && userDetails.role === 'admin'){
      return true;
    } else {
      return false;
    }
  }

  isUser() {
    let userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if(userDetails && userDetails.role === 'user'){
      return true;
    } else {
      return false;
    }
  }

  isLoggedIn() {
    let userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if(userDetails){
      return true;
    } else {
      return false;
    }
  }

  logout(){
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/login');
  }

  ngOnInit() {
  }

}
