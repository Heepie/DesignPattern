package Concrete;

import Frame.Unit;

public class Marin extends Unit {
        public Marin() {
                attack = new GunAttack();
                move = new WalkMove();
        }
}
