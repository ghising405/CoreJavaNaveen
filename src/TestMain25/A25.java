package TestMain25;

/*

 */

public class A25 {

    public static void main(String[] args) {
        System.out.println("A- main method");

        //calling B in A's main method by B's class name
        B25.main(args);
    }
}
