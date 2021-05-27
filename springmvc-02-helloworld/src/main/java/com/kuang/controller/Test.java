package com.kuang.controller;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            int num = new Random().nextInt(3);
            String classPath = "";
            switch (num){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "com.atguigu.java.Person";
                    break;
            }
            try{
                Object obj = getInstance(classPath);
                System.out.println(obj);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static Object getInstance(String classPath) throws Exception{
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}
