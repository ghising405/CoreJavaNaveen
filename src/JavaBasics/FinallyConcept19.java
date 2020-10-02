package JavaBasics;

/*
finally = block : has starting and ending body
finally is always used with try and catch
whatever is written inside finally will be printed.
finally is a reserve keyword, which is used in association with try catch.
finally will be executed after try catch block.But before the control transfer back to its origin, means whatever exception is coming doesn't matter.
immediately after the try catch, the code inside finally will be executed. Doesn't matter exception is coming or not.

When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

The try statement: allows you to define a block of code to be tested for errors while it is being executed.

The catch statement: allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs

Working mechanism:
1. we will call and run method test1()
2. will got to try block; print inside test1 method; immediately it is throwing an exception.
3. The moment it throws an exception, it will come to the catch block. it will print inside catch block.
4. there is exception but still finally will be executed.
5. finally will be executed after try catch block. but before the control transfer back to its origin, that means whatever exception is
coming, doesn't matter. Immediately after the try catch block, the code inside the finally block will be executed, doesn't matter exception is coming or not.




 */

public class FinallyConcept19 {

    public static void main(String[] args) {
        //test1(); //calling test method directly because it is static
        //test2();
        // division();
        divisionWithWrongCatch();


    }

    /*the moment I come inside the try catch block, it is throwing some exception. So how to throw some exception?
    throw = keyword : if i want to deliberately throw some exception then we use throw keyword.
    */

    public static void test1() {
        try {
            System.out.println("inside test1 method");
            throw new RuntimeException("test"); //throw= deliberately we want to throw. RunTimeException = the name of exception we want to throw
        } catch (Exception e) {  //exception e = catch block is catching some exception.
            System.out.println("inside catch block");
        } finally {
            System.out.println("inside finally block");
        }

    }

    //creating another method:
    //this method will be called outside try catch block.
    //it will come inside this method, it will see there is no  any exception. And then goes to finally and will print code inside it.
    public static void test2() {
        try {
            System.out.println("inside test2");
        } finally {
            System.out.println("finally code in test2 method");
        }

    }

    public static void division() {
        int i = 10;
        try {
            System.out.println("inside try block");
            int k = i / 0; //in java cannot divide by 0 coz will give you infinite value
        } catch (ArithmeticException e) {
            System.out.println("inside catch block");
            System.out.println("divide by zero error");
        } finally {  //guarantees that whatever code is given inside finally, that code will be executed even though there is an exception.
            System.out.println("execute this code even after any exception");
        }

    }

    public static void divisionWithWrongCatch() {
        int i = 10;
        try {
            System.out.println("inside try block");
            int k = i / 0; //in java cannot divide by 0 coz will give you infinite value
        } catch (NullPointerException e) {  //expected = Arithmetic Exception, found = NullPointer exception. i.e. wrong catcher
            //in this case this catch block will not be executed. it will throw an error.
            System.out.println("inside catch block");
            System.out.println("divide by zero error");
        } finally {  //guarantees that whatever code is given inside finally, that code will be executed even though there is an exception.
            System.out.println("execute this code even after any exception");
        }

    }
}

