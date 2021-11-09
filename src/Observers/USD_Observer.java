package Observers;

import Subjects.Subject;

public class USD_Observer extends Observer{

    public USD_Observer(Subject subject){
        super(subject);
    }

    @Override
    public void update(){
        double USD = Math.round((subject.getAmount_DKK() * 0.15592) * 100) / 100.0;
        System.out.println(subject.getAmount_DKK() + " DKK = " + USD + " USD");
    }

}

