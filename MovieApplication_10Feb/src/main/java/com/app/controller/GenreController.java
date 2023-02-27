package com.app.controller;

import com.app.dto.Genre;
import com.app.exception.GenerException;
import com.app.service.GenreSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GenreController {
    @Autowired
    private GenreSer genreSer;

    @PostMapping("genre")
    Genre addNewGenre(@RequestBody Genre genre) {
        Genre genre1 = this.genreSer.addNewGeners(genre);
        return genre1;
    }

    @GetMapping("genreid/{id}")
    Optional<Genre> addGenreById(@PathVariable Integer id) throws GenerException {
        Optional<Genre> genre1 = this.genreSer.getGenersById(id);
        return genre1;
    }

    @GetMapping("genrename/{name}")
    Optional<Genre> getrGenreByName(@PathVariable String name) throws GenerException {
        Optional<Genre> genre1 = this.genreSer.getGeneresByName(name);
        return genre1;
    }

    @GetMapping("genres")
    List<Genre> getAllGenre() {
        List<Genre> genre1 = this.genreSer.getAllGeners();
        return genre1;
    }

    @DeleteMapping("genre/{id}")
    String deleteGenreById(@PathVariable Integer id) throws GenerException {
        this.genreSer.deleteGenerById(id);
        return  "Genre got deleted successfully.";
    }
}