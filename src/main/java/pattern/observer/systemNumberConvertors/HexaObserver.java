package pattern.observer.systemNumberConvertors;

import pattern.observer.Observer;
import pattern.observer.Subject;

public class HexaObserver extends Observer {

   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attachToValue(this);
   }

   @Override
   public void update() {
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}