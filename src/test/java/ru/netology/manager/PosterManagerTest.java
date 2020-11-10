package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
    @Test
    public void shouldRemoveIfExists() {
        PosterManager manager = new PosterManager();
        int idToRemove = 1;
        Movie first = new Movie(1, 1, "first", 1, 1);
        Movie second = new Movie(2, 2, "second", 1, 1);
        Movie third = new Movie(3, 3, "third", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeByID(idToRemove);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveIfNotExists() {
        PosterManager manager = new PosterManager();
        int idToRemove = 4;
        Movie first = new Movie(1, 1, "first", 1, 1);
        Movie second = new Movie(2, 2, "second", 1, 1);
        Movie third = new Movie(3, 3, "third", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeByID(idToRemove);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }
}
