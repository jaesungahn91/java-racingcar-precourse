package racingcar.domain;

import java.util.Objects;

public class Car {

    private Name name;

    public Car(String name) {
        this.name = new Name(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return this.name.getValue();
    }
}
