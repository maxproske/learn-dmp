import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, HttpClientModule],
  templateUrl: './app.component.html',
  // template: '<h1>Hello world!</h1>',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'my-angular-app';
}
