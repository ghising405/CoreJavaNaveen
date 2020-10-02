package OOPConceptPart2;

/*
testing the child class features
1. We cannot create object of interface. i.e. USBank b = new USank() is not allowed.
2. can create object of HSBC bank i.e. HSBC hs = new HSBC() --> because HSBC is a class publicly defined.
3. How to access the variable: int min_bal=100; ?
It is static by default/ nature so we have to call it directly or by Interface name i.e USBank
min_bal = also final in nature i.e. cannot change the  value.
****** we call only in main method.
 */

public class TestBank14 {

    public static void main(String[] args) {

        System.out.println(USBank14.min_bal); //calling min_bal variable using Interface name.

//this is compile time polymorphism: got features of parent and child. Overridden + separate class will be called.
        HSBCBank14 hs = new HSBCBank14();
        hs.credit(); //overridden
        hs.debit(); //overridden
        hs.transferMoney(); //overridden
        hs.eduLoan(); //hsbc
        hs.carLoan(); //hsbc

        //run this.

//in dynamic polymorphism, child class object can be referred by parent interface reference variable.
        //can access only overridden methods or the methods that are in parent class or interface.
         USBank14 b = new HSBCBank14();
         b.credit(); //overridden / parent
         b.debit();     //overridden / parent
         b.transferMoney();     //overridden / parent

    }
}
