import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public abstract class NumberGenerator {
        Vector<Observer> v = new Vector<>();
        
        public void addObserver(Observer obs) {
                v.add(obs);
        }
        
        public void deleteObserver(Observer obs) {
                v.remove(obs);
        }
        
        public void notifyObservers() {
                java.util.Iterator<Observer> it = v.iterator();
                while(it.hasNext()) {
                        Observer o = it.next();
                        o.update();
                }
        }
}
