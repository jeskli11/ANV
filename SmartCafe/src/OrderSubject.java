import java.util.ArrayList;

public class OrderSubject {
    private ArrayList<Observer> observers =  new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyAll(String msg){
        for(Observer observer : observers){
            observer.update(msg);
        }
    }
}
