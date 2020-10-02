package OOPConceptPart1;

/*
Class = entity where we've to define properties, number of methods and variables.
eg. Naveen  = human class
properties = eat, sleep, write code, walk, play cricket, etc.
Class is an entity where properties are defined in the form  of methods and variables.

create two variables in this  class. Immediately after car class created variable is global  variable
the global variable will be given to each and every  objects.
eg. if you've created 100 objects, the global variable will be given to 100 objects

1. created three objects and these objects are referred by a, b, c
2. copies of global variable given to each objects
3. initialized two class variables
initialized these two class variables with a reference variable
new keyword is used to create the object.
a,b,c are object reference variable or object reference name.



 */

public class Car6 {

    //Class variables  or global variables
    int mod; //model
    int wheel;

    public static void main(String[] args) {

        //new Car6() : this is the object of Car6 class
        // a , b , c : object reference variable
        // class-name object-reference-variable = object
        //new keyword is used to create the object
        Car6 a = new Car6();
        Car6 b = new Car6();
        Car6 c = new Car6();

        //if you want to give  some value: initialized value
        a.mod = 2015;
        a.wheel = 4;

        b.mod = 2014;
        b.wheel =4;

        c.mod = 2013;
        c.wheel = 4;

        System.out.println("Before assigning the references");

        // to print the value with model a object
        System.out.println(a.mod); //2015
        System.out.println(a.wheel); //4

        System.out.println(b.mod); //2014
        System.out.println(b.wheel); //4

        System.out.println(c.mod); //2013
        System.out.println(c.wheel); //4


        System.out.println("After shifting the references");
        //a will refer b.
        //b will refer c.
        //c will refer a, but now a is referring b so, c will also refer b.
        //and a now have no reference.
        //Now a = no reference, b = a, c ; c = b

        a=b;
        b=c;
        c=a;

        a.mod = 10;
        System.out.println(a.mod); //10
        c.mod = 20;
        System.out.println(a.mod); //20 now the  value of a.mod will be 20 because c=a and the new value  of a is the value of c i.e. 20.
        //the newest value will be accepted








    }
}
