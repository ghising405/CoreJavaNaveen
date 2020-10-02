package OOPStaticNoOverride34;

public class TestCar34 {

    public static void main(String[] args) {

        //can create object of BMW
        BMW34 b = new BMW34();
        b.start();  //overridden. override: use the method name but will have own implementation logic.
        b.stop();   //from parent. not overridden
        b.refuel(); //from parent. not overridden

    }
}
