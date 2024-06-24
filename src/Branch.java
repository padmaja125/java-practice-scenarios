/** Assignment - 8: Multilevel Inheritance, Abstraction

 GOAL: Understanding Multilevel Inheritance, Abstraction

 1. Create an abstract class called HeadOffice.
 2. Have below normal methods in it.
 2.1. public void check_accounts(int amount)
 - Have a print statement inside here
 2.2. public int pay_tax(int amount)
 - return this.amount from here
 3. Have an abstract method as below.
 3.1. public abstract void receive_Customers()
 4. Create another abstract class called Branch_Plan as sub class of HeadOffice
 5. Have main method in it.
 6. Add a print statement inside main method.
 8. Add below method
 - public void do_interview()
 - Have a print statement inside here.
 7. Create another class 'Branch' as sub class of Branch_Plan
 8. Handle abstract methods here with print statements.
 9. Create an instance called 'branch' for Branch class.
 10. Confirm the below methods can be called.
 - public void check_accounts(1000)
 - public int pay_tax(2000)
 - Check if value is returned.
 - public void do_interview() **/
public class Branch extends Branch_Plan {
    @Override
    public void receive_Customers() {
        System.out.println("customer name");
    }

    public static void main(String[] args) {
        Branch branch = new Branch();
        int tax = branch.pay_tax(2000);
        System.out.println("tax "+ tax);
        branch.check_accounts(1000);
        branch.do_interview();
    }
}
