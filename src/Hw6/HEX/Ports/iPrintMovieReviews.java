package Hw6.HEX.Ports;

import java.util.List;

import Hw6.HEX.Domain.MovieReview;

public interface iPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
