package AbstractionConceptOOP24;

/*
to implement the features: Created class = BMW
car = parent; BMW=child;
BMW should implement all the methods in interface.
 */

public class BMW24 implements Car24{
    @Override
    public void start() {
        //writing own logic/ features
        System.out.println("BMW------start");

    }

    @Override
    public void stop() {
        //writing own logic / features
        System.out.println("BMW------stop");
    }

    @Override
    public void refuel() {
        //writing own logic / features
        System.out.println("BMW------refuel");
    }


    //non-overridden method: own method; method available only in BMW class.
    public void theftSafety(){

    }
}
