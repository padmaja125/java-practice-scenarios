/** 2) Create an abstract class called ‘SouthIndia’
 – Make this class as sub class of ‘India’
 – Add below non abstract methods
 – void cultivate()
 – Print ‘Rice and Wheat cultivation’ inside this method
 – void livingStyle()
 – Print ‘Average development’ inside this method **/
public abstract class SouthIndia extends India{


    public SouthIndia(String primeMinister) {
        super(primeMinister);
    }

    void cultivate(){
        System.out.println("Rice and Wheat cultivation");
    }

    void livingStyle(){
        System.out.println("Average development");
    }

}
