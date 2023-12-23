package concreteClasses;

import interfaces.IObserver;

public class weatherWebsite implements IObserver {
    private int currentTemp = 27;
    public weatherStation ws;

    public weatherWebsite(weatherStation ws) {
        this.ws = ws;
    }

    @Override
    public void update() {
        this.currentTemp = ws.temperature;
    }

    // not part of pattern
    public void dailyTempPost(){
        System.out.println("<h1> According to latest news, the temperature of Agartala is "+currentTemp + " degree celsius today. </h1>");
    }
}
