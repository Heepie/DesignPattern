package concrete;
import Frame.Strategy;

public class Player {
        private String name;
        private Strategy strategy;

        public Player(String name, Strategy strategy) {
                this.name = name;
                this.strategy = strategy;
        }
        
        public void win() {
                System.out.println("Win");
        }
        
        public void lose() {
                System.out.println("lose");
        }
        
        public void even() {
                System.out.println("even");
        }
}
