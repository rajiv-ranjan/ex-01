package com.mycompnay.lambdalearning;

import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Supplier <String> str = () -> "Hello world";
        System.out.println(str);
    }
}
