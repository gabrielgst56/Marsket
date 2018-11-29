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
  employeeAddForm: FormGroup;

  ngOnInit() {
    this.employeeAddForm = this.formBuilder.group({
      cpf: ['', Validators.required],
      firstName: ['', Validators.required],
      lastName: ['', Validators.required]
    });
  }

  get f() { return this.employeeAddForm.controls; }

  onSubmit() {
    this.submitted = true;

    if (this.employeeAddForm.invalid) {
      return;
    }


  }

}