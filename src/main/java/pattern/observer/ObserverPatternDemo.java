package pattern.observer;

import pattern.observer.systemNumberConvertors.BinaryObserver;
import pattern.observer.systemNumberConvertors.HexaObserver;
import pattern.observer.systemNumberConvertors.OctalObserver;
import pattern.observer.timeConvertors.HawaiiTime;
import pattern.observer.timeConvertors.NewYorkTime;
import pattern.observer.timeConvertors.TokyoTime;

public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
       System.out.println();

       System.out.println("Second state change: 10");
      subject.setState(10);
       System.out.println();

       new TokyoTime(subject);
       new HawaiiTime(subject);
       new NewYorkTime(subject);

       System.out.println("Local time 20:00");
       subject.setTime(2000);
       System.out.println();

       System.out.println("Local time 13:00");
       subject.setTime(1300);
       System.out.println();

   }
}