package AbstractionConceptOOP24;

/*
1. creating an abstract class.
properties:
 -- used abstract keyword
 -- at least one method should be abstract in nature
 -- abstract method: it is only prototype. i.e. only method declaration, there is no body i.e. {......}.
 -- can also have non-abstract method: no abstract keyword and has body.

 creating relationship between Bank and HDFC bank in another class
 Abstraction means: to hide implementation logic.
 Through abstraction we don't achieve 100% abstraction. Only partial abstraction will be achieved i.e (it will have both abstract and non-abstract method)

Test class : you  can call credit and debit method without defining/calling them in child class.
But to call loan in test class, you have to call loan() in HDFC class first.
Abstract  class = can have abstract and non-abstract methods.

We cannot create the object of abstract class.
In abstract class we can  define static, non-static and final variables.


 */

public abstract class Bank24 {  //added abstract to make this class abstract

//we can define static,  non-static, final variables in abstract  class
    int amt = 100; //non-static
    final int  rate = 10; //final
    static int loanRate =5 ; //static

    //creating an abstract method
    public abstract void loan();  //abstract method - no body
    //implementation logic is hidden over here. Implementation logic will be defined by the respective child class. the features will be defined by child class.
    //to call abstract method in test class, you have to call first in HDFC -----> and then to test class.



    //creating non-abstract method. doesn't have abstract keyword and has body.
    //credit and debit method feature is common for all. You can call directly in test class without defining them in HDFC class.
    //extend keyword has taken all the features automatically.
    //we can directly inherit from here, we don't have to define this in child class.
    public void credit(){
        System.out.println("Bank ---- credit");
    }

    public void debit(){    //non-abstract method
        System.out.println("Bank ---- debit");
    }


}
