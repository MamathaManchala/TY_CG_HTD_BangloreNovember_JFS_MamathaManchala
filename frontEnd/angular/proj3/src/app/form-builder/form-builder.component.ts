import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup, FormArray, FormControl } from '@angular/forms';

@Component({
  selector: 'app-form-builder',
  templateUrl: './form-builder.component.html',
  styleUrls: ['./form-builder.component.css']
})
export class FormBuilderComponent implements OnInit {
  registrationForm: FormGroup;

  constructor(private fb: FormBuilder) { }

  ngOnInit() {

    this.registrationForm = this.fb.group({
      name: this.fb.control(null, [
        Validators.required,
        Validators.minLength(5)
      ]),
      email: this.fb.control(null, [
        Validators.required,
        Validators.maxLength(8),
        Validators.email
      ]),
      password: this.fb.control(null, [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(8)
      ]),
      skills: this.fb.array([
        this.getSkill()


      ])
    });
   
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

