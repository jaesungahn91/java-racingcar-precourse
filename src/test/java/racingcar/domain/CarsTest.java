package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.application.CarsDTO;

class CarsTest {

    @ParameterizedTest
    @ValueSource(strings = "pobi,crong,honux")
    void 자동차_개수_확인(final String names) {
        String[] carNames = new CarsDTO(names).toCarNames();

        Assertions.assertThat(new Cars(carNames).getCars().size()).isEqualTo(carNames.length);
    }

}