package EncapsulationConcept;

/*
encapsulation = data hiding = data binding the data members
data members = variables, methods
outside user can access the variables using getter and setter but not the implementation logic inside the method.
Advantage= security
 */



public class EmployeeData {

    //1.declaring private variables/ private data variables.: so that these variables cannot be accessed directly from outside the class.
    private int ssn;
    private String empName;
    private int empAge;


    //2.define getter and setter method. It will be public in nature so that everyone can access it.
    //to set and get the values of the fields (variable)/ private variables.
    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;    //this.global ssn = local ssn
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public static void main(String[] args) {

        //3. creating object to access setter getter method
        EmployeeData emp = new EmployeeData();
        //setting the value of variables.
        emp.setEmpName("Tom Peter");
        emp.setEmpAge(25);
        emp.setSsn(123456);

        //to get the values
        System.out.println("Employee name is: " + emp.getEmpName());
        System.out.println("Employee age is: " + emp.getEmpAge());
        System.out.println("Employee ssn  is: " + emp.getSsn());


    }
}
