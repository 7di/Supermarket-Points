package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Goods {
    private String goodsName;
    boolean isOnSale;
    private double consumeMoney ;



    public Goods(String goodsName,boolean isOnSale, double consumeMoney) {
        this.goodsName = goodsName;
        this.consumeMoney = consumeMoney;
        this.isOnSale = false;
    }

    public double getConsumeMoney() {
        return consumeMoney;
    }


}
