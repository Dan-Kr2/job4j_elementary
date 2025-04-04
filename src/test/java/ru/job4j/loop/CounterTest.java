package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0And3expected6() {
        int start = 0;
        int finish = 3;
        double expected = 6;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10And10expected0() {
        int start = -10;
        int finish = 10;
        double expected = 0;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when5And1expected0() {
        int start = 5;
        int finish = 1;
        double expected = 0;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void secondMethodWhen0And10expected30() {
        int start = 0;
        int finish = 10;
        double expected = 30;
        double output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void secondMethodWhen0And1expected0() {
        int start = 0;
        int finish = 1;
        double expected = 0;
        double output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void secondMethodWhenMinus8And8expected0() {
        int start = -8;
        int finish = 8;
        double expected = 0;
        double output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
