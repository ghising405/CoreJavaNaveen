package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList: is a dynamic array.
One of the most important dynamic array is ArrayList.
In ArrayList if you add value, automatically size will be increased. So, size doesn't matter in ArrayList concept.
index + 1 = size of array

 */
public class ArrayListConcept17 {

    public static void main(String[] args) {

        int a[] = new int[3]; //normal static array = size is fixed. that's a problem. To resolve this problem we use dynamic array / collections.

        /*dynamic array --> ArrayList
        1. it can contain duplicate values/ elements.
        2. maintains the insertion order: It insert the value on the basis of ordering (0,1,2,3,4,5,...)
        3. It is not synchronized that's why it is slow compared to other collections. In terms of multi threading concept, it is not thread safe.
        4. it allows random access to fetch the element because it stores the values on the basis of indexes.
        5. To print all the values of ArrayList:
        ---> 1. use For loop        2. use iterator
         */


        //creating object of ArrayList
        ArrayList ar = new ArrayList(); //imported from java.util package

        //storing values
        ar.add(10); //stored in index 0
        ar.add(20); //index 1
        ar.add(30); //index 2 so size is 3

        //to find the size of ArrayList
        System.out.println(ar.size()); //3

        //if we store more values
        ar.add(40); //index 3
        ar.add(50); //index 4
        System.out.println(ar.size()); //5 last index=4=4+1=5

        //Properties of ArrayList

        //1. it can store duplicate values also
        ar.add(50); //index 5
        System.out.println(ar.size()); //6

        //fetching/ retrieving the value of particular ArrayList from an index is easy: allows random access.
        System.out.println(ar.get(4)); //50

        System.out.println("************************");

        //print the values of ArrayList:
        //Using For loop
        for (int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i)); //will gives the values in each indexes.
        }

        //non-generic vs generic

        //this is generic: if we want to store only integer then we do this.
        //<Integer> = generic. Integer = wrapper class. This will allow only integer values.
        //Generic can be data types and object.
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(100);
        //ar1.add("selenium"); gives error.

        //generic in string
        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("test");
        ar2.add("selenium");

        //if not sure what kind of data it will be:
        //ArrayList<E> ar3 = new ArrayList<E>();


        System.out.println("*****************************");

        //Employee class objects: created three employees
        Employee17 e1 = new Employee17("Naveen", 27, "QA");
        Employee17 e2 = new Employee17("Tom", 28, "Dev");
        Employee17 e3 = new Employee17("Peter", 29, "Admin");

        //creating ArrayList object
        // here we want to store three employee objects.
        //make the generic type Employee to store the Employee object.
        //<Employee> : can store Employee objects
        ArrayList<Employee17> ar4 = new ArrayList<Employee17>();
        //adding objects in ArrayList
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        /*
        Using iterator: Iterator traverse the values. Iterator is also part of Generic
         */

        //iterator to traverse the values
        Iterator<Employee17> it = ar4.iterator();
        //how to traverse? => using While loop
        while (it.hasNext()){
            Employee17 emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

        System.out.println("***********************");


        //addAll(): this will merge two ArrayList together.
        //create arraylist
        ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("test");
        ar5.add("Selenium");
        ar5.add("QTP");

        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("Dev");
        ar6.add("Java");
        ar6.add("JavaScript");

        //two objects created ar5 and ar6 with object references.
        //Now i want to perform addAll() method: adding second list in first list. ar6 will be added to ar5
        ar5.addAll(ar6);

        //to print all the values we use for loop
        for(int i=0; i<ar5.size(); i++ ){ //performing action on ar5. ar6 will be added inside the ar5.
            System.out.println(ar5.get(i)); //before ar5 had 3 values, now it will have 6 values.
        }

        System.out.println("**********************");

        //removeAll()
        ar5.removeAll(ar6);
        for (int i=0; i<ar5.size(); i++){
            System.out.println(ar5.get(i)); //will print index values in ar5
        }

        System.out.println("**********************");
        //retainAll() : to check the common / intersection part
        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("test");
        ar7.add("selenium");

        ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add("test");
        ar8.add("java");

        ar7.retainAll(ar8);
        for(int i = 0; i<ar7.size(); i++){
            System.out.println(ar7.get(i)); //should print common value
        }













    }
}
