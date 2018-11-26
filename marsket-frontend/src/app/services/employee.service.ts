import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Employee } from '../models/employee';

@Injectable({
  providedIn: 'root'
})
export  class  EmployeeService {

  public employee: Employee;

  API_URL = 'http://localhost:4200/api/marsket-backend/rest/';

  constructor(private  httpClient:  HttpClient) {}

  listEmployees(){
    return this.httpClient.get(`${this.API_URL}employee/list`);
  }

  addEmployee(employee: Employee){
    return this.httpClient.post(`${this.API_URL}employee/add`, employee);
  }

  deleteEmployee(employee: Employee) {
    return this.httpClient.post(`${this.API_URL}employee/remove`, employee);
  }

  editEmployee(employee: Employee) {
    return this.httpClient.post(`${this.API_URL}employee/edit`, employee);
  }
}
