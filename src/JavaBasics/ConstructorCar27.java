package JavaBasics;

public class ConstructorCar27 {

//Blueprint: with this prototype/ blueprint we can create 1000s of objects. You can also add and update the features.
    //global variables declared
    String name;
    int price;
    String engine;
    String modelNumber; //added later

    //initializing global variables. this.global = local.The moment we initialize global variable it will be given to the object.
    public ConstructorCar27(String name, int price, String engine, String modelNumber){
        this.name = name;
        this.price = price;
        this.engine = engine;
        this.modelNumber = modelNumber; //changed property . added new property


    }

    public static void main(String[] args) {
        //we pass the value here.
        //calling constructor: here we don't have to do obj.methodName.... like we do while calling normal method.
        //passed new property modelNumber
        ConstructorCar27 obj = new ConstructorCar27("BMW", 10, "Automatic", "320D"); //assign values here.
        ConstructorCar27 obj1 = new ConstructorCar27("Audi", 20, "Automatic", "A8");
        ConstructorCar27 obj2 = new ConstructorCar27("Honda", 5, "Manual", "city");

        System.out.println(obj.name + " " + obj.price + " " + obj.engine + " " + obj.modelNumber);
        System.out.println(obj1.name + " " + obj1.price + " " + obj1.engine + " " + obj1.modelNumber);
        System.out.println(obj2.name + " " + obj2.price + " " + obj2.engine + " " + obj2.modelNumber);

        /*
        output
        BMW 10 Automatic 320D
        Audi 20 Automatic A8
        Honda 5 Manual city

         */

    }

}
