package behavioral.observer.impl;

import behavioral.observer.model.Observer;
import behavioral.observer.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null) throw  new NullPointerException("Null observer");
        synchronized (MUTEX){
            if (!observers.contains(observer)) {
                observers.add(observer);
            }
        }
    }

    @Override
    public void unregister(Observer observer) {
        synchronized (MUTEX){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed=false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        if(observers.contains(observer))
            return this.message;
        else
            return null;
    }

    public void postMessage(String message){
        System.out.println("Message Posted to Topic:" + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
