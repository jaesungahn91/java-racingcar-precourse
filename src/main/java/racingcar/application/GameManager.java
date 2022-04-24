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
        Cars cars = new Cars(carNames);

        Integer tryNumber = inputCommand.askTryNumber();

        for (int round = START_ROUND_NUMBER; round <= tryNumber; round++) {
            cars.playRound();
            outputCommand.printCarPosition(cars);
        }

        cars.findWinners();
        outputCommand.printWinners(cars.getWinnerNames());

    }

}
