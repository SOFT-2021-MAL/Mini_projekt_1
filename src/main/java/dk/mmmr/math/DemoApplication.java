package dk.mmmr.math;

import dk.mmmr.math.interfaces.StringSorter;
import dk.mmmr.math.sorting.InsertionSort;
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

        String[] test ={"bums","kage", "qq","sex","abemad","yikes","bums","kage", "qq","sex","abemad","yikes","bums","kage", "qq","sex","abemad","yikes"};

        String[] stringArr = fileUtility.toStringArray("data/shakespeare-complete-works.txt", "[^A-Za-z']+");
        try (Stopwatch sw = new Stopwatch()) {

            insertionSort.printArray(insertionSort.sort(test));
            //selectionSort.printArray(selectionSort.sort(test));
        }

    }

}
