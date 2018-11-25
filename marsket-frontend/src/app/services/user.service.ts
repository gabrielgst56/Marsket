import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export  class  UserService {

  public user: User;

  API_URL  =  'http://localhost:4200/api/marsket-backend/rest/';

  constructor(private  httpClient:  HttpClient) {}

  getLogin(user: User): any {

    return this.httpClient.get(`${this.API_URL}user/login/${user.Login}/${user.Password}`);
  }

  addUser(user: User) {
    
    return this.httpClient.post(`${this.API_URL}user/add`, user);
  }
}
