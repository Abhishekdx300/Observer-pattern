package concreteClasses;

import interfaces.IObservant;
import interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class television implements IObserver {

    // its own data storing method -- not part of pattern
    private int currentTemp = 27;
     public weatherStation ws;

     // dep. injection
    public television(weatherStation ws){
        this.ws = ws;
    }


    // updates its own data after getting signal from weatherStation
    @Override
    public void update() {
    this.currentTemp = ws.temperature;
    }

    // not part of pattern
    public void showOnScreen(){
        System.out.println("Television special report : The current temperature is "+currentTemp + " degree celsius at Agartala");
    }

}
