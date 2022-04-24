package racingcar.application;

import racingcar.domain.Cars;

public class GameManager {

    private static final int START_ROUND_NUMBER = 1;

    private final InputCommand inputCommand;
    private final OutputCommand outputCommand;

    public GameManager() {
        this.inputCommand = new InputCommand();
        this.outputCommand = new OutputCommand();
    }

    public void play() {

        String[] carNames = new CarsDTO(inputCommand.askCarNames()).toCarNames();
        Integer roundNumber = inputCommand.askTryNumber();

        Cars cars = new Cars(carNames);
        for (int round = START_ROUND_NUMBER; round <= roundNumber; round++) {
            cars.playRound();
            outputCommand.printCarPosition(cars);
        }

    }

}
