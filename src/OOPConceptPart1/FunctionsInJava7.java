package OOPConceptPart1;

/*
Right now: there is only one function and that is main function.
Functions and methods are same thing. They are like a factory. Example: there are Nike, Reebok factory.
If you pass something to Nike factory, it will give you Nike cap/ T-shirt.
Some factories are there, you don't give anything but you still get output.
no input and no output.
In Java also we can create end number of functions and end number of methods. But there are 3 types of functions and 3 types of methods.

Methods:
1. no input no output
2. no input but still getting some output
3. passing some input and getting some output on the basis of those inputs: when we pass something inside method's bracket

creating method:
public void test(){ }
public = publicly available
void = does not return any value
test() = method name
main() = starting point of execution

Non static method: test(), pqr(), qa(), division() --> because these does not have keyword static.

Including main method, here we have 5 methods.
main(), test(), pqr(), qa(), division()
while executing:
Java compiler will  check main method is there or not? because main method is the starting execution point.
it will see nothing is written inside main method and will come out of the main method and the program is over.
It will not print anything. It will not call test(), pqr(), qa(), division() methods.

So how to call these test(), pqr(), qa(), division() methods/ factories?
whenever we have to call or access any factories, we need one entity and that entity is called OBJECT.
How to create object?
classname object-name = new classname();
object = ne classname()
one object will be created, obj is the reference variable, referring to this object.
after creating the object, the copy of all the non-static methods will be given to this object.

** object cannot hold static method, it can hold only non-static method.

Therefore, to call the non-static method of any class, you've to use object reference variable or object name.

Main method is void: because we never write return statement inside the main method.






 */
public class FunctionsInJava7 {


    //main method is void = because it never returns a value
    public static void main(String[] args) {
        FunctionsInJava7 obj = new FunctionsInJava7(); //object created to call methods outside main method
        //one object will be created, obj = reference variable referring to this object.
        //after creating the object, the copy of all  non static methods will be given to this object.

        //calling non-static method using object reference variable
        obj.test(); //main-void, test-void
        //how it works?
        //1. if you run this program, it will check main method is there.
        //2. it will see you are creating the object.
        //3. since all the copies of non-static method is given to object, the object can call obj.text()
        //4. then it will jump to test() that is outside main method.
        //5. it will go inside test(), prints test method, no return
        //6. test method is over and it will again go to main method. and then call other methods similarly.

        int l =  obj.pqr();
        //this method has return c; c=a+b; c=30; this 30 will be given to obj.pqr(). This value will be stored in some int variable int l
        System.out.println(l); //we can print in console only after sout.

        String s1 = obj.qa();
        //this has return s; s=selenium; selenium will be given to obj.qa(). this value will be store in some string variable
        //eventually obj.qa() = sel = selenium
        System.out.println(s1); //then we can print selenium.

        int div = obj.division(30,10); //calling division method and adding parameters x=30 and y=10.
        System.out.println(div); //will print 3.
        //return is d; d=x/y; d=30/10; d=3; this 3 will be given to obj.division(30,10); obj.division(30,10) will give 3 to int variable div.




    }

    //non static method
    //how to create a method?
    //public = this method is publicly available
    //void = does not return any value
    //test() = method name
    //the return type of test method is void
    //1.  1st type of factory
    public void test(){
        System.out.println("test method"); //*************no input no output
    }

    //another method / 2nd type of factory
    //pqr() = method name
    //whatever written before the method name. here int = return type
    //
    public int pqr(){  //void = returns nothing, int = returns int
        System.out.println("PQR method");
        //inside this pqr method we are declaring some variable
        int a = 10;
        int b = 20;
        int c = a+b; //30

        //how to get return from a method? We have to use return keyword
        //return c;
        //it gives error because the return type of this method is void. Void means it does not return anything
        //to remove the error we should remove void and write the data type of c that it int.
        return c; //*********no input some output
    }

    //method that will give you some return / 2nd type of factory
    //method name = qa()
    //return type = string
    public String qa(){
        System.out.println("qa method");
        String s = "Selenium";
        return s;  //**************no input, some output

    }

    //3rd type of factory: some input, some output. passing two integer values x and y inside method
    //method name = division
    //x,y  = input parameters or input arguments
    //return type = integer
    public int division(int x, int y){
        System.out.println("Division method");
        //creating variable
        int d = x/y;
        return d; //d=int so int=return type

    }

}
