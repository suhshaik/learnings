package com.learnings.j8.interfaces;

public interface MyInterface {

    default void log(){
        System.out.println("LOGGed in Interface");
    }

    static void show()
    {
        System.out.println("STATICed in Interface");
    }
}
