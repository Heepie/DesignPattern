package Concrete;

import Frame.Attack;

public class LazerAttack implements Attack {
        @Override
        public void attack() {
                System.out.println("Lazer Attack!");
        }
}
