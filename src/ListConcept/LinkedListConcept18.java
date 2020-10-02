package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

/*
LinkedList = it is a class

 */
public class LinkedListConcept18 {
    public static void main(String[] args) {

        //creating LinkedList object. We use LinkedList keyword because we are creating LinkedList object.
        LinkedList<String> ll = new LinkedList<String>();

        //adding a string using the reference variable
        ll.add("test");
        ll.add("QTP");
        ll.add("selenium");
        ll.add("RPA");
        ll.add("RFT");

        //to print:
        System.out.println("content of LinkedList: " +ll);

        //addFirst: you want to add / introduce first element
        ll.addFirst("Naveen");

        //addLast: you want to add last element that is pointing to null
        ll.addLast("Automation");
        //printing the new values
        System.out.println("content of LinkedList: " +ll);


        //how to get and set values?
        System.out.println(ll.get(0)); //now its Naveen because of addFirst method. This is get value

        //set value
        ll.set(0, "Tom"); //before 0 index = Naveen, now 0 index = Tom
        System.out.println(ll.get(0)); //will print new set value. first we set and then get the value.

        //remove first and last element
        ll.removeFirst();
        ll.removeLast();
        System.out.println("linked list content: "+ll); //will remove first and last elements. removed naveen and automation.

        //to remove from a specific position
        ll.remove(2);
        System.out.println("linked list content: " +ll); //selenium = index 2 will be removed.

        System.out.println("*****************************");
        /*how to iterate / print all the values of LinkedList?
        => 1. using For Loop
        2. using advance For Loop
        3. using iterator
        4. using while loop
         */

        //using for loop
        System.out.println("using For loop");
        for(int i=0; i<ll.size(); i++){
            System.out.println(ll.get(i)); //printing all the values using For loop
        }

        //using advance for loop : also called for each loop
        System.out.println("using Advance For loop");
        for(String str : ll) {  //we know all our values are String type so String, str = String reference variable, ll = linkedList object.
            System.out.println(str); //print string variables in ll object using str reference variable.
        }

        //using iterator
        System.out.println("******using iterator");
        Iterator<String> it = ll.iterator();
        while (it.hasNext()){ //hasNext = if the next element is available
            System.out.println(it.next()); //next method will print.
        }

        //using while loop
        System.out.println("using while loop");
        int i = 0;
        while (ll.size()>i){
            System.out.println(ll.get(i));
            i++; //if not increased it will give infinite values
        }

    }
}
