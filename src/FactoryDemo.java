public abstract class FactoryDemo extends SmartPhone{
    abstract void verifyFingerPrint();
    abstract void providePattern();
    void browse(){
         System.out.println("Factory Demo browsing");
     }
     boolean isOriginalPiece = false;
    static int price = 0;

}
