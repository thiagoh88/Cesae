import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {CardComponent} from "./card/card.component";
import {HeaderComponent} from "./master-page/header/header.component";
import {FooterComponent} from "./master-page/footer/footer.component";
import {CarouselComponent} from "./carousel/carousel.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CardComponent, HeaderComponent, FooterComponent, CarouselComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'cesae-angular-app-base';
  name: string = 'Thiago Pereira'

}
