package ListConcept;
/*
Hashtable: it is similar to hashmap, but it  is synchronized. stores the value on the basis of key and value
In hashtable: key ---> object ---HashCode ---> value : object has hashcode
Hashtable contains only unique elements i.e. (key, value) pair.
eg: st.put("C", "Selenium")
    st.put("C", "Selenium")
then it will not print C=Selenium two times. It will be printed only once.

******Hashtable cannot have any null key or null value. But in hashmap it's allowed.

 */

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

    public static void main(String[] args) {

        Hashtable h1 = new Hashtable();
        h1.put(1, "Tom");
        h1.put(2, "Test");
        h1.put(3, "Java");

        //how to clone/ create a clone copy or shallow copy of hashtable. Duplicate object creation.
        //create one more hashtable object
        Hashtable h2 = new Hashtable();
        h2= (Hashtable) h1.clone();  //now h2 will also have all those three values that is in h1 because of clone().

        System.out.println("the values from h1 : " + h1);
        System.out.println("the values from h2 : " + h2);

        h1.clear();
        System.out.println("the values from h1 : " + h1); //all the values from h1 is deleted. o/p {}
        System.out.println("the values from h2 : " + h2); //h2 will still have all the values. o/p {3=Java, 2=Test, 1=Tom}


        //contains value method:
        Hashtable st = new Hashtable();
        st.put("A", "Naveen");
        st.put("B", "Manager");
        st.put("C", "Selenium");
        //to check whether a value exists or not.
        if(st.containsValue("Naveen"))
            System.out.println("value is found");

        //How to print all the values/ access/ iterate  all the values using Hashtable --- Enumeration --- elements()
        Enumeration e = st.elements();
        System.out.println("print values from st using enumeration");

        //to get the values one by one
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


        //get all the values from Hashtable using entry set. entrySet() ----- set of hashtable values:
        System.out.println("print values from st using entry set ");
        Set s = st.entrySet();
        System.out.println(s);

        //equals method. want to check both hashtable objects are equal or not.
        Hashtable st1 = new Hashtable();
        st1.put("A", "Naveen");
        st1.put("B", "Manager");
        st1.put("C", "Selenium");
        //st1.put("D", null); //not allowed; will give null-pointer-exception. But in hashmap it's allowed.
        //st1.put(null, "java"); //not allowed; will give null-pointer-exception. But in hashmap it's allowed.

        //check both hashtable objects are equal or not.
        if (st.equals(st1))
            System.out.println("both are equal");

        //how to get value from specific key
        System.out.println(st1.get("A"));  //Naveen


        //hashcode method:
        //get the hashcode of hashtable object
        System.out.println("the hash code value of st1 : " + st1.hashCode()); //1787751094 unique number given by JVM


        //specific to generics: we can define key and value using generics.
        Hashtable<String, String > st3 = new Hashtable<String, String>();


    }
}
