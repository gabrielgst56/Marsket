import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { EmployeeService } from "../services/employee.service";
import { Employee } from "../models/employee";

@Component({
    selector: 'list-employee',
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
            })
    }

    public getEmployee(employee: Employee): void {
        this.employeesService.getEmployee(employee.id)
            .subscribe((data: Employee) => {
                this.employee = data;
            })
    }

    public delEmployee(employee: Employee): void {
        this.employeesService.delEmployee(employee.id)
            .subscribe(data => {
                this.router.navigate(['list-employee']);
            })
    }

    public editEmployee(employee: Employee): void {
        this.employeesService.editEmployee(employee)
            .subscribe(data => {
                this.router.navigate(['add-employee']);
            })
    }
}