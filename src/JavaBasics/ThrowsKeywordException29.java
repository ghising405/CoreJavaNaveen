package JavaBasics;
/*
throws keyword:
it is also used to handle exception. Here we don't report anything.
it is always used when we have method chaining.
throws keyword: you have to write after method name

throws ArithmeticException: this means if you have 1000 lines of code, and out of 1000 lines 100 lines are giving exception at different lines.
if you are using try catch, you will have to use try/catch block 100 times.
Therefore, to avoid this kind of situation we use throws ArithmeticException.
throws ArithmeticException: the method has thrown an exception. But who will catch the exception? Sum() will catch it because sum() has div() inside it.
    sum() has called div() so now it's sum()'s responsibility to catch the exception. So now sum() will have throws ArithmeticException.
Again sum() will throw exception to main() because now sum() is inside main().

Ultimately nobody is catching the exception; everyone is throwing it.
div() throws to sum(); sum() throws to main(); main() also throws.
call: main() to sum(); sum() to div(); division() is generating exception line.
** Now the throws ArithmeticException is with main(). who will call the exception????
--> jvm will accept this exception. run it to see what happens. it will give exception hierarchy.
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at JavaBasics.ThrowsKeywordException29.division(ThrowsKeywordException29.java:37)
	at JavaBasics.ThrowsKeywordException29.sum(ThrowsKeywordException29.java:33)
	at JavaBasics.ThrowsKeywordException29.main(ThrowsKeywordException29.java:27)

System.out.println("ABC"); //this will not be printed because the error is found in code before this i.e obj.sum(). so whatever be the number of codes after obj.sum() that will not be printed because the program got terminated after obj.sum().How to handle it? use try catch block.

 */

public class ThrowsKeywordException29 {

    public static void main(String[] args) throws ArithmeticException { //NOW WHO WILL CATCH THE EXCEPTION?
        ThrowsKeywordException29 obj = new ThrowsKeywordException29();
        obj.sum(); //Program ends here, no more execution. the program is terminated.
        //calling sum method; it will go to sum(); inside sum() there is division(); it will call div method;
        // it will go to division method and it will give an exception. now you have two choices: either handle it using try/catch or throws
        System.out.println("ABC"); //this will not be printed because the error is found in code before this i.e obj.sum().
        //so whatever be the number of codes after obj.sum() that will not be printed because the program got terminated after obj.sum().
    }

    public void sum() throws ArithmeticException{
        division();   //called division() inside sum()
    }

    public void division()throws ArithmeticException{ //throws ArithmeticException: this means
        int i = 9/0;  //exception line
    }

//how to handle program termination problem??
    //crated another class for this. ThrowsKeywordTerminate29
}
