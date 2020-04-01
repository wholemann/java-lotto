package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class LottoTest {
    @Test
    @DisplayName("로또는 반드시 6개의 번호로 이루어져야 한다")
    public void invalidLottoWhenInputNumbersCountLessThenSix() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Lotto(Collections.emptyList()));
    }
}
