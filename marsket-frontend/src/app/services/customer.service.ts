import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Customer } from '../models/customer';

@Injectable({
  providedIn: 'root'
})
export  class  CustomerService {

  public user: Customer;

  API_URL  =  'http://localhost:4200/api/marsket-backend/rest/';

  constructor(private  httpClient:  HttpClient) {}

  getLogin(customer : Customer): any {

    //return this.httpClient.get(`${this.API_URL}user/login/${user.Login}/${user.Password}`);
  }

  addUser(customer : Customer) {
    
    //return this.httpClient.post(`${this.API_URL}user/add`, user);
  }
}
