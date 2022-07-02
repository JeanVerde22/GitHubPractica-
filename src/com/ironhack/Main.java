package com.ironhack;


public class Main {
    public static void main(String[] args){
        char var1 = 'c';
        int var3 = 1;
        String var2 = "hello world!";
        int var4 = -1;
        double var5 = 1.32;
        boolean var6 = true;

        System.out.println("hello");
        System.out.println("world");

        System.out.println(productFormatter(" Botella de agua ", "28/06/22") );

    }

    public static String productFormatter(String productName, String date){
        return (productName.trim().replace( ' ','_') +' '+ date).toUpperCase();
    }


}
