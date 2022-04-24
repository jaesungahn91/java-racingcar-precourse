package racingcar.application;

public class GameManager {

    private final InputCommand inputCommand;

    public GameManager() {
        this.inputCommand = new InputCommand();
    }

    public void play() {

        String[] carNames = new CarsDTO(inputCommand.askCarNames()).toCarNames();



    }

}
