package com.juaracoding.dipraktikumjf.praktikum1;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2024
@Author danil a.k.a. Danil Ibrahim
Java Developer
Created on 01/04/2024 15:52
@Last Modified 01/04/2024 15:52
Version 1.0
*/


public class Praktikum1 {
    public static void main(String[] args) {
        // Inisialisasi nilai untuk masing-masing tipe data numerik
        byte byteValue = Byte.MAX_VALUE;
        short shortValue = Short.MAX_VALUE;
        int intValue = Integer.MAX_VALUE;
        long longValue = Long.MAX_VALUE;
        float floatValue = Float.MAX_VALUE;
        double doubleValue = Double.MAX_VALUE;

        double doubleTotalResult = ((doubleValue - floatValue) - (longValue % intValue) + (byteValue * shortValue));

        System.out.println("Hasil Perhitungan Aritmatika: " + doubleTotalResult);
    }
}
