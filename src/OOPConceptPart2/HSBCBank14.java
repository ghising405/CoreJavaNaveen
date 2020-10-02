package OOPConceptPart2;

/*
To build a relationship between class and interface we've to use "implements" keyword
USBank = parent interface
HSBCBank = child class
HSBC bank must compulsorily implement all the methods in USBank interface
The only rule is to follow all the rules in interface.
here we have to give method body according to HSBC bank. There we write HSBC business policies and logics.
USBank: we're not bothered about what business logic HSBC is going to write/use. We just want to make sure that our people should
get these 3 facilities : credit, debit and transferMoney.
HSBC: okay we are ready to give these 3 facilities. But we will implement our business according to us.We will define your method but inside body is up to us.
USBank: allows

That's why we never give method body inside the interface. And we give method body in the implements class.
(so that the child can write their own thing inside body)

Concept:
If a class is implementing any interface, then it is mandatory to define or override (bring in) all the methods of Interface.

Here we are achieving multiple inheritance. that means multiple parents are there.


 */



public class HSBCBank14 implements USBank14, BrazilBank14{ //we are  achieving multiple inheritance. 2 parents of a single class
    //Is-a relationship

//Override: inherited "all" the methods/ functions of parent interface / USBank.
    //overriding from USBank
    @Override
    public void credit() {
        System.out.println("HSBC----credit");
    }

    @Override
    public void debit() {
        System.out.println("HSBC-----Debit");
    }

    @Override
    public void transferMoney() {
        System.out.println("HSBC--------transferMoney");
    }

    //extra features: child's (HSBC) own features
    //separate method of HSBC bank
    public void eduLoan(){
        System.out.println("HSBC------eduLoan");
    }

    public void carLoan(){
        System.out.println("HSBC------carLoan");
    }

    //implementing BrazilBank's mutual method.
    //overriding from Brazil bank
    public void mutualFund(){
        System.out.println("HSBC-------mutual fund");
    }


}
