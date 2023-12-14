package Hw6.HEX.Adapters;

import java.util.List;

import Hw6.HEX.Domain.MovieReview;
import Hw6.HEX.Ports.iPrintMovieReviews;

public class ConsolePrinter implements iPrintMovieReviews {
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
