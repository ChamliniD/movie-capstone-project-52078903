package com.hcltech.movie_capstone_project.service.impl;

import com.hcltech.movie_capstone_project.dto.GenreDTO;
import com.hcltech.movie_capstone_project.repository.GenreRepository;
import com.hcltech.movie_capstone_project.service.GenreService;
import com.hcltech.movie_capstone_project.service.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {
    
    @Autowired
    private GenreRepository genreRepository;

    @Autowired
    private MapperService mapper;

    @Override
    public List<GenreDTO> getAll() {
        return mapper.toDTOGenre(genreRepository.findAll());
    }

    @Override
    public GenreDTO getOneById(int id) {
        return mapper.toDTOGenre(genreRepository.findById(id).orElse(null));
    }

    @Override
    public GenreDTO create(GenreDTO genreDTO) {
        return mapper.toDTOGenre(genreRepository.save(mapper.toEntityGenre(genreDTO)));
    }

    @Override
    public GenreDTO update(GenreDTO genreDTO) {
        return mapper.toDTOGenre(genreRepository.save(mapper.toEntityGenre(genreDTO)));
    }

    @Override
    public void delete(int id) {
        genreRepository.deleteById(id);
    }

}
