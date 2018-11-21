import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export  class  UserService {


  public user: User;

  API_URL  =  '../api/';

  constructor(private  httpClient:  HttpClient) {}


  searchUser(user: User) {

    const params = new HttpParams().set('login', this.user.Login).set('password', this.user.Password);

    return  this.httpClient.get(`${this.API_URL}book/list`, {params});
  }

  addUser(user: User) {
    return this.httpClient.post(`${this.API_URL}book/add`, user);
  }
}
