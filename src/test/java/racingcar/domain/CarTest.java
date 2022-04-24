package racingcar.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {



    @ParameterizedTest
    @ValueSource(strings = {"pobi", "crong", "honux"})
    void 자동차_생성(final String name) {
        assertThat(new Car(name).getName()).isEqualTo(name);
    }

    @Test
    void 자동자_전진() {
        Car car = new Car("pobi");
        car.moveCar();

        assertThat(car.getPosition()).isEqualTo(1);
    }
}