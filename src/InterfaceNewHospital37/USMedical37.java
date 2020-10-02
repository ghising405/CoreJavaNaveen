package InterfaceNewHospital37;

/*
Interface doesn't have method body. it is just a method prototype
US medical is the child of WHO.

 */
public interface USMedical37 extends WHO37 {

    int min_fee = 10; //by default static and fina. To access: call by className: USMedical37.min_fee

    public void physioServices();  //method declaration / prototype

    public void oncologyServices();

    public void orthopedicServices();

    public void radiologyServices(); //added new feature after 2 yrs. Apollo will get error because now Apollo will have to override.

    //we cannot create object of interface.
    //only method declaration -- only method prototype  --- no method body
    //cannot create static prototype method in Interface : because  we cannot override  static method.
    //but  interface variables are static and final by default. Can be accessed in static way i.e. call by Interface name/ class name.


    //From JDK 1.8 you can have static method in interface but with  method body. BUt abstract method cannot have static
    //can i have static method with method body?
    //abstract method: static not allowed. non-abstract method: static allowed
    public static void Services_911(){  //can i override this method? No.
        System.out.println("US - 911 services......"); //how to call static? by interface name or class name
    }


    //default method: cannot be static.
    //can i override this method? No.
    //how to call? call by object
    default void internship(){
        System.out.println("Apollo --------Internship");
        /*if any student is coming to Apollo hospital, Apollo hospital says we don't have any rules for internship.
        We are following the same rules which are defined by US medical association by the US government that internship
        should be there. You come here for 1 month  or 6 month internship. But we are calling the method defined in internship (internship() )
        in Interface. And we cannot also override.
        It's not like:
        US government says 6 months internship and I override and then I say only for 1 month. I cannot override.
        This is the default internship method.

         */

    }




}
