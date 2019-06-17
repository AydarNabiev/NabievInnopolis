package ru.nabiev.task16;

public class homework1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        toLeft(myArray);
        printArray(myArray);
    }

    public static void printArray(int[] myArray) {
        for(int m = 0; m <= myArray.length - 1; m++) {
            System.out.println(myArray[m]);
        }
    }

    public static void toLeft(int[] myArray) {
        for(int n = 1; n <= myArray.length - 1; n++) {
            int buffer = myArray[n];
            myArray[n] = myArray[n-1];
            myArray[n-1] = buffer;
        }
       myArray[myArray.length - 1] = 0;
    }
}