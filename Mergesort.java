package src;

import java.util.Random;

public class Mergesort {
    private static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;

        if (inputLength <2){
            return;
        }
        int mid = inputLength / 2;
        int[] lhalf = new int[mid];
        int[] rhalf = new int[inputLength - mid];

        for (int i = 0; i < mid; i++) {
            lhalf[i] = inputArray[i];
        }

        for (int i = mid; i < inputLength; i++) {
            rhalf[i-mid] = inputArray[i];
        }

        mergeSort(lhalf);
        mergeSort(rhalf);

        merge(inputArray,lhalf,rhalf);
    }

    private static void merge (int[] inputArray, int[] lhalf, int[] rhalf){
        int lsize=lhalf.length;
        int rsize= rhalf.length;

        int i=0, j=0, k=0;

        while (i<lsize && j<rsize){
            if (lhalf[i] <= rhalf[j]){
                inputArray[k] = lhalf[i];
            }
            else {
                inputArray[k] = rhalf[j];
                j++;
            }
            k++;
        }
        while (i<lsize){
            inputArray[k] = lhalf[i];
            i++;
            k++;
        }
        while (j<rsize){
            inputArray[k] = rhalf[i];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=rand.nextInt(100);
        }
        System.out.println("Before: ");
        //printArray(numbers);
        mergeSort(numbers);
        System.out.println("After: ");
        //printArray(numbers);
    }
}