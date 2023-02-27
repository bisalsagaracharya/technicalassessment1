package com.app.service;

import com.app.dto.Genre;
import com.app.exception.GenerException;
import com.app.repository.GenreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServImpl implements GenreSer{

    @Autowired
    private GenreRepo genreRepository;

    @Override
    public Genre addNewGeners(Genre geners) {

        return this.genreRepository.save(geners);
    }

    @Override
    public Optional<Genre> getGeneresByName(String name) {

        Optional<Genre> foundByName = this.genreRepository.findByName(name);
        return foundByName;
    }

    @Override
    public Optional<Genre> getGenersById(Integer id) throws GenerException {
        Optional<Genre> findById = this.genreRepository.findById(id);
        if (findById.isEmpty()) {
            throw new GenerException("Geners not available for given id");
        } else {
            return findById;
        }
    }

    @Override
    public List<Genre> getAllGeners() {
        return this.genreRepository.findAll();
    }

    @Override
    public void deleteGenerById(Integer id) throws GenerException {
        Optional<Genre> geners = this.genreRepository.findById(id);
        if(geners.isEmpty()){
            throw new GenerException("Geners not available");
        }else{
         this.genreRepository.deleteById(id);
        }
    }
}
