package SingletonDesign;

/*
In OOP (object oriented programming) language, singleton is a class that can have only one object (or instance= object of the class) at a time.
How to design singleton class?
1. make sure constructor of that class as private.
2. write a public static method that has return type object of this singleton class = it is also called lazy initialization.
 */

public class Singleton22 {

    private static Singleton22 singleton22_instance = null; //pointing to null
    public String str;

    //1. creating private constructor
    private Singleton22() {
        str = "Hey- I am using singleton class pattern";
    }

    //2. public static class that has return type = Singleton or SingletonDesign22
    //declared getInstance method. return = object of SingletonDesign22
   public static Singleton22 getInstance(){
        if(singleton22_instance == null){
            singleton22_instance = new Singleton22();
            return singleton22_instance;
        }
       return null;  //this is not done in Naveen's************************************
   }


    public static void main(String[] args) {
        //calling by class name
       Singleton22 x = Singleton22.getInstance();
       Singleton22 y = Singleton22.getInstance();
       Singleton22 z = Singleton22.getInstance();

        x.str =(x.str).toUpperCase(); //can access because x is singleton class variable. x.str = will return string. Converting x.str to uppercase. now stored in x.str. uppercase = all capital letter

        System.out.println(x.str); //HEY- I AM USING SINGLETON CLASS PATTERN
        //trying to access same thing with y
       // System.out.println(y.str); //but i am getting Exception in thread "main" java.lang.NullPointerException
       // System.out.println(z.str); //but i am getting Exception in thread "main" java.lang.NullPointerException
        //actual output:
        //HEY- I AM USING SINGLETON CLASS PATTERN
        //HEY- I AM USING SINGLETON CLASS PATTERN
        //HEY- I AM USING SINGLETON CLASS PATTERN

        //converting into lowercase
        z.str = (z.str).toLowerCase();
        System.out.println(z.str); //my return = Exception in thread "main" java.lang.NullPointerException

    }
}

