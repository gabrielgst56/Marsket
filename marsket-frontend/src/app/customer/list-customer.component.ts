import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from '../services/customer.service';
import { Customer } from '../models/customer';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {

    private customers: Array<object> = [];
    private customer: Customer;

    constructor(private router: Router, private customerService: CustomerService) { }

  ngOnInit() {
      this.getCustomers();
  }

  public getCustomers() {
      this.customerService.listCustomers()
          .subscribe((data: Array<Customer>) => {
              this.customers = data;
          });
  }

  editCustomer(customer: Customer) {
      this.customerService.customer = customer;
      this.router.navigate(['edit-customer']);
    }

  public addCustomer(): void {
    this.router.navigate(['add-customer']);
   }

   public delCustomer(id: number): void {
    this.customerService.delCustomer(id)
        .subscribe(sucess => { this.ngOnInit(); });
    }
}
