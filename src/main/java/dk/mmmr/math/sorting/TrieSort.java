package dk.mmmr.math.sorting;

import dk.mmmr.math.interfaces.StringSorter;

public class TrieSort implements StringSorter {

    private Trie trie;

    @Override
    public String[] sort(String[] arr) {
        trie = new Trie();

        for (int i = 0; i < arr.length; i++) {
            trie.insert(arr[i], i);
        }
        return arr;
    }

    @Override
    public void printArray(String[] arr) {

        trie.traversePreorder(arr);
    }
}