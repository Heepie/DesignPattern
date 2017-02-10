package Concrete;

public class Main {
        public static void main(String[] args) {
                NewsPublisher newsPublisher = new NewsPublisher();
                DailyObserver daily = new DailyObserver(newsPublisher);
                
                newsPublisher.setNews("Hello", "World");
        }
}
