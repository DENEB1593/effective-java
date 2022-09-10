package study_01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;


class CalculatorTest {

    @Test
    @DisplayName("Calculator Test")
    public void calculatorTest() {
        Calculator plus = Calculator.fromString("+");

        System.out.println(plus);

        assertThat(plus).isEqualTo(Calculator.PLUS);
    }

    @Test
    @DisplayName("EnumSet Test")
    public void calculatorEnumSet() {
        Map<String, Calculator> calculatorMap = EnumSet.allOf(Calculator.class)
                .stream()
                    .collect(Collectors.toMap
                            (Calculator::toString, Function.identity())
                    );

        Calculator plus = calculatorMap.getOrDefault("+", null);

        assertThat(plus).isEqualTo(Calculator.PLUS);
    }

}