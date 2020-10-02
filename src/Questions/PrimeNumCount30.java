package Questions;

/*
how many numbers are prime number  from 1 to 20?
 */

public class PrimeNumCount30 {

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


    public static void getPrimeNumber(int num){
        for (int i =2; i<=num; i++){       //num=20
            if(isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        getPrimeNumber(7); //get prime number up to 7: 2 3 5 7
        getPrimeNumber(20);
    }
}
