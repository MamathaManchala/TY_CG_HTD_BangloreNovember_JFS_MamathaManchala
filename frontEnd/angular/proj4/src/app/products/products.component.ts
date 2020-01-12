import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import {HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  message;
  products: Product[];

  date =new Date();

  constructor(private productService: ProductService, private router: Router) {
    this.getProducts();

    // this.deleteProduct(product: Product);

    // selectProduct(product);

   }

   getProducts() {
     this.productService.getData().subscribe(response => {
       console.log(response);
       this.products = response.product;
     }, err => {
       console.log(err);
     });
   }
   
deleteProduct(product: Product) {
    this.productService.deleteData(product).subscribe(response => {
      console.log(response);
      if (response.message === 'deleted successfully') {
        this.products.splice(this.products.indexOf(product), 1);
        this.message = response.message;
      }
    });
  }
  deleteMessage() {
    this.message = null;
  }

  selectProduct(product) {
    this.productService.selectedProductToUpdate = product;
    this.router.navigateByUrl('/edit-product');
  }
  ngOnInit() {
  }
}