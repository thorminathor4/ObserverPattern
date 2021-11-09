package Observers;

import Subjects.Subject;

public abstract class Observer {
    protected Subject subject;
    Observer(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }
    public abstract void update();
}
