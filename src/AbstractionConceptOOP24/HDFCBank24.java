package AbstractionConceptOOP24;

/*
I want: HDFC bank should be the child of bank class. use extends.
Whenever you are going to implement abstract class, or whenever you are going to extend any abstract class it is child (HDFC's) responsiblity
to define loan() in child class
    Bank (parent) ---------- HDFC (child)

Bank: if you are going to extend me, I am having loan() abstract method. Now its your responsibility to define loan() in your class.

HDFC: we will extend you. the loan method you have defined as an abstract method, we will define the same method but we will write our own
business logic for example loan interest rate, loan amount, home loan, education loan, car loan, vehicle loan. We can define different
kinds of personal loan according to the HDFC bank.
I can directly inherit non-abstract method. (no need to implement)
Abstraction means: to hide some implementation logic.
 */

public class HDFCBank24 extends Bank24{

    @Override
    public void loan() {  //method overridden
        System.out.println("HDFC---LOAN Method");

    }

    //HDFC's own feature that  it doesn't want to expose to anyone
    public void funds(){
        System.out.println("HDFC----funds");
    }
}
