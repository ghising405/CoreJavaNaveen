package InterfaceNewHospital37;

/*
//can i do down casting? No. It means you have to create object of parent interface and we cannot create  object  of interface.
So we cannot do down-casting. child(ref-var) = parent(object). We cannot do this.

 */

public class TestHospital37 {

    public static void main(String[] args) {

        ApolloHospital37 ap = new ApolloHospital37();  //ap can access (call) all  the overridden and non-overridden methods
        ap.ambulanceServices();
        ap.emergencyServices();
        ap.ENTServices();
        ap.medicalInsurance();
        ap.neuroServices();
        ap.internship(); //default: we are able to call here because it is defined inside the parent and I can access parent properties.
        ap.getPatientHistory(); //we can access this because we can access parent class method.



        System.out.println(ap.min_fee); //not the appropriate way. Static variables must be accessed in static way i.e. call by classname or interface name.
        System.out.println(USMedical37.min_fee); //this is the appropriate way. calling by class name.
        USMedical37.Services_911(); //Calling by interface/ class name



 //Can we do top casting/dynamic polymorphism? Yes. parent = child
        //Top casting: child class  object can be referred by parent interface reference variable

        USMedical37 us = new ApolloHospital37(); //us can access only the features it has not from UK,  India and Apollo's  own feature
        us.oncologyServices();
        us.orthopedicServices();
        us.physioServices();
        us.internship();  //we can call because it is the reference variable of US


        UKMedical37 uk = new ApolloHospital37(); //can access only  UK
        uk.ambulanceServices();
        uk.ENTServices();

//can i do down casting? No. It means you have to create object of parent interface and we cannot create  object  of interface. So we cannot do down-casting.




    }
}
