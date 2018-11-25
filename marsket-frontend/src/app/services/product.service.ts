import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Product } from '../models/product';

@Injectable({
  providedIn: 'root'
})
export  class  ProductService {

  public product: Product;

  API_URL  =  'http://localhost:4200/api/marsket-backend/rest/';

  constructor(private  httpClient:  HttpClient) {}

  listProducts(){
    return  this.httpClient.get(`${this.API_URL}product/list`);
  }

  addProduct(product: Product){
    return this.httpClient.post(`${this.API_URL}product/add`, product);
  }

  deleteProduct(product: Product) {
    return this.httpClient.post(`${this.API_URL}product/remove`, product);
  }

  editProduct(product: Product) {
    return this.httpClient.post(`${this.API_URL}product/edit`, product);
  }
}
