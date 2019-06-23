package com.factory;

public class FactoryTest {

    public static void main(String[] args) throws  Exception{
        Fruit fruit=Factory.getFruit("com.factory.Apple");
        fruit.get();
    }
}
