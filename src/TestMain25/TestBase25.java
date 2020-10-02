package TestMain25;

/*
Can  we  overload main method? Yes. How? with same name and different  number of parameters.
Method  overloading: in a particular class when we have different number of methods with same name and different number of
arguments or different type of arguments / parameters.
*duplicate methods are not allowed: same name, same number  of arguments

While running:
JVM (java virtual machine) will search for : public static void main(String[] args). this method should be= public, static and void. If this is not found, java will not execute the program.
And whatever is inside main method that will be executed.
How to call other main methods? this  is static so we can call it directly.

 */

public class TestBase25 {

    public static void main(String[] args) {  //string array argument
        System.out.println("main method --- 1");
        main("Testing");
        main(10);
        main(10,20);

    }

    //overloading main method
    public static void main(String args){ //normal string argument/parameter
        System.out.println("main method --- 2");

    }

    public static void main(int a){
        System.out.println("main method ---- 3");
    }

    public static void main(int a, int b){
        System.out.println("main method ---- 4");
    }
}
