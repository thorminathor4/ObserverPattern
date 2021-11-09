package Subjects;

import Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject{

    private double amount_DKK;
    private List<Observer> observers = new ArrayList<>();
    private String country = "Denmark";

    public double getAmount_DKK() {
        return amount_DKK;
    }

    public void setAmount_DKK(double amount_DKK) {
        this.amount_DKK = amount_DKK;
        notifyAllObservers();
    }

    public String getCountry(){
        return "Country that uses DKK: " + country;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
