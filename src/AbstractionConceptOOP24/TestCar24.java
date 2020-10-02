package AbstractionConceptOOP24;

/*
we cannot create the object of interface so we will create the object of child(BMW) CLASS.
 */

public class TestCar24 {

    public static void main(String[] args) {

        BMW24 b = new BMW24();
        b.start();  //overridden
        b.stop();   //overridden
        b.refuel(); //overridden
        b.theftSafety(); //it's own method

        //if try to achieve dynamic polymorphism: parent parent-ref = child object; doing top-casting
         Car24 c = new BMW24();
         c.start();     //overridden
         c.stop();      //overridden
         c.refuel();    //overridden
       //  c.theftSafety(); //cannot access this because it is child's own method and will not allow parent-ref-var to refer.



    }
}
