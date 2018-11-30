import { Component, OnInit } from '@angular/core';
import { Router } from '../../../node_modules/@angular/router';
import { Product } from '../models/product';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  private products: Array<object> = [];

  constructor(private router: Router, private productsService: ProductService) { }

  ngOnInit() {
    this.getProducts();
  }

  public getProducts() {
    this.productsService.listProducts().subscribe((data: Array<Product>) => {
      this.products = data;
    });
  }

  public deleteProduct(product: Product): void {
    this.productsService.deleteProduct(product.Id)
      .subscribe(data => {
        this.getProducts();
      });
  }

  public editBook(product: Product): void {
    this.productsService.product = product;
    this.router.navigate(['edit-product']);
  }

  public addProduct(): void {
    this.router.navigate(['add-product']);
  }

  public listCustomer() {
    this.router.navigate(['list-customer']);
  }

  public listEmployee() {
    this.router.navigate(['list-employee']);
  }

}
