package InterfaceNewHospital37;

public class ApolloHospital37 extends GlobalPatientData37 implements USMedical37, UKMedical37, IndianMedical37 {
    //apollo hospital is extending global patient data and implementing US, UK and India together.
//overridden method:
//US Medical:
    @Override
    public void physioServices() {
        System.out.println("AP - Physio");
    }

    @Override
    public void oncologyServices() {
        System.out.println("AP - Oncology");
    }

    @Override
    public void orthopedicServices() {
        System.out.println("AP - Orthopedic");

    }

    @Override
    public void radiologyServices() {   //this service is in US, UK an India. But where is this coming from?
        //we don't have to override it three times. That will create duplicate method. So we will write only one override method and inside it we can  write whatever logic we want to write.

    }

    //UK medical:
    @Override
    public void ENTServices() {
        System.out.println("AP - ENTServices");

    }

    @Override
    public void ambulanceServices() {
        System.out.println("AP - PhysioServices");

    }


//Indian medical:
    @Override
    public void emergencyServices() {
        System.out.println("AP - emergencyServices");

    }

    @Override
    public void neuroServices() {
        System.out.println("AP - neuroServices");

    }

    @Override
    public void pediatricServices() {
        System.out.println("AP - pediatricServices");

    }

 //Apollo hospital's own features/ method. Non-overridden method.

    public void OPTServices() {
        System.out.println("AP - OPTServices");
    }

    public void medicalInsurance() {
        System.out.println("AP - medical insurance");
    }

    public void pathologyServices() {
        System.out.println("AP - pathologyServices");
    }

//WHO services
    @Override
    public void polioServices() {  //business logic is up to you but you have to have this service. and it is same for all.

    }
}
