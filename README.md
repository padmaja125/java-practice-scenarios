Java-Practice-Scenarios---All 


Assignment - 0: static, non-static

1. Create a class Called Theatre.
2. Declare below global variables in it.
    2.1. String movieName
    2.2. int movie_time
3. Add main method
4. Inside main method, create two instances (objects),
    4.1 movie1
    4.2 movie2
5. For instance movie1, add 'Jailer' as movieName and 630 as movie_time
6. For instance movie2, add 'Leo' as movieName and 7 as movie_time
7. Create and define a method as below.
    public void watch_movie()
    {
    System.out.println("Watching " + movieName);
    System.out.println("Show Time is " +movie_time);
    }
8. Call above method using both the instances - movie1, movie2.
9. Go through and record your observations.


Assignment 1: return statement

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
10. Print Payment value. 

Assignment 2: Add Methods in Calculator

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

//divide()


Assignment 3: Instance Methods

1. Create a class Called Theatre.
2. Declare below global variables in it.
    2.1. String movieName
    2.2. int movie_time
3. Add main method
4. Inside main method, create two instances (objects),
    4.1 movie1
    4.2 movie2
5. For instance movie1, add 'Jailer' as movieName and 630 as movie_time
6. For instance movie2, add 'Leo' as movieName and 7 as movie_time
7. Create and define a method as below.
    public void watch_movie()
    {
    System.out.println("Watching " + movieName);
    System.out.println("Show Time is " +movie_time);
    }
8. Call above method using both the instances - movie1, movie2.
9. Go through and record your observations.


Assignment 4: instance method, local variable, arguments,return
1. Create a class called Theatre
2. Have main method in it.
3. Create an instance[object] called raja of Theatre class.
4. Call method bookTicket(200) eg. raja.bookTicket(100)
5. Have method signature for bookTicket method with necessary arguments for handling the input 200.
6. Define bookTicket method as below.
    1. Declare a local variable ticket_price in int datatype.
    2. Assign 120 as value for ticket_price variable.
    3. Subtract 120 from method argument (200)
    4. Store result of above line into another variable called balance of int datatype.
    5. return this balance to main method.
7. In main method, receive this balance as int balance
8. In main method, print as below.
System.out.println("After booking ticket " + balance);

Assignment 5: Method Calling, private

Goal:
Learning Method Calling, Accessing static, non-static variables from other classes, private modifier.

Steps:

    Create a class Called School.
    Have non-static variables as below.
    int mark;
    private int salary;
    Have static variable as below.
    static String school_name = "St. Antony's Primary School";
    Define non-static methods mentioned below
    void conduct_exams()
    - Have a print statement inside this method
    void publish_results(int mark)
    - Have a print statement inside this method to print mark
    Now, create another class called Teacher
    Create main method inside Teacher class
    Create an instance(object) for School class [Object name -> teacher]
    Using 'teacher' object, call conduct_exams() method
    Using 'teacher' object, call publish_results() method and pass 75 as argument here.
    Print school_name
    Try to access private variable salary in Teacher class and note down the error message.

Assignment 6:

GOAL: Learning private, default and public Access Modifiers, Creating Package and understanding its usage, Calling Methods with/without arguments.  

1. Check if you can create private class
2. Check if you can create private main method
3. Check if you can create Method local variable as private.  

Task:
1. Create a package called bank.chennai.
2. Create a public class called 'SBI'.
3. Have default non-static variables String empName, empId.
4. Have default static variable branch_name = 'chennai'
5. Create two default, non-static methods
get_loan(int amount), create_account() with void as return datatype.
6. Now, in the same package(bank.creditcard), create one more default class called Account_Holder.
7. Have main method in this class.
8. Try to access all static, non-static variables and non-static methods in SBI class.  
9.  Create another package called bank.madurai.
10. In this package, create default class called Account_Holder_Madurai.  
11. Have main method in this class.
12. Try to access all static, non-static variables and non-static methods in SBI class.
13. Note down the Errors and rectify those errors and make sure this class gives output without any error.

Assignment 7:
Goal: Learning Inheritance, super keyword and Method Overriding
Grandma:
1. Create a class called 'Grandma'.
2. Declare Field as below in it.
  1. String name = "Stella";
3. Have below methods in it.
  1. public void work()
4. Have print statements as you wish in the above methods' definition.

Mother:
1. Create a class called 'Mother' as Child class of Grandma. 
2. Declare Field as below in it.
  1. String name = "Arasi";
3. Have below method in it.
  1. public void work()
4. Have print statement to print 'name' and super.name in work() definition.  
5. Add 'super.work();' inside work() method.

Kid:
1. Create a class called 'Kid' as Sub class of Mother. 
2. Declare Field as below in it.
  1. String name = "Suman";
3. Define main method as 'public static void main(String[] args)
4. Inside main method, create an instance called 'kid' for Kid class.
5. Have below methods in it.
  1. public void work()
  2. public void study()
6. Have print statements as you wish in the above two methods' definition.
7. Call study() method from main method.
8. Inside study() method, call work() method.
9. Print name and super.name inside work() method.


