package testPackage19;

public class ParentClass19 {

    //public final class ParentClass19 : if you don't want to be a parent class, make it final.
    //this means you cannot create child of parent class.
    //to prevent inheritance we use final keyword

    public void start(){
        //public final void start(): if method declared with final keyword: the child class will get error and says the method cannot be overridden because parent class method has final
        //inside child class we cannot have same method i.e start() and same method name and parameter.
        //final also prevents method overriding.

        System.out.println("parent -----start method");
    }
}
