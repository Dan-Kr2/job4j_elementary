package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;
class MaxTest {

    @Test
    void max3() {
        Max find3 = new Max();
        double expected = 3;
        double output = find3.max(1, 2, 3);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void max4() {
        Max find4 = new Max();
        double expected = 4;
        double output = find4.max(1, 2, 3, 4);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}