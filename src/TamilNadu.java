/** 3) Create a class called ‘TamilNadu’ with main method as sub class of ‘South India’.
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
 – Observe which methods and variables can be accessed using ‘si’ and note down. **/
public class TamilNadu extends SouthIndia {
    static String capital = "Chennai";

    public TamilNadu(String primeMinister) {
        super(primeMinister);
    }

    public static void main(String[] args) {
        System.out.println(India.capital);
        System.out.println(TamilNadu.capital); //Non-static field 'capital' cannot be referenced from a static context
        SouthIndia si = new TamilNadu("Narendra Modi");
        si.cultivate();
        si.dress();
        si.eat();
        si.livingStyle();
        si.speakLanguage();
    }

    @Override
    void speakLanguage() {
        System.out.println("speaking lang is Tamil");
    }

    @Override
    void eat() {
        System.out.println("idly and Sambar food");
    }

    @Override
    void dress() {
        System.out.println("saree and dhooti ");
    }

    @Override
    void cultivate() {
        System.out.println("Rice and sugar cane cultivation");
    }

    @Override
    void livingStyle() {
        System.out.println("Above average development");
    }
}
