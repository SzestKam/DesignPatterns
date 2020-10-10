package pattern.observer.timeConvertors;

import pattern.observer.Observer;
import pattern.observer.Subject;

public class NewYorkTime extends Observer {

    public NewYorkTime(Subject subject) {
        this.subject = subject;
        this.subject.attachToTime(this);
    }

    public void update() {
        int newYorkTime = subject.getTime() - 600; // 1400
        System.out.println("Czas obecny w New York: " + newYorkTime);
    }
}

