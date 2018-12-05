import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AddProductComponent } from './product/add-product.component';
import { AddCustomerComponent } from './customer/add-customer.component';
import { AddEmployeeComponent } from './employee/add-employee.component';
import { ListProductComponent } from './product/list-product.component';
import { ListCustomerComponent } from './customer/list-customer.component';
import { ListEmployeeComponent } from './employee/list-employee.component';
import { DialogConfirmComponent } from './dialog/dialog-confirm.component';
import { EditProductComponent } from './product/edit-product.component';
import { EditCustomerComponent } from './customer/edit-customer.component';
import { EditEmployeeComponent } from './employee/edit-employee.component';
import { LayoutModule } from '@angular/cdk/layout';
import { SaleComponent } from './sale/sale.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomepageComponent,
    AddCustomerComponent,
    AddEmployeeComponent,
    ListEmployeeComponent,
    ListCustomerComponent,
    AddProductComponent,
    DialogConfirmComponent,
    EditCustomerComponent,
    ListProductComponent,
    EditEmployeeComponent,
    EditProductComponent,
    SaleComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    LayoutModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
