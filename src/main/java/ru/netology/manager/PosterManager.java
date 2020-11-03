package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.domain.Movie;

@Data

public class PosterManager {
    int moviesCount = 10;

    public PosterManager() {
    }

    public PosterManager(int moviesCount) {
        this.moviesCount = moviesCount;
    }

    private Movie[] movies = new Movie[0];

    public void add(Movie movie) {
        Movie[] poster = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            poster[i] = movies[i];
        }
        System.arraycopy(movies, 0, poster, 0, movies.length);
        int lastIndex = poster.length - 1;
        poster[lastIndex] = movie;
        movies = poster;
    }

    public Movie[] getMovies() {
        Movie[] result = new Movie[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        Movie[] resultList = new Movie[moviesCount];
        for (int i = 0; i < resultList.length; i++) {
            resultList[i] = result[i];
        }
        return resultList;
    }
}


