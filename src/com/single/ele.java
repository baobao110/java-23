package com.single;

//饿汉模式
public class ele {
    private static final ele e=new ele();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ele newInstance(){
        return e;
    }
}
