package dk.mmmr.math.interfaces;

public interface IntSorter {
    void sortInt(int arr[]);
    default void printArray(int[] arr)
    {
        int[] toPrint =  arr;
        for (int i = 0; i < toPrint.length; i++)
            System.out.print(arr[i] + " ");
    }
}
