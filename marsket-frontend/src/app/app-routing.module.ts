import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AddCustomerComponent } from './customer/add-customer.component';

const routes: Routes = [
    { path:  '', redirectTo:  'login', pathMatch:  'full' },
{
    path:  'login',
    component:  LoginComponent
},
{
    path: 'homepage',
    component: HomepageComponent
},
{
    path: 'add-customer',
    component: AddCustomerComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
