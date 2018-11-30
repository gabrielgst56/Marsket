import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductService } from '../services/product.service';
import { Router } from '@angular/router';
import { Product } from '../models/product';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private productService: ProductService) { }

  submitted = false
  product: Product;
  addForm: FormGroup;

  ngOnInit() {
    this.addForm = this.formBuilder.group({
      barCode: ['', Validators.required],
      name: ['', Validators.required],
      price: [0.0, Validators.required],
      quantity: [0, Validators.required],
      discount: []
    });
  }

  get f() { return this.addForm.controls; }

  onSubmit() {
    this.submitted = true;

    if (this.addForm.invalid) {
      return;
    }

    if (this.addForm.value.discount == null) {
      this.addForm.value.discount = false;
    }

    const product: Product = new Product(
      0,
      this.addForm.value.barCode,
      this.addForm.value.name,
      this.addForm.value.price,
      this.addForm.value.quantity,
      this.addForm.value.discount
    );

    this.productService.addProduct(product)
      .subscribe(data => {
        this.router.navigate(['homepage'])
      })
  }

  return() {
    this.router.navigate(['homepage']);
  }

}
