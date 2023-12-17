import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, RouterOutlet } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, HttpClientModule, HomeComponent, RouterModule],
  // templateUrl: './app.component.html',
  template: `
    <main>
      <a [routerLink]="['/']">
        <header class="brand-name">
          Home
        </header>
      </a>
      <section class="content">
        <router-outlet></router-outlet>
      </section>
    </main>
  `,
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'hello-world';
}
