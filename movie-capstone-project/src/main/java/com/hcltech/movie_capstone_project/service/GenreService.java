package com.hcltech.movie_capstone_project.service;

import com.hcltech.movie_capstone_project.dto.GenreDTO;
import com.hcltech.movie_capstone_project.dto.MovieDTO;

import java.util.List;

public interface GenreService {

    List<GenreDTO> getAll();

    GenreDTO getOneById(int id);

    GenreDTO create(GenreDTO genreDTO);

    GenreDTO update(GenreDTO genreDTO);

    void delete(int id);
}
