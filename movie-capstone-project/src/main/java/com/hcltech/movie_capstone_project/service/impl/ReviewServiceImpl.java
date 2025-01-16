package com.hcltech.movie_capstone_project.service.impl;

import com.hcltech.movie_capstone_project.dto.ReviewDTO;
import com.hcltech.movie_capstone_project.repository.ReviewRepository;
import com.hcltech.movie_capstone_project.service.MapperService;
import com.hcltech.movie_capstone_project.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MapperService mapper;


    @Override
    public List<ReviewDTO> getAll() {
        return mapper.toDTOReview(reviewRepository.findAll());
    }

    @Override
    public ReviewDTO getOneById(int id) {
        return mapper.toDTOReview(reviewRepository.findById(id).orElse(null));
    }

    @Override
    public ReviewDTO create(ReviewDTO reviewDTO) {
        return mapper.toDTOReview(reviewRepository.save(mapper.toEntityReview(reviewDTO)));
    }

    @Override
    public ReviewDTO update(ReviewDTO reviewDTO) {
        return mapper.toDTOReview(reviewRepository.save(mapper.toEntityReview(reviewDTO)));
    }

    @Override
    public void delete(int id) {
        reviewRepository.deleteById(id);
    }
}
