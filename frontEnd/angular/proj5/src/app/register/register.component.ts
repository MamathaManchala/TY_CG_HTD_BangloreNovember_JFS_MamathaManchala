import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
message: string;

  error: string;

  constructor(private auth: AuthenticationService) { }

  register(form: NgForm) {
    this.auth.registerUser(form.value).subscribe(res => {
      console.log(res);
      this.message = res.message;
      form.reset();
      setTimeout(() => {
        this.message = null;
      }, 5000);
    }, err => {
      console.log(err);
      form.reset();
      this.error = err.error.message;
      setTimeout(() => {
        this.error = null;
      }, 5000);
    });
  }

  ngOnInit() {
  }

}
