package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRulesChennai {
    public static void main(String[] args) {
        CommonManInChennai cm = new CommonManInChennai();
        cm.goByBicycle();
        cm.goByDieselVehicle();
    }

    @Override
    public void goByDieselVehicle() {
        System.out.println("Common man in Chennai goes by bus");
    }

    @Override
    public void goByBicycle() {
        System.out.println("Chennai man uses bicycle for travel");
    }
}
