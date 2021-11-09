package Observers;

import Subjects.Subject;

public class GBP_Observer extends Observer{

    public GBP_Observer(Subject subject) {
        super(subject);
    }

    @Override
    public void update(){
        double GBP = Math.round((subject.getAmount_DKK() * 0.11464) * 100) / 100.0;
        System.out.println(subject.getAmount_DKK() + " DKK = " + GBP + " GBP");
    }
}