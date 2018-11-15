package com.learnings.j8.interfaces;

public class InterfaceDefaults implements MyInterface {

    public static void main(String[] args) {
        InterfaceDefaults d = new InterfaceDefaults();
        System.out.println("Main method DEFAULT methods :: Before");
        d.log();
        System.out.println("Main method DEFAULT methods   :: After");

        //
        InterfaceDefaults d1 = new InterfaceDefaults();
        System.out.println("Main method STATIC methods  :: Before");
        MyInterface.show();
        System.out.println("Main method STATIC methods  :: After");
    }
}
