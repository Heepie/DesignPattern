import Concrete.BattleCurier;
import Concrete.GunAttack;
import Concrete.LazerAttack;
import Concrete.Marin;
import Frame.Unit;

public class Main {
        /**
         * @param args
         */
        public static void main(String[] args) {
                Unit marin = new Marin();
                Unit battleCurier = new BattleCurier(); 
                
                marin.attack();
                marin.move();
                
                battleCurier.attack();
                battleCurier.move();
                
                // to change attack method in runtime
                marin.setAttack(new LazerAttack());
                marin.attack();
                
        }
}
