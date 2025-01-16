package com.hcltech.movie_capstone_project.contoller;

import com.hcltech.movie_capstone_project.dto.ReviewDTO;
import com.hcltech.movie_capstone_project.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<ReviewDTO> getAll(){
        return reviewService.getAll();
    }

    @GetMapping("/{id}")
    public ReviewDTO getOneById(@PathVariable int id){
        return reviewService.getOneById(id);
    }

    @PostMapping("/add")
    public ReviewDTO create(@RequestBody ReviewDTO reviewDTO){
        return reviewService.create(reviewDTO);
    }

    @PutMapping("/update")
    public ReviewDTO update(@RequestBody ReviewDTO reviewDTO){
        return reviewService.update(reviewDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        reviewService.delete(id);
    }
}
