package com.thoughtworks.basic;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void should_return_100_or_110_points_when_calculate_given_consume_100_or_110_yuan() {
        //given
        Goods goods = new Goods("apple", false,100);
        Goods goods2 = new Goods("banana", false,110);
        Calculator calculator = new Calculator();

        //when
        int applepoints = calculator.calculate(goods);
        int bananapoints = calculator.calculate(goods2);

        //then
        assertEquals(applepoints, 100);
        assertEquals(bananapoints, 110);
    }


}
