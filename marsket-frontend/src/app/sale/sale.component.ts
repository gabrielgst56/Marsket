import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../models/user';
import { Employee } from '../models/employee';
import { UserService } from '../services/user.service';
import { SaleService } from '../services/sale.service';
import { Product } from '../models/product';

@Component({
  selector: 'app-sale',
  templateUrl: './sale.component.html',
  styleUrls: ['./sale.component.css']
})
export class SaleComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private saleService: SaleService
    , private userService: UserService) { }

  products: Array<object> = [];
  employee: Employee;
  user: User;
  createForm: FormGroup;

  ngOnInit() {
    this.products.push(new Product(0, '123', '123', 1, 1, true));
    this.products.push(new Product(2, '123', '123', 1, 1, true));
    this.products.push(new Product(3, '123', '123', 1, 1, true));
    this.createForm = this.formBuilder.group({
      barCode: ['', Validators.required],
      quantity: ['', Validators.required],
      customerCpf: [''],
      totalPrice: ['', Validators.required],
      employee: ['', Validators.required]
    });

    this.user = this.userService.user;

    this.createForm.setValue({
      barCode: '',
      quantity: '',
      customerCpf: '',
      totalPrice: 0,
      employee: this.user.Login
    });
  }

  public addProduct() {
    this.saleService.getProduct(this.createForm.value.barCode, this.createForm.value.quantity)
      .subscribe((data: Product) => {
        if (data != null) {
          this.products.push(data);
          this.createForm.value.totalPrice = data.price * data.quantity;
        }
      });
  }

  public getCustomer() {
    this.saleService.getCustomer(this.createForm.value.customerCpf)
      .subscribe((data: Employee) => {
        if (data != null) {
          this.employee = data;
        }
      });

  }
}
