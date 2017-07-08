package com.examples.java.calculator;

/**
 * Created by NAS on 7/8/2017.
 *
 */
public class Calculator {

    public Integer add( Integer a, Integer b ) {
        if( a == null || b == null ){
            return 0;
        }
        return a + b;
    }

    public Integer multiple( Integer a, Integer b ) {
        if( a == null || b == null ) {
            return 0;
        }
        return a * b;
    }

    public Integer square( Integer a ) {
        if( a == null ) {
            return 0;
        }
        return a * a;
    }
}
