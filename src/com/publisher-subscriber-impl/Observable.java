package com.test;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void setNumbers(int n1, int n2){
        for(Observer i : observers) {
            i.notify(n1,n2);
        }
    }

    public void register(Observer observer) {
        observers.add(observer);
    }
}
