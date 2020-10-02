package ListConcept;

/*
HashMap is a class which implements Map Interface
it extends AbstractMap.
it contains only unique elements
stores values in the form of key and value pair
it may have one null key and multiple null values
it maintains no order
HashMap is non-synchronized.: If it is used in multi threading environment or multi threading concept then more than one thread can
access and process the HashMaps simultaneously. It means there are multiple threads running on and then hashmap object can be
accessed by all the thread. So the performance of the hashmap will be increased automatically. Because whenever you have to use
fast performance system in that case we have to use hashmap.
We don't use hashtable because hashtable is synchronized. Hashtable at a time only one thread can access hashtable object.
But hashmap can be accessed by multiple threads.

Concurrent modification exception = fail - fast condition.
1. create object of HashMap
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String[] args) {

        //creating an object for HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        //to store any value in HashMap use: put(key, value)
        hm.put(1,"Selenium");
        hm.put(2, "QTP");
        hm.put(3, "TestComplete");
        hm.put(4, "FTP");

        //to fetch particular value from HashMap we use get(key)
        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        System.out.println(hm.get(3));
        System.out.println(hm.get(4)); //this will give null. not an exception because it does not store value on the basis of indexes

        //to fetch all the values from HashMap we use: for loop and map.entry concept
        //i.e for(Map<k, v>.entry<k, v>) But this can be written in the following way
        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("**********");
        //before removal
        System.out.println(hm);
        //to remove: remove(key) / After removal
        hm.remove(3);
        System.out.println(hm); //{1=Selenium, 2=QTP, 4=FTP}

        System.out.println("*****************Employee17 class****+++++++++++++*********");
        //Java HashMap with Employee17 class reference
        //creating HahMap object
        HashMap<Integer, Employee17> emp = new HashMap<Integer, Employee17>();
       //creating object of class to create multiple employees
       Employee17 e1 = new Employee17("Tom", 25, "Admin");
       Employee17 e2 = new Employee17("Peter", 26, "QA");
       Employee17 e3 = new Employee17("Steve", 27, "Dev");

       //using HashMap to store the employee information in the form of key and value in HashMap reference emp.
       emp.put(1, e1);
       emp.put(2, e2);
       emp.put(3, e3);

       //to print all the values/ iterate/ traverse class objects using the hashMap: use for loop
       for (Map.Entry<Integer, Employee17> m1 : emp.entrySet()){
           //to get the key
            int key = m1.getKey();
           //to get the value
          Employee17 e = m1.getValue();
          System.out.println(key + " Information :");
          System.out.println(e.name + " " + e.age + " " + " " + e.dept);
        }








    }
}
