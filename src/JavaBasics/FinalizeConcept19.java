package JavaBasics;

/*
1. creating two objects.
finalize keyword is used to perform the cleanup.
f1 = null
f2 = null : these means that there are two blank objects without any reference inside the memory.
to perform cleanup: we call garbage collector.

** operation:
finalize() will be automatically called.
1. goes to main(); check 2 objects are there; f1=null; f2=null;
2. calls finalize() : to perform some cleanup processing, just before the object is garbage collected.
3. System.gc(); will collect the garbage.

 */

public class FinalizeConcept19 {

    public void finalize(){
        System.out.println("finalize method");
    }


    public static void main(String[] args) {


        FinalizeConcept19 f1 = new FinalizeConcept19();
        FinalizeConcept19 f2 = new FinalizeConcept19();

        f1 = null;
        f2 = null;

        //finalize() will come and do the cleanup process. and then garbage collector will collect the garbage.

        System.gc();
    }

}
