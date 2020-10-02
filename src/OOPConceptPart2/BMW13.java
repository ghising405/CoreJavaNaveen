package OOPConceptPart2;

/*The relationship between car and BMW:
car = parent
BMW = child
To make relationship between 2 classes: use extends keyword

BMW has access to all 3 methods of parent class
and all 2 methods of parent class

Method overriding: when same method is present in parent class as well as in child class with the same name and
same number of arguments. Then it is called method overriding.
parent = start()
BMW/child = start()


 */


public class BMW13 extends Car13{ //This relationship is called "Has-a relationship".

    //BMW has its own start method: special automatic start method
    public void start(){  //overridden method because start() is also in parent class.
        System.out.println("BMW-----start");
    }

    //BMW has one more method: theft safety method
    public void theftSafety(){
        System.out.println("BMW-----theftSafety");
    }


}
