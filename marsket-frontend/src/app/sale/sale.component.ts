import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../models/user';
import { Employee } from '../models/employee';
import { UserService } from '../services/user.service';
import { SaleService } from '../services/sale.service';
import { Product } from '../models/product';
import { Customer } from '../models/customer';

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
  customer: Customer;
  user: User;
  createForm: FormGroup;
  product: Product;
  discountAppplied: Boolean;

  ngOnInit() {
    this.createForm = this.formBuilder.group({
      barCode: ['', Validators.required],
      quantity: ['', Validators.required],
      customerCpf: [''],
      totalPrice: ['', Validators.required],
      employee: ['', Validators.required],
      customer: ['', Validators.required]
    });

    this.user = this.userService.user;

    this.createForm.setValue({
      barCode: '',
      quantity: '',
      customerCpf: '',
      totalPrice: 0,
      employee: this.user.Login,
      customer: ''
    });
  }

  public addProduct() {
    this.saleService.getProduct(this.createForm.value.barCode, this.createForm.value.quantity)
      .subscribe((data: Product) => {
        if (data != null) {
          this.products.push(data);
          this.createForm.setValue({
            barCode: '',
            quantity: '',
            customerCpf: this.createForm.value.customerCpf,
            totalPrice: (data.price * data.quantity) + this.createForm.value.totalPrice,
            employee: this.createForm.value.employee,
            customer: this.createForm.value.customer
          });
        }
      });
  }

  public getCustomer() {
    this.saleService.getCustomer(this.createForm.value.customerCpf)
      .subscribe((data: Customer) => {
        if (data != null) {

          let totalPrice = this.createForm.value.totalPrice;
          if (!this.discountAppplied && data.haveDiscount) {
            this.discountAppplied = true;
            totalPrice = totalPrice * 0.9;
          }
          this.createForm.setValue({
            barCode: '',
            quantity: '',
            customerCpf: data.cpf,
            totalPrice: totalPrice,
            employee: this.createForm.value.employee,
            customer: data.firstName + ' ' + data.lastName
          });
        }
      });

  }
}
