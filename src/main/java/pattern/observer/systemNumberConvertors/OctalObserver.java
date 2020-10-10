package pattern.observer.systemNumberConvertors;

import pattern.observer.Observer;
import pattern.observer.Subject;

public class OctalObserver extends Observer {

   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attachToValue(this);
   }

   @Override
   public void update() {
     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
   }
}