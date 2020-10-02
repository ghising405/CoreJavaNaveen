package Part1and2;

public class NestedIf {

    public static void main(String[] args) {

        //write a logic to find the highest number

        int a1 = 400;
        int b1 = 500;
        int c1 = 300;

        //nested if else

        if (a1>b1 & a1>c1){
            System.out.println("a1 is the greatest");
        }
        else if (b1>c1){
            System.out.println("b1 is the greatest");
        }
        else{
            System.out.println("c1 is the greatest");
        }
    }
}
