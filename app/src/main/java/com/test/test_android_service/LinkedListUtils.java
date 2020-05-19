package com.test.test_android_service;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListUtils {
    public LinkedList<String> removeDuplicate (LinkedList<String> linkedList) {

        HashSet<String> hash = new HashSet<>();
        int x = 0;
        boolean hasNext = true;
        while(hasNext)
        {
            if(x == linkedList.size()-1)
                hasNext = false;

            if (hash.contains(linkedList.get(x))) {
                linkedList.remove(x);
            } else {
                hash.add(linkedList.get(x));
                x++;
            }
        }

        return linkedList;
    }
}
