package racingcar.application;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class OutputCommand {

    private static final String EXECUTION_RESULT_MESSAGE = "실행 결과";
    private static final int START_INDEX = 0;

    public void printCarPosition(Cars cars) {
        System.out.println(EXECUTION_RESULT_MESSAGE);
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + " : " + positionToLine(car.getPosition()));
        }
        System.out.println();
    }

    private String positionToLine(int position) {
        StringBuilder line = new StringBuilder();
        for (int index = START_INDEX; index < position; index++) {
            line.append("-");
        }
        return line.toString();
    }

}
