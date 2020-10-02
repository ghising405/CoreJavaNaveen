package JavaBasics;

public class ASuper20 {

    //creating constructor

    public ASuper20(){
        System.out.println("parent class constructor");

    }
/*enable this and it will print.
because the object created in child class will come and check if there is anything it will have to print.
so if it finds, it will print otherwise it will not.
 */

    //creating parameterized constructor
    public ASuper20(int i){
         System.out.println("parent class constructor with value of i " +i);
     }

     public ASuper20(int i, int j){
         System.out.println("parent class constructor with value of i " +i);
         System.out.println("parent class constructor with value of j " +j);
     }


}
