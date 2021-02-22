package dk.mmmr.math.sorting;

import dk.mmmr.math.interfaces.StringSorter;

public class InsertionSort implements StringSorter {
    @Override
    public String[] sort(String arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            if (i % 1000 == 0) {
                System.out.println(key);
            }

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
