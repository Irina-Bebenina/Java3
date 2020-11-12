package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTestNonEmptyWithSetup {
    private PosterManager manager = new PosterManager();
    private Movie first = new Movie(1, 1, "first", 1, 1);
    private Movie second = new Movie(2, 2, "second", 1, 1);
    private Movie third = new Movie(3, 3, "third", 1, 1);

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void shouldRemoveIfExists() {
        int idToRemove = 1;
        manager.removeByID(idToRemove);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveIfNotExists() {
        int idToRemove = 4;
        manager.removeByID(idToRemove);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second, first};
        assertArrayEquals(expected, actual);
    }
}
