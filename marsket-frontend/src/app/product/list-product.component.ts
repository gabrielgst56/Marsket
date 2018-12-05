import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../services/product.service';
import { Product } from '../models/product';

@Component({
  selector: 'app-list-product',
  templateUrl: './list-product.component.html',
  styleUrls: ['./list-product.component.css']
})
export class ListProductComponent implements OnInit {

  private products: Array<object> = [];
  private product: Product;

  constructor(private router: Router, private productService: ProductService) { }

  ngOnInit() {
    this.getProducts();
  }

  public getProducts() {
    this.productService.listProducts()
      .subscribe((data: Array<Product>) => {
        this.products = data;
      });
  }

  public editProduct(product: Product): void {
    this.productService.product = product;
    this.router.navigate(['edit-product']);
  }

  public delProduct(id: number): void {
    this.productService.delProduct(id)
      .subscribe(sucess => { this.ngOnInit(); });
  }
}
