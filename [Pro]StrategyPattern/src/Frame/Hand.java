package Frame;
public class Hand {
        static final int HAND_ROCK = 0;
        static final int HAND_SCISSOR = 1;
        static final int HAND_PAPER = 2;
        
        private int choice;

        public Hand() {
                choice = 1;
        }
        
        public void setChoice(int choice) {
                this.choice = choice;
        }
        
        
}
