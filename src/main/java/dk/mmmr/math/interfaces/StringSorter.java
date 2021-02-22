package dk.mmmr.math.interfaces;

public interface StringSorter {
    String[] sort(String[] arr);
    default void printArray(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
