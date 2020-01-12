import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {



  constructor(public productService: ProductService, private router: Router ) { }

    updateProduct(form: NgForm) {
      this.productService.updateData(form.value).subscribe(res => {
        console.log(res);
        if (res.message === 'update successfully') {
          this.router.navigateByUrl('/products');
        } 
        form.reset();
      });
    }

  ngOnInit() {
  }



}
