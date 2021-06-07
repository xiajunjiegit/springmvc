package com.kuang.test;

import com.kuang.bean.Car;

public class SimpleFactoryTon {
    public Car creatCarFactory(int num){
        Car car = null;
        switch (num){
            case 1:
                car = new Car("东风雪铁龙");
                break;
            case 2:
                car = new Car("东风雪铁龙","红色");
                break;
            default:
                car = new Car();
                break;
        }
        return car;
    }
}
