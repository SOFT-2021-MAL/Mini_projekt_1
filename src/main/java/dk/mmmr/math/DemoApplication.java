package dk.mmmr.math;

import dk.mmmr.math.interfaces.IntSorter;
import dk.mmmr.math.interfaces.StringSorter;
import dk.mmmr.math.sorting.InsertionSort;
import dk.mmmr.math.sorting.MergeSort;
import dk.mmmr.math.sorting.SelectionSort;
import dk.mmmr.math.util.FileUtility;
import dk.mmmr.math.util.Stopwatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DemoApplication.class, args);

        FileUtility fileUtility = new FileUtility();
        StringSorter insertionSort = new InsertionSort();
        StringSorter selectionSort = new SelectionSort();
        IntSorter mergeIntSort = new MergeSort();
        StringSorter mergeStringSort = new MergeSort();

        String[] test = {"bums", "kage", "qq", "setting", "abemad", "yikes", "bums", "kage", "qq", "setting", "abemad", "yikes", "bums", "kage", "qq", "setting", "abemad", "yikes"};
        String[] stringArr = fileUtility.toStringArray("data/shakespeare-complete-works.txt", "[^A-Za-z']+");
        int[] intArr = {6, 2, 3, 4, 5, 7, 1};


        String[] stringResult;

        try (Stopwatch sw = new Stopwatch()) {
            // stringResult = insertionSort.sort(test);
        }
        //insertionSort.printArray(stringResult);

        try (Stopwatch sw = new Stopwatch()) {
            // stringResult = selectionSort.sort(test);
        }
        //selectionSort.printArray(stringResult);

        try (Stopwatch sw = new Stopwatch()) {
            //    mergeIntSort.sortInt(intArr);
        }
        // mergeIntSort.printArray(intArr);
        try (Stopwatch sw = new Stopwatch()) {
            stringResult = mergeStringSort.sort(test);
        }
        mergeStringSort.printArray(stringResult);
    }

}
