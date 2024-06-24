/** Assignment 5: Method Calling, private

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
 Try to access private variable salary in Teacher class and note down the error message. **/
public class School {
    int mark;
    private int salary;
    static String school_name ="St. Antony's Primary School";
    void conduct_exams(){

    }
    void publish_results(int mark){
        System.out.println("mark is " + mark);
    }
}

