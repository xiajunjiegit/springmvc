package com.kuang.test;

import com.kuang.bean.Human;
import com.kuang.intf.IBuildHuman;

//3.实现类实现抽象方法，进行建造 --- 具体创建者角色 当前为运动员
public class ActiveManBuilder implements IBuildHuman {

    Human human;
    public ActiveManBuilder() {
        human = new Human();
    }

    public void buildHead() {
        human.setHead("头脑智商180");
    }

    public void buildBody() {
        human.setBody("身体无敌的运动员");
    }

    public void buildHand() {
        human.setHand("手");
    }

    public void buildFoot() {
        human.setFoot("脚");
    }

    public Human createHuman() {
        return human;
    }
}
