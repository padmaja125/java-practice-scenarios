/** Assignment - 0: static, non-static

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
 9. Go through and record your observations. **/

/** Assignment 4: instance method, local variable, arguments,return
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
 System.out.println("After booking ticket " + balance); **/


public class Theatre {
    String movieName;
    int movie_time;

    public Theatre(String movieName, int movie_time) {
        this.movieName = movieName;
        this.movie_time = movie_time;
    }

    public Theatre() {
    }

    public static void main(String[] args) {
        Theatre movie1 = new Theatre("jailer",630);
        Theatre movie2 = new Theatre("leo",7);
        movie1.watch_movie();
        movie2.watch_movie();
        // Assign-4
        Theatre Raja = new Theatre();
        int balance = Raja.bookTicket(200);
        System.out.println("After booking ticket " + balance);
    }

    public void watch_movie(){
        System.out.println("Watching " + movieName);
        System.out.println("Show Time is " +movie_time);
    }
    //assign -4
    public int bookTicket(int value){
        int ticket_price = 120;
        int balance = value - ticket_price;
        return balance;
    }
}
