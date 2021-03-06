import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeService } from '../services/employee.service';
import { Employee } from '../models/employee';

@Component({
    selector: 'app-list-employee',
    templateUrl: 'list-employee.component.html',
    styleUrls: ['list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {

    private employees: Array<object> = [];
    private employee: Employee;

    constructor(private router: Router, private employeesService: EmployeeService) { }

    ngOnInit() {
        this.getEmployees();
    }

    public getEmployees() {
        this.employeesService.listEmployees()
            .subscribe((data: Array<Employee>) => {
                this.employees = data;
            });
    }

    public editEmployee(employee: Employee): void {
        this.employeesService.employee = employee;
        this.router.navigate(['edit-employee']);
    }

    public delEmployee(id: number): void {
        this.employeesService.delEmployee(id)
            .subscribe(sucess => { this.ngOnInit(); });
    }
}
