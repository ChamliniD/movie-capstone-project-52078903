package com.hcltech.movie_capstone_project.service.impl;

import com.hcltech.movie_capstone_project.dto.ActorDTO;
import com.hcltech.movie_capstone_project.dto.GenreDTO;
import com.hcltech.movie_capstone_project.dto.MovieDTO;
import com.hcltech.movie_capstone_project.exception.MovieNotFoundException;
import com.hcltech.movie_capstone_project.model.Movie;
import com.hcltech.movie_capstone_project.repository.MovieRepository;
import com.hcltech.movie_capstone_project.service.MapperService;
import com.hcltech.movie_capstone_project.service.MovieService;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MapperService mapper;

    @Override
    public List<MovieDTO> getAll() {
        return mapper.toDTOMovie(movieRepository.findAll());
    }

    @Override
    public MovieDTO getOneById(int id) {
        return mapper.toDTOMovie(movieRepository.findById(id).orElse(null));
    }

    @Override
    public MovieDTO create(MovieDTO movieDTO) {
        MovieDTO createdMovie = mapper.toDTOMovie(movieRepository.save(mapper.toEntityMovie(movieDTO)));
        LOGGER.debug("Movie created with id:{}", createdMovie.getId());
        return createdMovie;
    }

    @Override
    public MovieDTO update(MovieDTO movieDTO) {
        MovieDTO updatedMovie = mapper.toDTOMovie(movieRepository.save(mapper.toEntityMovie(movieDTO)));
        LOGGER.debug("Movie updated with id:{}", updatedMovie.getId());
        return updatedMovie;
    }

    @Override
    @Transactional
    public void delete(int id) {movieRepository.deleteById(id);
        LOGGER.debug("Movie deleted with id:{}", id);
    }

    @Override
    public List<GenreDTO> getGenresForMovie(int id) throws MovieNotFoundException {
        Optional<Movie> movie = movieRepository.findById(id);
        if( movie.isPresent() ) {
            return mapper.toDTOGenre(movie.get().getGenres().stream().toList());
        }
        else{
            throw new MovieNotFoundException("Movie not found for id: " + id);
        }
    }

    @Override
    public List<ActorDTO> getActorsForMovie(int id) throws MovieNotFoundException {
        Optional<Movie> movie = movieRepository.findById(id);
        if( movie.isPresent() ) {
            return mapper.toDTOActor(movie.get().getActors().stream().toList());
        }
        else{
            throw new MovieNotFoundException("Movie not found for id: " + id);
        }
    }

}
