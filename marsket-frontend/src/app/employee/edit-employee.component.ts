import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../services/employee.service';
import { Router } from '@angular/router';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private employeeService: EmployeeService) { }

  employee: Employee;
  editForm: FormGroup;

  ngOnInit() {
    this.editForm = this.formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      cpf: ['', Validators.required],
      salary: ['', Validators.required]
    });

    this.employee = this.employeeService.employee;

    this.editForm.setValue({
      firstName: this.employee.firstName,
      lastName: this.employee.lastName,
      cpf: this.employee.cpf,
      salary: this.employee.salary
    });
  }

  onSubmit() {
    if (this.editForm.invalid) {
      return;
    }

    this.employee.firstName = this.editForm.value.firstName;
    this.employee.lastName = this.editForm.value.lastName;
    this.employee.cpf = this.editForm.value.cpf;
    this.employee.salary = this.editForm.value.salary;

    this.employeeService.editEmployee(this.employee)
      .subscribe(sucess => {
        this.router.navigate(['list-employee']);
      });
  }
}
