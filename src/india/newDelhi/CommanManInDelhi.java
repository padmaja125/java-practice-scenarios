/** Assignment 13:
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
 – Access all the methods and observe the difference. **/
package india.newDelhi;
import tamilnadu.chennai.TrafficRulesChennai;

public class CommanManInDelhi implements TrafficRulesDelhi, TrafficRulesChennai {
    public static void main(String[] args) {
        CommanManInDelhi cmDelhi = new CommanManInDelhi();
        cmDelhi.dontGoByDieselVehicle();
        cmDelhi.goByBicycle();
        cmDelhi.goByDieselVehicle();
    }
    @Override
    public void dontGoByDieselVehicle() {
        System.out.println("Delhi man don't use diesel");
    }

    @Override
    public void goByDieselVehicle() {
        System.out.println("Delhi man uses chennai diesel vehicle");
    }

    @Override
    public void goByBicycle() {
        System.out.println("delhi man uses bicycle rarely");
    }
}
