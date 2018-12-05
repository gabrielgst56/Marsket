import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ProductService } from '../services/product.service';
import { User } from '../models/user';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-sale',
  templateUrl: './sale.component.html',
  styleUrls: ['./sale.component.css']
})
export class SaleComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private productService: ProductService) { }

  products: Array<object> = [];
  employee: Employee;
  user: User;
  createForm: FormGroup;

  ngOnInit() {

    this.createForm = this.formBuilder.group({
      barCode: ['', Validators.required],
      quantity: ['', Validators.required],
      customerCpf: [''],
      totalPrice: ['', Validators.required],
      employee: ['', Validators.required],
      haveDiscount: []
    });

  }

}
