package interfaces;

public interface IObservant {
    // add
    public void add(IObserver obs);
    // remove
    public void remove(IObserver obs);
    // notify
    public void notifyy();

    // its own methods -- not part of pattern
}
