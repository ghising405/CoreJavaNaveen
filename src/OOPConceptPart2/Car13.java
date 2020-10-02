package OOPConceptPart2;

//parent  class
//it has three methods: start(), stop(), refuel()

public class Car13 extends Vehicle13{

    //no main method because we are not going to execute. we are only designing the method
    public void start(){
        System.out.println("Car------start");
    }

    public void stop(){
        System.out.println("Car-------stop");
    }

    public void refuel(){
        System.out.println("Car-------refuel");
    }
}
