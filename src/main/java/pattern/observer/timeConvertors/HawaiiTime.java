package pattern.observer.timeConvertors;

import pattern.observer.Observer;
import pattern.observer.Subject;

public class HawaiiTime extends Observer {

    public HawaiiTime(Subject subject) {
        this.subject = subject;
        this.subject.attachToTime(this);
    }

    public void update() {
        int hawaiiTime = subject.getTime() - 1200; // 1400
        System.out.println("Czas obecny w Hawaii: " + hawaiiTime);
    }
}