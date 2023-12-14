package Hw6.HEX.Application;

import Hw6.HEX.Domain.MovieSearchRequest;
import Hw6.HEX.Ports.iUserInput;

public class MovieUser {
    private iUserInput userInputDriverPort;

    public MovieUser(iUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