Assignment - 8: Multilevel Inheritance, Abstraction

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
  - public void do_interview()

OOPs – Java – Practice Scenarios with detailed Explanations

Note: Add main method wherever necessary.

Each and every scenario presented here are for getting good understanding on OOP(Object Oriented Programming) through Java.

Assignment 9: 
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
– Access salary using getter method in parent class

Assignment 10: 
Expected Understanding: Interface, Class, static variables, dynamic binding
1) Create an interface called ‘Actor’
– Have variables boolean makeUpRequired
– Assign ‘true’ value for ‘makeUpRequired’
– Have variable String address.
– Assign value as “Chennai” to address.
– Have void methods act(), dance(), sing()

2) Create class named as ActorSivakumar with main method
– implement interface ‘Actor’ to this class.
– Give your own definitions for methods from interface
– Have static variable String address.
– Assign value to address as “Coimbatore”.
– Have instance method ‘speaking()’ with void return data type.
– Create instance for ActorSivakumar as below
ActorSivakumar as = new ActorSivakumar(65, “Audi Car”)
– Handle with proper Constructor
– Access all the methods from ActorSivakumar class
– Access variable address and print the value
– Create another instance of interface ‘Actor’ using dynamic binding approach
Actor ac = new Sivakumar();
– Handle with proper Constructor
– Access methods in ActorSivakumar class.
– Access variable address using ‘ac’ intance and print the value
– Observe and note down the difference between two instances

Assignment 11: 
Expected Understanding: Abstraction, Inheritance, return keyword, Method Arguments, Constructor
1) Create an abstract class named ‘SmartPhone’
– Add the below abstract methods
– int call(int seconds)
– void sendMessage()
– void receiveCall()
– Add non abstract method void browse()
– print ‘SmartPhone browsing’ inside browse() method definition
– Have constructor as below.
public SmartPhone()
{
System.out.println(“Smartphone under development”);
}
2) Create class called ‘FactoryDemo’ as abstract subclass of SmartPhone
– Add the below abstract methods
– void verifyFingerPrint()
– void providePattern()
– Add non abstract method void browse()
– print ‘Factory Demo browsing’ inside browse() method definition
– Add variable boolean isOriginalPiece and assign ‘false’ as value.
– Add static variable int price and set value as 0.
3) Create class called ‘Samsung’ with main method as sub class of FactoryDemo.
– Add unimplemented methods
– Add static variable int price and set value as 5000.
– Create instance for Samsung class called sam
– Access browse() method using sam instance.
– Access price variable using sam instance.
– Observe which method is called and note down.

Assignment 12: 
Expected Understanding: Abstraction, Inheritance, Dynamic Binding, Polymorphism (Overriding), Constructor Overloading
1) Create an abstract class called ‘India’
– Have below abstract methods
– void speakLanguage()
– void eat()
– void dress()
– Have static variable String capital = “New Delhi”
– Have below Constructor
public India(String primeMinister)
{
System.out.println(“our Prime Minister is” + primeMinister);
}
2) Create an abstract class called ‘SouthIndia’
– Make this class as sub class of ‘India’
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Wheat cultivation’ inside this method
– void livingStyle()
– Print ‘Average development’ inside this method
3) Create a class called ‘TamilNadu’ with main method as sub class of ‘South India’.
– Add unimplemented methods
– Provide your own definitions wherever necessary.
– Have static variable String capital = “Chennai”
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Sugar cane cultivation’ inside this method
– void livingStyle()
– Print ‘Above Average development’ inside this method
– Using class name “India” – access variable ‘capital’ and print the value
– Using class name “TamilNadu” – access variable ‘capital’ and print the value.
– Create instance for “SouthIndia” as below
SouthIndia si = new TamilNadu()
– Observe which methods and variables can be accessed using ‘si’ and note down.

Assignment 13: 
Expected Understanding: Interface, access modifiers, Method Overriding
1) Create a package called tamilnadu.chennai
2) Create an interface ‘TrafficRules’ under this package
3) Make sure this interface is public interface
– Add variable String trafficCommisssioner = “Kavin”;
– Add below methods
– void goByDieselVehicle();
– void goByBicycle();
4) Create class called ‘CommonManInChennai’ with main method in the same package tamilnadu.chennai
– Implement interface ‘TrafficRulesChennai’
– Create instance for this class and access all the methods
5) Now, create another package called ‘india.newDelhi’
6) Create an interface ‘TrafficRulesDelhi’ under this package
7) Make sure this interface is not public interface – it should be default interface
– Add variable String trafficCommisssioner = “Navin”;
– Add below methods
– void dontGoByDieselVehicle();
– void goByBicycle();
8) Create class called ‘CommonManInDelhi’ with main method in the same package india.newDelhi
– Implement interface ‘TrafficRulesDelhi’
– Create instance for this class and access all the methods
– Now, implement interface ‘TrafficRulesChennai’ also.
– Add unimplemented methods
– Access all the methods and observe the difference.


Followed https://github.com/muthu1809/Java-Practice-Scenarios---All.git
