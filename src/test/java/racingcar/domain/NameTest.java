package racingcar.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class NameTest {

    @ParameterizedTest
    @ValueSource(strings = {"pobi", "crong", "honux"})
    void 이름_생성(final String name) {
        assertThat(new Name(name).getValue()).isEqualTo(name);
    }
    
}