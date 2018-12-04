import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AddCustomerComponent } from './customer/add-customer.component';
import { AddEmployeeComponent } from './employee/add-employee.component';
import { ListEmployeeComponent } from './employee/list-employee.component';
import { AddProductComponent } from './product/add-product.component';
import { ListCustomerComponent } from './customer/list-customer.component';
import { MenuComponent } from './menu/menu.component';
import { EditCustomerComponent } from './customer/edit-customer.component';

const routes: Routes = [
    { path: '', redirectTo: 'login', pathMatch: 'full' },
    {
        path: 'login',
        component: LoginComponent
    },
    {
        path: 'homepage',
        component: HomepageComponent
    },
    {
        path: 'list-employee',
        component: ListEmployeeComponent
    },
    {
        path: 'add-employee',
        component: AddEmployeeComponent
    },
    {
        path: 'add-product',
        component: AddProductComponent
    },
    {
        path: 'list-customer',
        component: ListCustomerComponent
    },
    {
        path: 'add-customer',
        component: AddCustomerComponent
    },
    {
        path: 'edit-customer',
        component: EditCustomerComponent
    },
    {
        path: 'menu',
        component: MenuComponent
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {

}
