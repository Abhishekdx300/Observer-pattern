package concreteClasses;

import interfaces.IObservant;
import interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class weatherStation implements IObservant {

    public int temperature=27; // its own data
    List<IObserver> ObserverList = new ArrayList<>();
    @Override
    public void add(IObserver obs) {
        ObserverList.add(obs);
    }

    @Override
    public void remove(IObserver obs) {
        ObserverList.remove(obs);
    }

    @Override
    public void notifyy() {
        for(IObserver obs : ObserverList){
            obs.update(); //
        }
    }

    // its own data updating method --> not part of pattern
    public void getTemperature(){
        Random rand = new Random();
        this.temperature = rand.nextInt(-12,29);
    }

}
