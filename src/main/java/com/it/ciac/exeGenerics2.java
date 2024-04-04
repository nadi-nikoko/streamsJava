//Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.

package com.it.ciac;

public class exeGenerics2 {
    public static void main(String[] args) {
        Integer[] list = { 33, 22, 57, 11, 5, 8 };
        Double[] list2 = { 33.5, 22.2, 57.0, 11.5, 5.1, 8.5 };
        System.out.println(TotalSplit(list));
        System.out.println(TotalSplit(list2));

    }

    private static <T> Result TotalSplit(T[] numberList) {
        int totalOdd = 0;
        int totalEven = 0;
        for (int i = 0; i < numberList.length; i++) {
            int currentNumb = (int) numberList[i];
            if (currentNumb % 2 == 0) {
                totalEven += currentNumb;
            } else
                totalOdd += currentNumb;
        }
        Result Result = new Result(totalEven, totalOdd);

        return Result;

    }
}

record Result(int totalEven, int totalOdd) {

}