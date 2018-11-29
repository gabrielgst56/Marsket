import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from '../services/customer.service';
import { Customer } from '../models/customer';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {


  constructor(private formBuilder: FormBuilder, private router: Router, private  customerService:  CustomerService) {

  }

  submitted = false;
  customer:  Customer;
  addForm: FormGroup;

  ngOnInit() {

    this.addForm = this.formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      cpf: ['', Validators.required],
      discount: []
    });
  }


  get f() { return this.addForm.controls; }

  onSubmit() {
    this.submitted = true;

    if (this.addForm.invalid) {
        return;
    }

    const customer: Customer = new Customer(
      this.addForm.value.firstName,
      this.addForm.value.lastName,
      this.addForm.value.cpf,
      this.addForm.value.discount
    );

    this.customerService.addCustomer(customer)
    .subscribe( data => {
      this.router.navigate(['homepage']);
    });
  }

  return() {
    this.router.navigate(['homepage']);
  }

}

