package entrypoint;

import adaptee.legacy_api.MeatType;
import adapter.MeatDetails;
import tgt.Meat;

public class Program {
    public static void main(String[] args) {
        //Non-adapted usage
        System.out.println("Unknown meat:");
        var unknownMeat = new Meat(MeatType.BEEF);
        unknownMeat.loadData();

        //Adapted usage
        System.out.println("Beef:");
        var beefDetails = new MeatDetails(MeatType.BEEF);
        beefDetails.loadData();
        System.out.println("Pork:");
        var porkDetails = new MeatDetails(MeatType.PORK);
        porkDetails.loadData();
        System.out.println("Chicken:");
        var chickenDetails = new MeatDetails(MeatType.CHICKEN);
        chickenDetails.loadData();
        System.out.println("Turkey:");
        var turkeyDetails = new MeatDetails(MeatType.TURKEY);
        turkeyDetails.loadData();
        System.out.println("Veal:");
        var vealDetails = new MeatDetails(MeatType.VEAL);
        vealDetails.loadData();
    }
}
