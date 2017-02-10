package Concrete;

import Frame.Observer;
import Frame.Publisher;

public class DailyObserver implements Observer {
        private Publisher publisher;
        private String news;
        
        public DailyObserver (Publisher publisher) {
                this.publisher = publisher;
                publisher.addObserver(this);
        }
        
        @Override
        public void update(String title, String content) {
                this.news = title + "\n------\n" + content;
                display();
        }
        
        private void display() {
                System.out.println("___ Daily News ___");
                System.out.println(news);
        }
}
