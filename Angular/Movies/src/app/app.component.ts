import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {MoviesComponent} from './movies/movies.component';
import {FooterComponent} from './Master-Page/footer/footer.component';
import {HeaderComponent} from './Master-Page/header/header.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MoviesComponent, FooterComponent, HeaderComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'Movies';
}
