import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { RouterModule, ChildActivationEnd } from '@angular/router';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { FormBuilderComponent } from './form-builder/form-builder.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    RegisterComponent,
    FormBuilderComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      // { path: ' ', redirectTo: 'login', pathMatch: 'full' },
      { path: ' ', component: HeaderComponent },
      { path: 'login', component: LoginComponent },
      { path: 'register', component: RegisterComponent }
]),
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
