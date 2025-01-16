package com.hcltech.movie_capstone_project.contoller;

import com.hcltech.movie_capstone_project.dto.ActorDTO;
import com.hcltech.movie_capstone_project.dto.GenreDTO;
import com.hcltech.movie_capstone_project.dto.MovieDTO;
import com.hcltech.movie_capstone_project.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieDTO> getAll(){
        return movieService.getAll();
    }

    @GetMapping("/{id}")
    public MovieDTO getOneById(@PathVariable int id){
        return movieService.getOneById(id);
    }

    @PostMapping("/add")
    public MovieDTO create(@RequestBody MovieDTO movieDTO){
        return movieService.create(movieDTO);
    }

    @PutMapping("/update")
    public MovieDTO update(@RequestBody MovieDTO movieDTO){
        return movieService.update(movieDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        movieService.delete(id);
    }

    @GetMapping("/genresForMovie/{id}")
    public List<GenreDTO> getGenresForMovie(@PathVariable int id){
        return movieService.getGenresForMovie(id);
    }

    @GetMapping("/actorsForMovie/{id}")
    public List<ActorDTO> getActorsForMovie(@PathVariable int id){
        return movieService.getActorsForMovie(id);
    }
}
