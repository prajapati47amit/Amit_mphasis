package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList list = new ArrayList();

        // These lines store strings, but any type of object
        // can be stored.  In old-style code, there is no
        // convenient way restrict the type of objects stored
        // in a collection
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {

            // To retrieve an element, an explicit type cast is needed
            // because the collection stores only Object.
            String str = (String) itr.next(); // explicit cast needed here.

            System.out.println(str + " is " + str.length() + " chars long.");
        }
    }
}