import { Component } from '@angular/core';
import {CardComponent} from "../../card/card.component";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    CardComponent
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

}
