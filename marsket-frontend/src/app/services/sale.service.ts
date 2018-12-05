import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Sale } from '../models/Sale';

@Injectable({
    providedIn: 'root'
})
export class SaleService {

    public sale: Sale;

    API_URL = 'http://localhost:4200/api/marsket-backend/rest/';

    constructor(private httpClient: HttpClient) { }

    listSales() {
        return this.httpClient.get(`${this.API_URL}sale/list`);
    }

    getSale(id: number) {
        return this.httpClient.get(`${this.API_URL}sale/get/` + id);
    }

    addSale(sale: Sale) {
        return this.httpClient.post(`${this.API_URL}sale/add`, sale, { headers: { 'Content-Type': 'application/json' } });
    }

    editSale(sale: Sale) {
        return this.httpClient.put(`${this.API_URL}sale/edit`, sale, { headers: { 'Content-Type': 'application/json' } });
    }

    delSale(id: number) {
        return this.httpClient.delete(`${this.API_URL}sale/del/` + id);
    }
}
