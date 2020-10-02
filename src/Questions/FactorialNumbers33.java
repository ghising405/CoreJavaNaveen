package Questions;
/*
factorial of 3 = 3*2*1 = 6
factorial of 4 = 4*3*2*1 = 24
factorial of 1 = 1
factorial of 0 = 1 *******************
factorial of 10 = 10*9*8*.............. 3*2*1 = ????
1. doing with non-recursive ---- using simple for loop

* check corner cases : 1st and last numbers
* have to provide all the test cases


 */

public class FactorialNumbers33 {

    public static int factorial(int num) {   //num=4

        int fact = 1;
//using non-recursive ------ using for loop
        if (num == 0) {
            return 1; //this says if you put num=0 then return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;  //1
            // i=1; 1<=4 =true; fact = 1*1 = 1; i=i+1=1+1=2
            // i=2; 2<=4 =true; fact = 1*2 = 2; i=i+1=2+1=3
            // i=3; 3<=4 =true; fact = 1*3 = 3; i=i+1=3+1=4
            // i=4; 4<=4 =true; fact= 1*4 =4; i=i+1=4+1=5
            // i=5; 5<=4= false; return fact: 1*2*3*4 = 24

        }
        return fact;
    }

        //2. with recursive function: a function is calling itself. it means inside the function body i am calling the same function
    public static int factor(int num){   //num=3

            if(num == 0)
                return 1;
            else
                return (num * factor(num-1)); //calling factor() here. function calling inside function
        //factor(num-1) = value of num
        //num=3; 3==0; false; goes to else 3 * (3-1=2)
        //num=2; 2==0; false; goes to else 2 * (2-1=1)
        //num=1; 1==0; false; goes to else 1 * (1-1=0)
        //num=0; 0==0; true ----> return 1
        // 3*2*1 = 6

    }




    public static void main(String[] args) {
        System.out.println( factorial(4)); //24
        System.out.println(factorial(1));
        System.out.println(factorial(0));

        //with recursive
        System.out.println(factor(3));
        System.out.println(factor(10));
        System.out.println(factor(1));
        System.out.println(factor(0));


    }


}
