package Hw6.HEX;
import Hw6.HEX.Adapters.ConsolePrinter;
import Hw6.HEX.Adapters.MovieReviewsRepo;
import Hw6.HEX.Adapters.UserCommand;
import Hw6.HEX.Application.MovieUser;
import Hw6.HEX.Ports.iUserInput;
import Hw6.HEX.Domain.MovieSearchRequest;
import Hw6.HEX.Ports.iFetchMovieReviews;
import Hw6.HEX.Ports.iPrintMovieReviews;



public class App {
    public static void main(String[] args) throws Exception {

        iFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        iPrintMovieReviews printMovieReviews = new ConsolePrinter();

        iUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);

        MovieUser movieUser = new MovieUser(userCommand);

        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);

        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);
       // System.out.println("Hello, World!");
    }
}
