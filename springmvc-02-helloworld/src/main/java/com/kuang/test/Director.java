package com.kuang.test;


import com.kuang.bean.Human;
import com.kuang.intf.IBuildHuman;

// 4.建造模式的核心 --- 指导者（Director,进行建造组装)
public class Director {
    public Human createHumanByDirecotr(IBuildHuman bh) {
        bh.buildBody();
        bh.buildFoot();
        bh.buildHand();
        bh.buildHead();
        return bh.createHuman();
    }
}
