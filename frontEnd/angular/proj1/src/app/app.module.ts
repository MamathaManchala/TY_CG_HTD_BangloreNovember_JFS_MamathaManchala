import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { RouterModule, ChildActivationEnd } from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { LateCommersComponent } from './late-commers/late-commers.component';
import { ProductsComponent } from './products/products.component';
import { ImagesComponent } from './images/images.component';
import { ColorDirective } from './color.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikeComponent } from './bike/bike.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    DataBindingComponent,
    LateCommersComponent,
    ProductsComponent,
    ImagesComponent,
    ColorDirective,
    ParentComponent,
    ChildComponent,
    BikeComponent,
    BikeDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      { path: ' ', component: HomeComponent },
      { path: 'late-commers', component: LateCommersComponent },
      { path: 'products', component: ProductsComponent },
      { path: 'images', component: ImagesComponent },
      { path: 'parent', component: ParentComponent},
      { path: 'bikes', component: BikeComponent}
]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
