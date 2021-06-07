package com.kuang.controller;

public class SingleTon {
    private SingleTon(){}

    //饿汉式 ：类加载时进行初始化
    private static final SingleTon st = new SingleTon();
    public static SingleTon getSt(){
        return st;
    }

    /******************************* 分割线 *********************************/
    //懒汉式：
    private volatile static SingleTon myTest = null;
    public static SingleTon getMyTest(){
        if (myTest == null){
            synchronized (SingleTon.class){
                if (myTest == null){
                    myTest = new SingleTon();
                }
            }
        }
        return myTest;
    }


}
