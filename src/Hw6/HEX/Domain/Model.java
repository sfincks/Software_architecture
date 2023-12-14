package Hw6.HEX.Domain;

import Hw6.HEX.Application.MovieApp;

public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    public void Run(MovieSearchRequest userCommand)
    {
        movieApp.accept(userCommand);
    }
}




