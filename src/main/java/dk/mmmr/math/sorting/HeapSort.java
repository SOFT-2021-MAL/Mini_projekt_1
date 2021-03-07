package dk.mmmr.math.sorting;

import dk.mmmr.math.interfaces.StringSorter;

public class HeapSort implements StringSorter {


    @Override
    public String[] sort(String[] arr) {
        int n = arr.length;

        // Finder bundens parten af træ strukturen i højeren side og heapyfier dem
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Venstre side
        for (int i = n - 1; i >= 0; i--) {
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
        return arr;
    }

    void heapify(String arr[], int n, int i) {
        // Index på største værdi
        int largest = i;
        // Finder venstre index af parten node
        int l = 2 * i + 1;
        // Finder højre index af parten node
        int r = 2 * i + 2;

        // Hvis venstre værdi er større en største index, bliver største til venstre værdi
        if (l < n && arr[l].compareTo( arr[largest]) > 0)
            largest = l;
        // Hvis højre værdi er større en største index, bliver største til højre værdi
        if (r < n && arr[r].compareTo(arr[largest]) > 0)
            largest = r;

        // Byt hvis parent index ikke er lig største index
        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
