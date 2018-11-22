import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export  class  UserService {

  public user: User;

  API_URL  =  'localhost:8080/marsket-backend/rest/';

  constructor(private  httpClient:  HttpClient) {}

  getLogin(user: User): any {
    const params = new HttpParams().set('username', this.user.Login).set('password', this.user.Password);

    return this.httpClient.get(`${this.API_URL}user/login`, {params});
  }

  addUser(user: User) {
    return this.httpClient.post(`${this.API_URL}user/add`, user);
  }
}
