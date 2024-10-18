import { Component } from '@angular/core';
import {CardComponent} from "../../card/card.component";
import {NgForOf, NgIf} from "@angular/common";
import {Card} from "../../models/card.models";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    CardComponent,
    NgIf,
    NgForOf
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  isActive: boolean = true
  number: number = 0
  cards: Card[] = [
    {
      title: 'title 1',
      description: 'description 1',
      image: 'image 1'
    },
    {
      title: 'title 2',
      description: 'description 2',
      image: 'image 2'
    },
    {
      title: 'title 3',
      description: 'description 3',
      image: 'image 3'
    },
  ]
}

