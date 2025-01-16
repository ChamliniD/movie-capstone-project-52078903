package com.hcltech.movie_capstone_project.contoller;

import com.hcltech.movie_capstone_project.dto.GenreDTO;
import com.hcltech.movie_capstone_project.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping
    public List<GenreDTO> getAll(){
        return genreService.getAll();
    }

    @GetMapping("/{id}")
    public GenreDTO getOneById(@PathVariable int id){
        return genreService.getOneById(id);
    }

    @PostMapping("/add")
    public GenreDTO create(@RequestBody GenreDTO genreDTO){
        return genreService.create(genreDTO);
    }

    @PutMapping("/update")
    public GenreDTO update(@RequestBody GenreDTO genreDTO){
        return genreService.update(genreDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        genreService.delete(id);
    }
}
