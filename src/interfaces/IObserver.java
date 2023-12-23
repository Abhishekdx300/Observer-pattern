package interfaces;

public interface IObserver {

    // observer will only notify its observers, will not send the data,
    // so, observer should've instance of observant (dependency injection)
    // the update method will get the data from the observer
    // how the data is used in observer is not observant's concern.
    public void update();
}
