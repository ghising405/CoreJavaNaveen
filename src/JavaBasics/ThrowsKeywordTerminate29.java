package JavaBasics;
/*
using try catch to avoid termination
throws: said in which line there is an error. this will terminate the program.
try catch: handled that specific line's error so that the program doesn't get terminated. This will run the whole program despite exception.
handled exception and "the program is not terminate...ABC" is printed.

** combined throws and try catch block. this way it will not go to jvm.
catch(Throwable e) = will handle any error or exception
catch(Exception e) = will say what exception is coming
 */

public class ThrowsKeywordTerminate29 {

    public static void main(String[] args) {
        ThrowsKeywordTerminate29 obj = new ThrowsKeywordTerminate29();
        obj.sum();
        System.out.println("the program is not terminate...ABC");

    }

    public void sum(){
        try {
            division();  //we know that this method has exception because we have called it.
        }
        //catch (ArithmeticException e){ }
       catch (Throwable e) {   //throwable e= it will handle any error or exception if you don't know what that error or exception is.
       }
    }

    public void division() throws ArithmeticException{
        int i = 9/0; //exception line
    }
}



