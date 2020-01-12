import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registrationForm: FormGroup;

  constructor() { }

  ngOnInit() {
    this.registrationForm = new FormGroup({
      name: new FormControl(null, [
        Validators.required,
        Validators.minLength(5)
      ]),
      email: new FormControl(null, [
        Validators.required,
        Validators.maxLength(8),
        Validators.email
      ]),
      password: new FormControl(null, [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(8)
      ]),
      skills: new FormArray([
        this.getSkill()


      ])
    });
    console.log(this.registrationForm.get('skills'));
  }

  // to have new FormControl Object

  getSkill(){
    return new FormControl();
  }
  // to push FormControl to FormArray
  addSkill(){
    this.skills.push(this.getSkill());
  }
  // to delete each skill

  deleteSkill(i: number){
    this.skills.removeAt(i);
  }
  
  get name() {
    return this.registrationForm.get('name');
  }
  get email() {
    return this.registrationForm.get('email');
  }

  get password() {
    return this.registrationForm.get('password');
  }

  // to access skills (FormArray)

  get skills(): FormArray {
    return this.registrationForm.get('skills') as FormArray;
  }

  // called after submitting the form

  submitForm() {
    console.log(this.registrationForm.value);
    this.registrationForm.reset();
  }


}
