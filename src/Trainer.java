/** Assignment 9:
 Expected Understanding: Access Modifiers, Single Inheritance, getter methods, Constructor Overloading
 1) Create a Class named “Trainer”.
 – Have default instance variables String dept, institute
 – Assign values – “Java”, “Payilagam” to them
 – Have private instance variable int salary
 – Assign 10000 as value for salary.
 – Create getter method for salary.
 – Have instance method training() with void as return data type
 – Add a print statement inside training() method
 - Add main method [public static void main(String[] args)]
 – Have instance named as ‘trainerKumar’ and pass “CSE”, “payilagam” as arguments to it.
 – Handle above line with matching Constructor.

 2) Create a sub class “SQLTrainer” under “Trainer”.
 – Have main method in it.
 – Create instance ram for this class
 – Handle with proper super class constructor
 – Access parent class instance variables
 – Call parent class instance method training()
 – Access salary using getter method in parent class **/
public class Trainer {
    String dept = "Java";
    String institute = "Payilagam";
    private int salary = 10000;

    public Trainer() {

    }

    public int getSalary() {
        return salary;
    }

    public Trainer(String dept, String institute) {
        this.dept = dept;
        this.institute = institute;
    }

    void training(){
        System.out.println("instance method");
    }

    public static void main(String[] args) {
        Trainer trainerKumar = new Trainer("CSE", "payilagam");
    }
}
