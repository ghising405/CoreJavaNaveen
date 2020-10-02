package AbstractionConceptOOP24;

/*
Testing HDFC's feature
Abstraction means: to hide some implementation logic.

Abstract  class = can have abstract and non-abstract methods.
Cannot create the object of abstract class i.e. Bank
 */

public class TestBank24 {

    public static void main(String[] args) {

        //creating object of HDFC bank
        HDFCBank24 hb = new HDFCBank24();
        hb.credit();    //directly coming from bank.java
        hb.debit();     //also directly coming from bank.java
        hb.loan();      //can access from HDFC because it's a overridden method.
        hb.funds();     //can call because it is it's own method. Only HDFC reference variable can access it, not other reference variables.

        //to achieve dynamic polymorphism: parent parent-obj-ref = new child(object)
        Bank24 b = new HDFCBank24();  //this can  pull overridden + parent's features(inherited from parents) but not of child
        b.loan(); //overridden
        b.credit(); //parent
        b.debit();  //parent
        //b.fund();   //cannot access because child class (HDFC) will not allow. It is part of only HDFC.

        // Bank24 b = new Bank24(); //we cannot create the object of abstract class.





    }
}
