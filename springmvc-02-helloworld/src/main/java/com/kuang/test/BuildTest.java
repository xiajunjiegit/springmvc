package com.kuang.test;


import com.kuang.bean.Human;

/***
 * 创建型模式 ---- 建造者模式：
 * 1.需要的对象定义：产品（Product）
 * 2.定义需要对象应有的方法及返回对象的抽象方法  --- 建造者角色（Builder）
 * 3.实现类实现抽象方法，进行建造 --- 具体创建者角色（ConcreteBuilder）
 * 4.建造模式的核心 --- 指导者（Director）
 * @author kxm
 */
public class BuildTest {

    public static void main(String[] args) {
        Director director = new Director();
        Human human = director.createHumanByDirecotr(new SmartManBuilder());
        Human humanAgain = director.createHumanByDirecotr(new ActiveManBuilder());
        System.out.println(human);
        System.out.println(humanAgain);
    }

}
