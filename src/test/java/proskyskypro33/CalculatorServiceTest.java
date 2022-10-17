package proskyskypro33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorServiceTest {
    public CalculatorService calculatorService = new CalculatorService();
/*
    @BeforeEach
    public int setUp() {
    }

 */
    @Test
    public void plusTest() {
        Number actual = calculatorService.plus(2, 3);
        assertThat(actual).isEqualTo(5);

        actual = calculatorService.plus(-3, 1);
        assertThat(actual).isEqualTo(-2);
    }

    @Test
    public void minusTest() {
        Number actual = calculatorService.minus(2, 3);
        assertThat(actual).isEqualTo(-1);

        actual = calculatorService.minus(-3, 1);
        assertThat(actual).isEqualTo(-4);
    }

    @Test
    public void multiplyTest() {
        Number actual = calculatorService.multiply(2, 3);
        assertThat(actual).isEqualTo(6);

        actual = calculatorService.multiply(-3, 1);
        assertThat(actual).isEqualTo(-3);
    }

    @Test
    public void divideTest() {
        Number actual = calculatorService.divide(6, 3);
        assertThat(actual).isEqualTo(2);

        actual = calculatorService.divide(-3, 1);
        assertThat(actual).isEqualTo(-3);
    }
}

