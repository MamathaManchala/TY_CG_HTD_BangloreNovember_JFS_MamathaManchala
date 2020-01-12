import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-data-from-json',
  templateUrl: './data-from-json.component.html',
  styleUrls: ['./data-from-json.component.css']
})
export class DataFromJsonComponent implements OnInit {

  products: Product[];

  constructor(private http: HttpClient) {
    this.getDataFromJson();
   }

   getDataFromJson() {
     this.http.get< Product[]>('../../assets/products.json').subscribe(response => {
       console.log(response);
       this.products = response;

     });
   }

  ngOnInit() {
  }

}
interface Product {
  name: string;
  img: string;
  price: number;
}
