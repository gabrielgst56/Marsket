import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';
import { User } from '../models/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private userService: UserService) {

  }

  submitted = false;
  user: User;
  loginForm: FormGroup;

  ngOnInit() {

    this.loginForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }


  get f() { return this.loginForm.controls; }

  onSubmit() {
    this.submitted = true;

    if (this.loginForm.invalid) {
      return;
    }

    const user: User = new User(
      this.loginForm.value.username,
      this.loginForm.value.password,
      null,
    );

    this.userService.getLogin(user)
      .subscribe(
        data => {
          this.router.navigate(['homepage']);
        });
  }

}
