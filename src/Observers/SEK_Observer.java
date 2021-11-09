package Observers;

import Subjects.Subject;

public class SEK_Observer extends Observer{

    public SEK_Observer(Subject subject) {
        super(subject);
    }

    @Override
    public void update(){
        double SEK = Math.round((subject.getAmount_DKK() * 1.33314) * 100) / 100.0;
        System.out.println(subject.getAmount_DKK() + " DKK = " + SEK + " SEK");
    }
}
