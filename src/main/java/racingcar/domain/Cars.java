package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

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
}
