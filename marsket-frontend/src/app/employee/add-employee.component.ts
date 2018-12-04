import { Component, OnInit } from '@angular/core';
import { Router } from '../../../node_modules/@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../services/employee.service';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private employeeService: EmployeeService) {

  }

  submitted = false;
  employee: Employee;
  addForm: FormGroup;

  ngOnInit() {
    this.addForm = this.formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      cpf: ['', Validators.required],
      salary: ['', Validators.required]
    });
  }

  get f() { return this.addForm.controls; }

  onSubmit() {
    this.submitted = true;

    if (this.addForm.invalid) {
      return;
    }

    const employee: Employee = new Employee(
      0,
      this.addForm.value.firstName,
      this.addForm.value.lastName,
      this.addForm.value.cpf,
      this.addForm.value.salary
    );

    this.employeeService.addEmployee(employee)
      .subscribe(data => {
        this.router.navigate(['list-employee']);
      });
  }

}
