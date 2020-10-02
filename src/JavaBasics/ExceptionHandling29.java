package JavaBasics;

/*
why do we use try catch block?
It  is very useful when you have exception and you can handle it.
it is also used for reporting point of view. i.e report your exception. like System.out.println("hey --- this is / by zero error"); take  screenshot; UI automation


 */
public class ExceptionHandling29 {

    int a = 10;

    public static void main(String[] args) throws InterruptedException {



        //uncaught exception: you don't know what exception is going to come. can see the exception after execution/running but cannot catch it.
        //int i = 9/0;
        //System.out.println(i);
        // this is uncaught exception; you don't know what kind of exception is coming. It cannot be caught.
        //you know the error only after you run it. you see: Exception in thread "main" java.lang.ArithmeticException: / by zero
        //in java any number cannot be divided by zero
        //it gives exception but we cannot catch it.

        //caught exception: where you'll know
        //Thread.sleep(2000); //Thread=class; sleep()=method; 2000=milliseconds=2 seconds (2000/1000=2);
        // This is caught exception : Immediately java will get to know that there is exception and will suggest either handle it by throws or use try catch block

        //ExceptionHandling29 obj = null; //not creating an object; just creating a reference which is equal to null.
       // System.out.println(obj); //printing the value of obj. output = null

        //But if: created proper object:
        //ExceptionHandling29 obj1 = new ExceptionHandling29(); //proper object is created.
        //obj1 = null;
        //System.out.println(obj1); //output = null

        //declared int a =10 in class level;
        //ExceptionHandling29 obj2 = new ExceptionHandling29();
       // obj2 = null;  //this means we have canceled the reference and instead of obj.a=10; obj2 will be null. i.e. obj2 is not representing any object.
        //System.out.println(obj2.a); //running this will give NullPointerException: Exception in thread "main" java.lang.NullPointerException
        // : this is because we have declared object reference to null.
        //NullPointerException: either your object is not declared properly or or your object reference is null.

//How to handle error?? ==> use exception handling. There are three types of exception handling
//1. try catch block: you see first that particular line might give exception, then you handle inside the catch block. how to do that?

        try{
            int i = 9/0; //you know this line will give an error/ exception. This line will throw an exception.
        }
        catch (ArithmeticException e){     //here we have to tell what kind of exception/error it is giving.
            //(): what kind of exception it is giving. Here it's giving Arithmetic exception.
            //ArithmeticException = class
            // e = exception reference
            //catch(exception name)
            //catch process: java will come inside catch block and sees yes it's giving Arithmetic exception.
            //if you run this: ABC will be printed because ArithmeticException e has handled the error/ exception in int i = 9/0.
            e.printStackTrace(); //this will say that the program is not terminated and will also show where exactly the problem is.
            System.out.println(e.getMessage()); //will give what the error ie: /zero
            System.out.println("hey --- this is / by zero error"); //this is called reporting and we can do in catch.


        }

        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");









    }
}
