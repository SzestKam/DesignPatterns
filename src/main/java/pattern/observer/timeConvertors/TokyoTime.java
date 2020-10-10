package pattern.observer.timeConvertors;

import pattern.observer.Observer;
import pattern.observer.Subject;

public class TokyoTime extends Observer {

    public TokyoTime(Subject subject) {
        this.subject = subject;
        this.subject.attachToTime(this);
    }

    public void update() {
        int tokyoTime = subject.getTime() + 800; // 1400
        System.out.println("Czas obecny w Tokyo: " + tokyoTime);
    }
}


