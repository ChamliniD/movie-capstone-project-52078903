package com.hcltech.movie_capstone_project.service;

import com.hcltech.movie_capstone_project.dto.ActorDTO;
import com.hcltech.movie_capstone_project.dto.GenreDTO;
import com.hcltech.movie_capstone_project.dto.MovieDTO;
import com.hcltech.movie_capstone_project.exception.MovieNotFoundException;

import java.util.List;

public interface MovieService {

    List<MovieDTO> getAll();

    MovieDTO getOneById(int id);

    MovieDTO create(MovieDTO movieDTO);

    MovieDTO update(MovieDTO movieDTO);

    void delete(int id);

    List<GenreDTO> getGenresForMovie(int id) throws MovieNotFoundException;

    List<ActorDTO> getActorsForMovie(int id) throws MovieNotFoundException;
}
