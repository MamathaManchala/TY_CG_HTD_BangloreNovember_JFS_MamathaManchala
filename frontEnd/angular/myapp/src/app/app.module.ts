import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, ChildActivationEnd } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactusComponent } from './contactus/contactus.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { SectionComponent } from './section/section.component';
import { PagenotFoundComponent } from './pagenot-found/pagenot-found.component';
import { FooterComponent } from './footer/footer.component';
import { MamathaComponent } from './mamatha/mamatha.component';
import { KavithaComponent } from './kavitha/kavitha.component';
import { JyothiComponent } from './jyothi/jyothi.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SectionComponent,
    FooterComponent,
    HomeComponent,
    AboutComponent,
    ContactusComponent,
    RegisterComponent,
    LoginComponent,
    PagenotFoundComponent,
    MamathaComponent,
    KavithaComponent,
    JyothiComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'about' ,component:AboutComponent ,
      //Providing children for the about
    children:[
{ path: 'mamatha', component:MamathaComponent},
{path: 'kavitha', component:KavithaComponent},
{path : 'jyothi', component: JyothiComponent},
  
]},
      {path: 'contact-us' , component: ContactusComponent },
      {path: 'register' , component: RegisterComponent },
      {path: 'login', component: LoginComponent },
      {path: '**' , component: PagenotFoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
