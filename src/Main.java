
import concreteClasses.*;


public class Main {
    public static void main(String[] args) {


        // observant
        weatherStation agartalaWS = new weatherStation();

        // initializing observers with observant instance injection
        television mytv = new television(agartalaWS);
        weatherWebsite site = new weatherWebsite(agartalaWS);

        // adding observers
        agartalaWS.add(mytv);
        agartalaWS.add(site);

        // updating the observant data
        agartalaWS.getTemperature();

        // notifying all the observers of the data update --> only notifying, not sending data,
        // observer gets data from its own update() method and observant instance.
        // can be called inside .getTemperature() if wanted to --> would've directly notified
        agartalaWS.notifyy();

        // not part of observer/patterns' concern.
        mytv.showOnScreen();
        site.dailyTempPost();



    }
}