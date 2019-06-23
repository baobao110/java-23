package com.factory;

public class Factory {

    public static Fruit getFruit(String fruit) throws Exception {
      /*  if(fruit.equalsIgnoreCase("Apple")){
            return Apple.class.newInstance();
        }
        if(fruit.equalsIgnoreCase("Balance")){
            return  Balance.class.newInstance();
        }
        return null;*/
        //反射的使用
        Class clazz = Class.forName(fruit);
        return (Fruit) clazz.newInstance();
    }
  }
