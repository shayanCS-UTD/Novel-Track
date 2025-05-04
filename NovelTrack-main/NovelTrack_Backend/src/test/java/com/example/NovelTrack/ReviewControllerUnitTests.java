package com.example.NovelTrack;

import com.example.NovelTrack.review.ReviewController;
import com.example.NovelTrack.review.ReviewDTO;
import com.example.NovelTrack.review.ReviewRequest;
import com.example.NovelTrack.review.ReviewService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ReviewControllerUnitTests {

    @Mock
    private ReviewService reviewService;

    @InjectMocks
    private ReviewController reviewController;

    private ReviewDTO reviewDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        reviewDTO = new ReviewDTO();
        reviewDTO.setId(1L);
        reviewDTO.setBookId("OL123");
        reviewDTO.setContent("Sample content");
    }

    @Test
    void getAllReviews_ShouldReturnList() {
        when(reviewService.getAllReviews()).thenReturn(Collections.singletonList(reviewDTO));

        ResponseEntity<List<ReviewDTO>> response = reviewController.getAllReviews();
        assertEquals(1, response.getBody().size());
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    void getReviewById_ShouldReturnReview() {
        when(reviewService.getReview(1L)).thenReturn(reviewDTO);

        ResponseEntity<ReviewDTO> response = reviewController.getReview(1L);
        assertEquals("OL123", response.getBody().getBookId());
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    void createReview_ShouldReturnCreatedReview() {
        // Prepare the request
        ReviewRequest request = new ReviewRequest();
        request.setBookId("OL123");
        request.setBookTitle("Some Title");
        request.setContent("Test review");
        request.setUserId(1L);  // Ensure that userId is part of the request

        // Prepare the ReviewDTO to be returned by the mock service
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setBookId("OL123");
        reviewDTO.setBookTitle("Some Title");
        reviewDTO.setContent("Test review");

        // Mock the service method to return the reviewDTO
        when(reviewService.createReview(1L, request)).thenReturn(reviewDTO);

        // Call the controller method (without the userId in the URL since it's in the request body)
        ResponseEntity<ReviewDTO> response = reviewController.createReview(request); // Pass the request

        // Assert the response status and body content
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("OL123", response.getBody().getBookId());
        assertEquals("Some Title", response.getBody().getBookTitle());
        assertEquals("Test review", response.getBody().getContent());
    }


    @Test
    void deleteReview_ShouldReturnConfirmation() {
        doNothing().when(reviewService).deleteReview(1L, 1L);

        ResponseEntity<String> response = reviewController.deleteReview(1L, 1L);
        assertEquals("Successfully Deleted Review id: 1", response.getBody());
        assertEquals(200, response.getStatusCodeValue());
    }
}