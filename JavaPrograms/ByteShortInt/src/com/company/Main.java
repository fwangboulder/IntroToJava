package com.fang;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        //underscore make the number more readable
        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        //byte has a width of 8
        byte myByteValue = 10;
        byte myMinByteValue=-128;
        byte myMaxByteValue=127;

        //short has a width of 16
        short myMaxShortValue=32767;
        short myMinShortValue=-32768;

        //assin a long value, long has a width of 64
        long myLongValue = 100l;
        long myMaxLongValue=9_223_372_036_854_775_807l;
        long myMinLongValue=-9_223_372_036_854_775_808l;

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000l + 10l *(byteValue + shortValue +intValue);
        //casting the type of value
        short shortTotal = (short)(5000 + 10 *(byteValue + shortValue +intValue));
        int intTotal =(int) (5000 + 10l * (byteValue + shortValue +intValue));

        //print out total
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
        System.out.println("intTotal = " + intTotal);




    }
}
