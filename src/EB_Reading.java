/** Assignment 1: return statement

 1. Create a class called EB_Reading
 2. Have main method in it.
 3. Create an object called assessor.
 4. Using assessor instance, call a method named 'reading'.
 5. 'reading' method should return consumed units in int.
 6. Store the returned value as 'consumed_units'.
 7. Using the same 'assessor' instance, call a method
 named as 'calculate'.
 8. Pass 'consumed_units' as argument to calculate.
 9. Based on the consumed_units value, find out How much Customer should pay.
 10. Print Payment value.  **/
public class EB_Reading {
    public static void main(String[] args) {
        EB_Reading assessor = new EB_Reading();
        int consumed = assessor.reading();
        int payment = assessor.calculate(consumed);
        System.out.println(payment);
    }

    public int reading(){
        return 1;
    }

    public int calculate(int value){
        return value * 40;
    }
}
