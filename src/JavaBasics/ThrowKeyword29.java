package JavaBasics;

/*
used when you've to throw an exception deliberately.
 */

public class ThrowKeyword29 {

    public static void main(String[] args) {
        System.out.println("ABC");


       try{
        throw new Exception("Naveen Exception");
       //In between you want to throw an exception. this will call constructor of exception class and we will add parameter
        //now you have to catch.
        }catch (Exception e){
           e.printStackTrace();
       }

        System.out.println("PQR");

       //getting file from excel file
        String Exec_Flag = " ";   //Exec_Flag = execution flag = variable = blank. one column is there and the execution flag value is blank
        if (Exec_Flag.equals(" ")){
            try{
                throw new Exception("Exec flag is blank exception");
            }catch (Exception e){
                e.printStackTrace();  //generating own exception
            }
        }
    }
}
