package Hw6.HEX.Adapters;

import Hw6.HEX.Application.MovieApp;
import Hw6.HEX.Domain.Model;
import Hw6.HEX.Domain.MovieSearchRequest;
import Hw6.HEX.Ports.iFetchMovieReviews;
import Hw6.HEX.Ports.iPrintMovieReviews;
import Hw6.HEX.Ports.iUserInput;

public class UserCommand implements iUserInput {
    private Model model;

    public UserCommand(iFetchMovieReviews fetchMovieReviews, iPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}
