package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    private PosterManager posterManager = new PosterManager();
    private PosterManager posterManager1 = new PosterManager(5);
    private PosterManager posterManager2 = new PosterManager(9);


    private Movie movie = new Movie(1, "Terminator", "Action");
    private Movie movie1 = new Movie(2, "Terminator 2", "Action");
    private Movie movie2 = new Movie(3, "Batman", "Action");
    private Movie movie3 = new Movie(4, "Number One", "Comedy");
    private Movie movie4 = new Movie(5, "MadMax", "Action");
    private Movie movie5 = new Movie(6, "Green Mile", "Drama");
    private Movie movie6 = new Movie(7, "Black Suit", "Horror");
    private Movie movie7 = new Movie(8, "The Good,the Bad and the Ugly", "Western");
    private Movie movie8 = new Movie(9, "Transformers", "Action");
    private Movie movie9 = new Movie(10, "It", "Horror");

    @Test
    void ShouldAddMoviesDefault() {
        posterManager.add(movie);
        posterManager.add(movie1);
        posterManager.add(movie2);
        posterManager.add(movie3);
        posterManager.add(movie4);
        posterManager.add(movie5);
        posterManager.add(movie6);
        posterManager.add(movie7);
        posterManager.add(movie8);
        posterManager.add(movie9);
        Movie[] actual = posterManager.getMovies();
        Movie[] expected = new Movie[]{movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1, movie};
        assertArrayEquals(expected, actual);

    }

    @Test
    void ShouldGetMovies() {
        posterManager1.add(movie);
        posterManager1.add(movie1);
        posterManager1.add(movie2);
        posterManager1.add(movie3);
        posterManager1.add(movie4);
        posterManager1.add(movie5);
        posterManager1.add(movie6);
        posterManager1.add(movie7);
        posterManager1.add(movie8);
        posterManager1.add(movie9);
        Movie[] actual = posterManager1.getMovies();
        Movie[] expected = new Movie[]{movie9, movie8, movie7, movie6, movie5};
        assertArrayEquals(expected, actual);
        posterManager2.add(movie);
        posterManager2.add(movie1);
        posterManager2.add(movie2);
        posterManager2.add(movie3);
        posterManager2.add(movie4);
        posterManager2.add(movie5);
        posterManager2.add(movie6);
        posterManager2.add(movie7);
        posterManager2.add(movie8);
        posterManager2.add(movie9);
        Movie[] actual1 = posterManager2.getMovies();
        Movie[] expected1 = new Movie[]{movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected1, actual1);
    }

    @Test
    void ShouldRemoteMoviesFilmId() {
        posterManager.add(movie);
        posterManager.add(movie1);
        posterManager.add(movie2);
        posterManager.add(movie3);
        posterManager.add(movie4);
        posterManager.add(movie5);
        posterManager.add(movie6);
        posterManager.add(movie7);
        posterManager.add(movie8);
        posterManager.add(movie9);
        Movie[] actual = posterManager.getMovies();
        Movie[] expected = new Movie[]{movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        assertArrayEquals(expected, actual);

    }
}

