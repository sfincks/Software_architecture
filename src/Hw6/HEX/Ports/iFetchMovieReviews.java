package Hw6.HEX.Ports;

import java.util.List;

import Hw6.HEX.Domain.MovieReview;
import Hw6.HEX.Domain.MovieSearchRequest;

public interface iFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
