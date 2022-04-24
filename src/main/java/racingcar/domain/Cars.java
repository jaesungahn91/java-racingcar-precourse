package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final int MOVE_NUMBER_MIN_RANGE = 0;
    private static final int MOVE_NUMBER_MAX_RANGE = 9;

    private List<Car> cars = new ArrayList<>();

    public Cars(String[] carNames) {
        for (String name : carNames) {
            addCar(name);
        }
    }

    private void addCar(String name) {
        this.cars.add(new Car(name));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void playRound() {
        for (Car car : this.cars) {
            int moveNumber = getRandomNumber();
            car.judgeAndMove(moveNumber);
        }
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(MOVE_NUMBER_MIN_RANGE, MOVE_NUMBER_MAX_RANGE);
    }

}
