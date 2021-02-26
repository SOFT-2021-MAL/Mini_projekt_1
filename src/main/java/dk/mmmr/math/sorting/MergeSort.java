package dk.mmmr.math.sorting;

import dk.mmmr.math.interfaces.IntSorter;
import dk.mmmr.math.interfaces.StringSorter;

import java.util.Arrays;

public class MergeSort implements IntSorter, StringSorter {

    @Override
    public void sortInt(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] arrL = Arrays.copyOfRange(arr, 0, mid);
            int[] arrR = Arrays.copyOfRange(arr, mid, arr.length);

            sortInt(arrL);
            sortInt(arrR);

            mergeInt(arr, arrL, arrR);
        }
    }

    private void mergeInt(int[] arr, int[] arrL, int[] arrR) {
        Arrays.stream(arrL).forEach(a -> System.out.print(a + " "));
        System.out.println("L");
        Arrays.stream(arrR).forEach(a -> System.out.print(a + " "));
        System.out.println("R");

        int i = 0, j = 0;

        int k = 0;
        while (i < arrL.length && j < arrR.length) {
            if (arrL[i] <= arrR[j]) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        while (i < arrL.length) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        while (j < arrR.length) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
        System.out.println("_____");
    }


    @Override
    public String[] sort(String[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            String[] arrL = Arrays.copyOfRange(arr, 0, mid);
            String[] arrR = Arrays.copyOfRange(arr, mid, arr.length);

            sort(arrL);
            sort(arrR);

            mergeString(arr, arrL, arrR);
        }
        return arr;
    }

    private void mergeString(String[] arr, String[] arrL, String[] arrR) {
        Arrays.stream(arrL).forEach(a -> System.out.print(a + " "));
        System.out.println("L");
        Arrays.stream(arrR).forEach(a -> System.out.print(a + " "));
        System.out.println("R");

        int i = 0, j = 0;

        int k = 0;
        while (i < arrL.length && j < arrR.length) {
            if (arrL[i].compareTo(arrR[j]) <= 0) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        while (i < arrL.length) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        while (j < arrR.length) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
        System.out.println("_____");
    }
}
