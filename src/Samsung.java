/** Assignment 11:
 Expected Understanding: Abstraction, Inheritance, return keyword, Method Arguments, Constructor
 1) Create an abstract class named ‘SmartPhone’
 – Add the below abstract methods
 – int call(int seconds)
 – void sendMessage()
 – void receiveCall()
 – Add non-abstract method void browse()
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
 – Add non-abstract method void browse()
 – print ‘Factory Demo browsing’ inside browse() method definition
 – Add variable boolean isOriginalPiece and assign ‘false’ as value.
 – Add static variable int price and set value as 0.
 3) Create class called ‘Samsung’ with main method as subclass of FactoryDemo.
 – Add unimplemented methods
 – Add static variable int price and set value as 5000.
 – Create instance for Samsung class called sam
 – Access browse() method using sam instance.
 – Access price variable using sam instance.
 – Observe which method is called and note down.
 output:
 Smartphone under development
 Factory Demo browsing
 5000
 **/
public class Samsung extends FactoryDemo{

    static int price = 5000;
    public static void main(String[] args) {
        Samsung sam = new Samsung();
        sam.browse();
        System.out.println(price);

    }
    @Override
    void verifyFingerPrint() {
        System.out.println("verify fingerprint");
    }

    @Override
    void providePattern() {
        System.out.println("provide pattern");
    }

    @Override
    int call(int seconds) {
        return 0;
    }

    @Override
    void sendMessage() {
        System.out.println("send message");
    }

    @Override
    void receiveCall() {
        System.out.println("receive call");
    }

}
