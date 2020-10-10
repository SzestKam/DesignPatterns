package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observersValue = new ArrayList<Observer>();
    private List<Observer> observersTime = new ArrayList<Observer>();
   private int state;
    private int time;

   public int getState() {
      return state;
   }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
        notifyAllObserversOfTime();
    }

    public void setState(int state) {
      this.state = state;
        notifyAllObserversOfValue();
   }

    public void attachToValue(Observer observer) {
        observersValue.add(observer);
   }

    public void attachToTime(Observer observer) {
        observersTime.add(observer);
    }

    void notifyAllObserversOfValue() {
        for (Observer observer : observersValue) {
         observer.update();
      }
    }

    void notifyAllObserversOfTime() {
        for (Observer observer : observersTime) {
            observer.update();
        }
    }
}