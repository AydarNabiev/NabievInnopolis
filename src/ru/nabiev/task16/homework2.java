package ru.nabiev.task16;

public class homework2 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        printArray(myArray);
        reverse(myArray);
        printArray(myArray);

    }

    public static void reverse(int[] myArray) {
        for(int n = 0; n <= myArray.length/2; n++) {
            int buffer = myArray[n];
            myArray[n] = myArray[myArray.length - 1 - n];
            myArray[myArray.length-1 - n] = buffer;
        }
    }

    public static void printArray(int[] myArray) {
        for(int m = 0; m <= myArray.length - 1; m++) {
            System.out.print(myArray[m] + " ");
        }
    }
}
