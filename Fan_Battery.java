package logical_sat;

public class Fan_Battery
{
    public static void main(String[] args)
    {
        int batterycapasityInKW=5;
        int rpm=1500;
        int rps=rpm*60;
        int revolutionsPerhour=rps/2;
        int consumesPowerKWH=2;
        int expectedRPS=135000;
        int timeTakesForExpectedRevolutions=expectedRPS/revolutionsPerhour;
        int chargingPresentInBatteryAfter135000Revolutions=batterycapasityInKW-timeTakesForExpectedRevolutions;
        System.out.println("chariging present after 135000 revolutions :"+chargingPresentInBatteryAfter135000Revolutions+" KW");
       System.out.println("....................................................");
       double addedChargeInKW=0.5;
       double totalCharge=chargingPresentInBatteryAfter135000Revolutions+addedChargeInKW;
       double calculatedHoursToRunBattery=totalCharge/2;
       System.out.println("The fan run up to :"+calculatedHoursToRunBattery +" hours");

    }
}
