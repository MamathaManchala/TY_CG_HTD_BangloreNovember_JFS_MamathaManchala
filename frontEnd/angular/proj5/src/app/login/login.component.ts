import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error: string;
  constructor(private auth: AuthenticationService) { }

  login(form: NgForm){
    this.auth.loginUser(form.value).subscribe(response => {
      console.log(response);
      if (response && response.registered) {
        localStorage.setItem('userDetails', JSON.stringify(response));
        console.log('user Details Inserted in local Storage');
      }
    }, err => {
      console.log(err);
      this.error = err.error.message;
      setTimeout(() => {
        this.error = null;
      }, 5000);
    });
  }

  ngOnInit() {
  }

}
