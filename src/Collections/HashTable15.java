package Collections;

import java.util.Hashtable;
/*
HashTable is also a collection / dynamic array.
1. created hashtable object

 */

public class HashTable15 {

    public static void main(String[] args) {

        //creating hashTable object
        Hashtable h = new Hashtable();
        h.put("A", "test"); //--- didn't work
        h.put("B", "Hello");
        h.put("C", "World");

        System.out.println(h.size()); //3
        System.out.println(h.get("A")); //key A = test

        Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
        //see the video again








    }
}
