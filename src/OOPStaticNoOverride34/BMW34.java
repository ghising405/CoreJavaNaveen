package OOPStaticNoOverride34;



public class BMW34 extends Car34{

    //try to override start method: yes we can because it has same signature: public void start
    @Override
    public void start(){
        System.out.println("BMW----- start");
    }


}
