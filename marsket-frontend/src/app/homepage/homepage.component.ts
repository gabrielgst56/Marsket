import { Component, OnInit } from '@angular/core';
import { Router } from '../../../node_modules/@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  private products: Array<object> = [];

  constructor(private router: Router) { }

  ngOnInit() { }

  public listProduct(): void {
    this.router.navigate(['list-product']);
  }

  public listCustomer(): void {
    this.router.navigate(['list-customer']);
  }

  public listEmployee(): void {
    this.router.navigate(['list-employee']);
  }

}
