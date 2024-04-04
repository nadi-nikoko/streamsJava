package com.it.ciac;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Stream;

public class AppGenerics {
    public static void main(String[] args) {

        System.out.println(somma(10, 20));

        Stream.of(1, 1.5, "nico").filter(null);
    }

    private static <T extends Number> double somma(T n1, T n2) {
        return n1.doubleValue() + n2.doubleValue();
    }

}

record Person(String name, String surname) {

}

class Box<T> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

}
