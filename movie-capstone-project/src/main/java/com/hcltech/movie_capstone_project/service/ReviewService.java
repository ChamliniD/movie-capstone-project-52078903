package com.hcltech.movie_capstone_project.service;

import com.hcltech.movie_capstone_project.dto.ReviewDTO;

import java.util.List;

public interface ReviewService {

    List<ReviewDTO> getAll();

    ReviewDTO getOneById(int id);

    ReviewDTO create(ReviewDTO reviewDTO);

    ReviewDTO update(ReviewDTO reviewDTO);

    void delete(int id);
}
