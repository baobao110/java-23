package com.single;


public class Test {
    public static void main(String[] args) {
        ele e=ele.newInstance();
        ele e1=ele.newInstance();
        e.setName("124");
        e1.setName("122");
        System.out.println(e.getName());
        System.out.println(e1.getName());
    }
}
