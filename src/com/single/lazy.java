package com.single;

//懒汉
public class lazy {

    private static lazy la;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static lazy newInstance() {
        if (null == la) {
            la = new lazy();
        }
        return la;
    }

    //双重检查
    public static lazy newInstance1(){
        if(null==la){
            synchronized (lazy.class){
                if(null==la){
                    la=new lazy();
                }
            }
        }
        return la;
    }
}
