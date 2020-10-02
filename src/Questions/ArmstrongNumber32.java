package Questions;

/*
armstrong number: cube of every digit the number and their sum = same number
eg. 153 : 1*1*1 = 1; 5*5*5 = 125; 3*3*3=27; 1+125+27=153
407, 0, 1, 370, 371,

1. get the remainder
2. divide the number by 10
in every while loop iteration the num value will be decreased.
first time cube =0 and every time cube will be increased
start from the last digit
num%10 = gives the last digit of the number
 */

public class ArmstrongNumber32 {

    //153 : 1*1*1   5*5*5   3*3*3

    public static void isArmstrongNumber(int num){
        System.out.println("given number is: "+num);
        int cube = 0;
        int r; //remainder
        int t; //temporary

        t=num;

        while (num>0){
            r = num%10; //remainder. num%10 gives the last digit of the number
            num = num/10;  //decreases the value of num
            cube = cube +(r*r*r);
        }

        if(t==cube){
            System.out.println("this is armstrong number");
        }else {
            System.out.println("this is not an armstrong number ");
        }
    }

    public static void main(String[] args) {

        isArmstrongNumber(153);
        isArmstrongNumber(371);
        isArmstrongNumber(370);
        isArmstrongNumber(0);
        isArmstrongNumber(1);
        isArmstrongNumber(455);

    }
}
