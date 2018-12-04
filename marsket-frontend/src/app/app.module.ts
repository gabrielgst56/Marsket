import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AddCustomerComponent } from './customer/add-customer.component';
import { AddEmployeeComponent } from './employee/add-employee.component';
import { ListEmployeeComponent } from './employee/list-employee.component';
import { ListCustomerComponent } from './customer/list-customer.component';
import { AddProductComponent } from './product/add-product.component';
import { MenuComponent } from './menu/menu.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule, MatButtonModule, MatSidenavModule, MatIconModule, MatListModule } from '@angular/material';
import { DialogConfirmComponent } from './dialog/dialog-confirm.component';
import { EditCustomerComponent } from './customer/edit-customer.component';

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
    MenuComponent,
    DialogConfirmComponent,
    EditCustomerComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
