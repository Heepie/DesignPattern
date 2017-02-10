package Concrete;

import java.util.ArrayList;

import Frame.Observer;
import Frame.Publisher;

public class NewsPublisher implements Publisher {
        private ArrayList<Observer> list = new ArrayList();
        private String title, content;
        
        @Override
        public void addObserver(Observer obs) {
                list.add(obs);
        }

        @Override
        public void removeObserver(Observer obs) {
                list.remove(obs);
        }

        @Override
        public void notifyObserver() {
                for (Observer o:list) 
                        o.update(title, content);
        }
        
        public void setNews (String title, String content) {
                this.title = title;
                this.content = content;
                notifyObserver();
        }
        
        

}
