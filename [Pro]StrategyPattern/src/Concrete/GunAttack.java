package Concrete;

import Frame.Attack;

public class GunAttack implements Attack {
        @Override
        public void attack() {
                System.out.println("Gun Attack!");
        }
}
