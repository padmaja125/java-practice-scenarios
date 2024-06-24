/** Assignment 2: Add Methods in Calculator

 public class Calculator
 {

 public static void main(String[] args)
 {
 Calculator calc = new Calculator();
 calc.add();

 }
 public void add()
 {
 System.out.println(10+20);
 }

 }


 //subtract()

 //multiply()

 //divide()  **/
 public class Calculator {
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        calc.add();
        calc.subtract();
        calc.divide();
        calc.multiply();

    }
    public void add()
    {
        System.out.println(10+20);
    }
    public void subtract()
    {
        System.out.println(20 - 10);
    }
    public void multiply()
    {
        System.out.println(10 * 20);
    }
    public void divide()
    {
        System.out.println(20 / 2);
    }

}
