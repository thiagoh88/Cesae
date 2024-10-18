import { Component } from '@angular/core';
import { Movie } from '../models/movie.model';
import {NgForOf} from '@angular/common';
import {HeaderComponent} from '../Master-Page/header/header.component';
import {FooterComponent} from '../Master-Page/footer/footer.component';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.scss'],
  standalone: true,
  imports: [NgForOf, HeaderComponent, FooterComponent],
})
export class MoviesComponent {
  movies: Movie[] = [
    { id: 1, year: '1994', title: 'The Shawshank Redemption', description: 'A banker convicted of uxoricide forms a friendship over a quarter century with a hardened convict, while maintaining his innocence and trying to remain hopeful through simple compassion.', poster: 'https://upload.wikimedia.org/wikipedia/pt/d/d2/The_Shawshank_Redemption_p%C3%B4ster.png' },
    { id: 2, year: '1972', title: 'The Godfather', description: 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.', poster: 'https://m.media-amazon.com/images/M/MV5BYTJkNGQyZDgtZDQ0NC00MDM0LWEzZWQtYzUzZDEwMDljZWNjXkEyXkFqcGc@._V1_.jpg' },
    { id: 3, year: '2008', title: 'The Dark Knight', description: 'When a menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman, James Gordon and Harvey Dent must work together to put an end to the madness.', poster: 'https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_.jpg' },
    { id: 4, year: '1974', title: 'The Godfather Part II', description: 'The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.', poster: 'https://m.media-amazon.com/images/M/MV5BNzc1OWY5MjktZDllMi00ZDEzLWEwMGItYjk1YmRhYjBjNTVlXkEyXkFqcGc@._V1_.jpg' },
    { id: 5, year: '1957', title: '12 Angry Men', description: 'The jury in a New York City murder trial is frustrated by a single member whose skeptical caution forces them to more carefully consider the evidence before jumping to a hasty verdict.', poster: 'https://upload.wikimedia.org/wikipedia/commons/b/b5/12_Angry_Men_%281957_film_poster%29.jpg' },
    { id: 6, year: '2003', title: 'The Lord of the Rings: The Return of the King', description: 'Gandalf and Aragorn lead the World of Men against Sauron\'s army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.', poster: 'https://upload.wikimedia.org/wikipedia/en/4/48/Lord_Rings_Return_King.jpg' },
    { id: 7, year: '1993', title: 'Schindlers List', description: 'In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.', poster: 'https://m.media-amazon.com/images/I/817sLmprCSL._AC_UF1000,1000_QL80_.jpg' },
    { id: 8, year: '1994', title: 'Pulp Fiction', description: 'The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.', poster: 'https://resizing.flixster.com/xPYM7zZWJWOcnv52yx5G1kE2Ud8=/fit-in/352x330/v2/https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/p15684_p_v13_an.jpg' },
    { id: 9, year: '2001', title: 'The Lord of the Rings: The Fellowship of the Ring', description: 'A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.', poster: 'https://imagens.publicocdn.com/imagens.aspx/759511?tp=KM' },
    { id: 10, year: '1966', title: 'Il buono, il brutto, il cattivo', description: 'A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.', poster: 'https://m.media-amazon.com/images/S/pv-target-images/a8275e14cf7e2380ad1c6536d214e372c73c53908b26b7e95a70f68e3470d070.jpg' },
  ];
}
