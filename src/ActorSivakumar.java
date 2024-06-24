/** Assignment 10:
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
 – Observe and note down the difference between two instances **/
public class ActorSivakumar implements Actor{
    static String address = "Coimbatore";

    public ActorSivakumar() {
        System.out.println("default constructor");
    }

    public static void main(String[] args) {
        System.out.println("*** actor to actorsivakumar ***");
        ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
        as.act();
        as.dance();
        as.sing();
        as.speaking();
        System.out.println("Sivakumar Address is " + address);
        System.out.println("*** actorsivakumar to actor ***");
        Actor ac = new ActorSivakumar();
        ac.act();
        ac.dance();
        ac.sing();
        // ac.spraking() Cannot resolve method 'speaking' in 'Actor'
        ((ActorSivakumar) ac).speaking();
    }

    public ActorSivakumar(int age, String car) {
        System.out.println(age + "of man having " +car);
    }

    void speaking(){
        System.out.println("speaking");
    }
    @Override
    public void act() {
        System.out.println("act");
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }

    @Override
    public void sing() {
        System.out.println("Sing");
    }
}
