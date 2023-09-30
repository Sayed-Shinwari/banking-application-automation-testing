package com.guru99.demo.pages;

public class Sdjsdf {
    public static void main(String[] args) {
        String actualText="Manager Id: mngr123456";
        String expectedResult="mngr";

        System.out.print("Your Id is: ");

        for (int i=12; i<=actualText.length()-1; i++){

            System.out.print(actualText.charAt(i));
        }

        if (actualText.contains(expectedResult)){
            System.out.println("\nmanager is logged in");
        }
        else {
            System.out.println("\ncustomer is logged in");
        }


    }
}
