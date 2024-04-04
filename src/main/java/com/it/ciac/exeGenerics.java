// Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.

package com.it.ciac;

public class exeGenerics {
    public static void main(String[] args) {

        Integer[] first = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Integer[] sec = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Integer[] third = { 1, 2, 3, 4, 5, 6, 7, 9 };

        String[] text1 = { "banana", "cebola", "cachaça" };
        String[] text2 = { "banana", "cebola", "cachaça" };
        String[] text3 = { "banana", "cebola", "agua" };

        System.out.println(checkArray(first, sec));
        System.out.println(checkArray(first, third));

        System.out.println(checkArray(text1, text2));
        System.out.println(checkArray(text1, text3));

    }

    private static <T> boolean checkArray(T[] array1, T[] array2) {
        boolean check = false;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    check = true;
                } else
                    check = false;
            }
        }
        return check;
    }
}
