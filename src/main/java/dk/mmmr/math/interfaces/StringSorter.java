package dk.mmmr.math.interfaces;

public interface StringSorter {
    String[] sort(String[] arr);
    default void printArray(String[] arr)
    {
        String[] toPrint =  arr;
        for (int i = 0; i < toPrint.length; i++)
            System.out.print(arr[i] + " ");
    }
}
