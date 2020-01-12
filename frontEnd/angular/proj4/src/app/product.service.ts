


import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  selectedProductToUpdate: Product;
  api = 'http://localhost:8084';

  constructor(private http: HttpClient) { }

  postData(product): Observable<any> {
    return this.http.post<any>(
      `${this.api}/add-product`,
      product);
   }

   getData(): Observable<any> {
     return this.http.get<any>(`${this.api}/view-allproducts`);
   }
   deleteData(product: Product): Observable<any> {
     return this.http.delete<any>(`${this.api}/delete-product/${product.id}`
     );
   }
     updateData(product): Observable<any>{
return this.http.put<any>(`${this.api}/edit-product`,product);
     }
   }
