package com.thoughtworks.basic;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

class Calculator {

//Goods goods = new Goods("apple",false,100);

    public Calculator() {

    }


    public int calculate(Goods goods) {
        return (int)goods.getConsumeMoney();
    }


}

