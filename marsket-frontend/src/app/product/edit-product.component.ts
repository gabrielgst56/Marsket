import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from '../models/product';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private productService: ProductService) { }

  product: Product;
  editForm: FormGroup;

  ngOnInit() {
    this.editForm = this.formBuilder.group({
      barCode: ['', Validators.required],
      name: ['', Validators.required],
      price: ['', Validators.required],
      quantity: ['', Validators.required],
      haveDiscount: []
    });

    this.product = this.productService.product;

    this.editForm.setValue({
      barCode: this.product.barCode,
      name: this.product.name,
      price: this.product.price,
      quantity: this.product.quantity,
      haveDiscount: this.product.haveDiscount
    });
  }

  onSubmit() {
    if (this.editForm.invalid) {
      return;
    }

    this.product.barCode = this.editForm.value.barCode;
    this.product.name = this.editForm.value.name;
    this.product.price = this.editForm.value.price;
    this.product.quantity = this.editForm.value.quantity;
    this.product.haveDiscount = this.editForm.value.discount == null ? false : true;


    this.productService.editProduct(this.product)
      .subscribe(sucess => {
        this.router.navigate(['list-product']);
      });
  }
}
