import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Employee } from '../models/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  public employee: Employee;

  API_URL = 'http://localhost:4200/api/marsket-backend/rest/';

  constructor(private httpClient: HttpClient) { }

  listEmployees() {
    return this.httpClient.get(`${this.API_URL}employee/list`);
  }

  getEmployee(id: number) {
    return this.httpClient.get(`${this.API_URL}employee/get/` + id);
  }

  addEmployee(employee: Employee) {
    return this.httpClient.post(`${this.API_URL}employee/add`, employee, { headers: { 'Content-Type': 'application/json' } });
  }

  editEmployee(employee: Employee) {
    return this.httpClient.put(`${this.API_URL}employee/edit`, employee, { headers: { 'Content-Type': 'application/json' } });
  }

  delEmployee(id: number) {
    return this.httpClient.delete(`${this.API_URL}employee/del/` + id);
  }
}
