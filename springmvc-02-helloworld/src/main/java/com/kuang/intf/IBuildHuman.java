package com.kuang.intf;

import com.kuang.bean.Human;

//2.定义需要对象应有的方法及返回对象的抽象方法  --- 建造者角色（Builder）
public interface IBuildHuman {
    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();
    public Human createHuman();

}
