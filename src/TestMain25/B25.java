package TestMain25;

/*
calling B's main() in A's main()
-->can  call directly or by class name.
here we can do : B.main() in A.
 */
public class B25 {

    public static void main(String[] args) {

        System.out.println("B- Main method");
      //  A25.main(args); //this will give infinite value because it will first call B then A, and goes to A then B....so A-B, B-A will execute infinite times
        //this is called stack overflow because memory will be full now.
    }
}
