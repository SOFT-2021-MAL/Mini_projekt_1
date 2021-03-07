package dk.mmmr.math.sorting;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    private Node rootNode;

    Trie()
    {
        rootNode = null;
    }

    void insert(String key, int index)
    {
        if (rootNode == null)
        {
            rootNode = new Node();
        }

        Node currentNode = rootNode;

        for (int i = 0;i < key.length();i++)
        {
            char keyChar = key.charAt(i);

            if (currentNode.getChild(keyChar) == null)
            {
                currentNode.addChild(keyChar);
            }

            currentNode = currentNode.getChild(keyChar);
        }

        currentNode.addIndex(index);
    }

    void traversePreorder(String[] array)
    {
        traversePreorder(rootNode, array);
    }
    
    private void traversePreorder(Node node,
                                  String[] array)
    {
        if (node == null)
        {
            return;
        }

        if (node.getIndices().size() > 0)
        {
            for (int index : node.getIndices())
            {
                System.out.print(array[index] + " ");
            }
        }

        for (char index = 'a';index <= 'z';index++)
        {
            traversePreorder(node.getChild(index), array);
        }
    }

    private static class Node {

        private Node[] children;
        private List<Integer> indices;

        Node()
        {
            children = new Node[26];
            indices = new ArrayList<>(0);
        }

        Node getChild(char index)
        {
            if (index < 'a' || index > 'z')
            {
                return null;
            }

            return children[index - 'a'];
        }

        void addChild(char index)
        {
            if (index < 'a' || index > 'z')
            {
                return;
            }

            Node node = new Node();
            children[index - 'a'] = node;
        }

        List<Integer> getIndices()
        {
            return indices;
        }

        void addIndex(int index)
        {
            indices.add(index);
        }
    }
}
