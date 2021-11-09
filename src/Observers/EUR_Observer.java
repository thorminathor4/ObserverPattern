package Observers;

import Subjects.Subject;

public class EUR_Observer extends Observer {

    public EUR_Observer(Subject subject) {
        super(subject);
    }

    @Override
    public void update(){
        double EUR = Math.round((subject.getAmount_DKK() * 0.13444) * 100) / 100.0;
        System.out.println(subject.getAmount_DKK() + " DKK = " + EUR + " EUR");
    }
}