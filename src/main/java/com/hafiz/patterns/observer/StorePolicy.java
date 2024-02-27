package com.hafiz.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/*
* Publisher class that send updates to subscriber on change
*
*/
public class StorePolicy {
    String policy;
    List<Observer> observers;

    public StorePolicy(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(policy);
        }
    }

    public void setPolicy(String policy){
        this.policy = policy;
        notifyObservers();
    }

    public String getPolicy(){
        return this.policy;
    }


}
