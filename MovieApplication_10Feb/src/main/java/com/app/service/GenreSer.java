package com.app.service;

import com.app.dto.Genre;
import com.app.exception.GenerException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface GenreSer {
    Genre addNewGeners(Genre geners);
    Optional<Genre> getGeneresByName(String name);
    Optional<Genre> getGenersById(Integer id) throws GenerException;
    List<Genre> getAllGeners();
    void deleteGenerById(Integer id) throws GenerException;
}
