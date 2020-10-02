package Questions;
/*
prime numbers : numbers that can be divided by itself only
2 is the lowest prime number.

 */

public class PrimeNumber30 {

    //generic function where we can pass number. this number should return boolean value
    public static boolean isPrimeNumber(int num){
        //edge/ corner cases: check
        if(num<=1){
            return false;
        }
        for (int i = 2; i<num; i++) {     //num=> less or equal to 1
            if (num % i == 0) {            //if the remainder = 0; then that's not a prime number
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("2 is prime number: " + isPrimeNumber(2));
        System.out.println("3 is prime number: " + isPrimeNumber(3));
        System.out.println("10 is prime number: "+ isPrimeNumber(10));
        System.out.println("0 is prime number: "+ isPrimeNumber(0));
        System.out.println("-2 is prime number: "+ isPrimeNumber(-2)); //negative numbers cannot be prime number

    }
}
