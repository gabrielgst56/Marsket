import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Customer } from '../models/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  public customer: Customer;

  API_URL = 'http://localhost:4200/api/marsket-backend/rest/';

  constructor(private httpClient: HttpClient) { }

  listCustomers() {
    return this.httpClient.get(`${this.API_URL}customer/list`);
  }

  getCustomer(id: number) {
    return this.httpClient.get(`${this.API_URL}customer/get/` + id);
  }

  addCustomer(customer: Customer) {
    return this.httpClient.post(`${this.API_URL}customer/add`, customer, { headers: { 'Content-Type': 'application/json' } });
  }

  editCustomer(customer: Customer) {
    return this.httpClient.put(`${this.API_URL}customer/edit`, customer, { headers: { 'Content-Type': 'application/json' } });
  }

  delCustomer(id: number) {
    return this.httpClient.delete(`${this.API_URL}customer/del/` + id);
  }
}
