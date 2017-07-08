package com.java.examples.math;

import com.examples.java.calculator.Calculator;

/**
 * Created by NAS on 7/9/2017.
 */
public class Mathematics {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Integer add = calculator.add(1, 2);

        System.out.println( "Added Value "+ add.toString() );

    }
}
