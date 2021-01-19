package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ExampleIntfc intf = Main::methodRef;
        intf.test();
        System.out.println("intf.test() = " + intf.test());
    }

    public static String methodRef() {
        return "Method reference";
    }
}
