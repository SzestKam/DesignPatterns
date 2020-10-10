package pattern.observer.systemNumberConvertors;

import pattern.observer.Observer;
import pattern.observer.Subject;

public class BinaryObserver extends Observer {

   public BinaryObserver(Subject subject){
      this.subject = subject;
       this.subject.attachToValue(this);
   }

   @Override
   public void update() {
      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
   }
}