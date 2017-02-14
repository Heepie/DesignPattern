package Concrete;

import Frame.Unit;

public class BattleCurier extends Unit {
        public BattleCurier() {
                attack = new LazerAttack();
                move = new FlyMove();        
        }
}
