import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../services/customer.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Customer } from '../models/customer';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private customerService: CustomerService) {

   }

  customer: Customer;
  editForm: FormGroup;

  ngOnInit() {

    this.editForm = this.formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      cpf: ['', Validators.required],
      discount: []
    });

    this.customer = this.customerService.customer;

    this.editForm.setValue({
      firstName : this.customer.firstName,
      lastName : this.customer.lastName,
      cpf : this.customer.cpf,
      discount : this.customer.haveDiscount
    });
  }

  onSubmit() {

    if (this.editForm.invalid) {
        return;
    }

    this.customer.firstName = this.editForm.value.firstName;
    this.customer.lastName = this.editForm.value.lastName;
    this.customer.cpf = this.editForm.value.cpf;
    this.customer.haveDiscount = this.editForm.value.discount == null ? false : true;


    this.customerService.editCustomer(this.customer)
    .subscribe(
      data => {
        this.router.navigate(['list-customer']);
      });
  }

  return() {
    this.router.navigate(['list-customer']);
  }
}
