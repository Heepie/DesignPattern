package concrete;
import Frame.Hand;
import Frame.Strategy;

public class ProbStrategy implements Strategy {

        @Override
        public Hand nextHand() {
                int idxHand = study();
                
                return null;
        }

        @Override
        public int study() {
                return 0;
                // TODO Auto-generated method stub

        }


}
