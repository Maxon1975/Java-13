package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.DataMovie;

import static org.junit.jupiter.api.Assertions.*;

class ManagerMovieTest {

    ManagerMovie manager = new ManagerMovie();
    DataMovie film = new DataMovie(8,"House of Cards", "serials",true);

    @Test
    void shouldAddMovie (){
        DataMovie[] actual = manager.addMovie(film);
        DataMovie[] expected = {new DataMovie(1, "Soul", "cartoon",false),
                new DataMovie(2, "Call me", "action",false),
                new DataMovie(3, "Gentlemen", "action",false),
                new DataMovie(4, "Invisible", "Thriller",false),
                new DataMovie(5, "Troll's tour", "cartoon",true),
                new DataMovie(6, "I BelieveInLove", "romance",true),
                new DataMovie(7, "Pinocchio", "children",true),
                new DataMovie(8,"House of Cards", "serials",true)};
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldGetAllMovies (){
        DataMovie [] actual= manager.getAllMovies();
        DataMovie [] expected ={
                new DataMovie(7, "Pinocchio", "children",true),
                new DataMovie(6, "I BelieveInLove", "romance",true),
                new DataMovie(5, "Troll's tour", "cartoon",true),
                new DataMovie(4, "Invisible", "Thriller",false),
                new DataMovie(3, "Gentlemen", "action",false),
                new DataMovie(2, "Call me", "action",false),
                new DataMovie(1, "Soul", "cartoon",false)};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetFiveMovies (){
        DataMovie[] actual = manager.getNMovies();
        DataMovie [] expected = {new DataMovie(7,"Pinocchio", "children",true),
                new DataMovie(6, "I BelieveInLove", "romance",true),
                new DataMovie(5, "Troll's tour", "cartoon",true),
                new DataMovie(4, "Invisible", "Thriller",false),
                new DataMovie(3, "Gentlemen", "action",false)};
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldGetMovies (){
        manager.setMoviesQuantity(1);
        DataMovie [] actual=manager.getNMovies();
        DataMovie[] expected ={new DataMovie(7,"Pinocchio", "children",true)};
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldGetSevenMovies (){
        manager.setMoviesQuantity(8);
        DataMovie [] actual=manager.getNMovies();
        DataMovie[] expected ={new DataMovie(7,"Pinocchio", "children",true),
                new DataMovie(6, "I BelieveInLove", "romance",true),
                new DataMovie(5, "Troll's tour", "cartoon",true),
                new DataMovie(4, "Invisible", "Thriller",false),
                new DataMovie(3, "Gentlemen", "action",false),
                new DataMovie(2, "Call me", "action",false),
                new DataMovie(1, "Soul", "cartoon",false)};
        assertArrayEquals(expected, actual);
    }
}