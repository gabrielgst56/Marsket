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

    public deleteEmployee(employee: Employee): void {
        this.employeesService.deleteEmployee(employee)
            .subscribe(data => {
                this.getEmployees();
            })
    }

    public addEmployee(): void {
        this.router.navigate(['add-employee']);
    }
}