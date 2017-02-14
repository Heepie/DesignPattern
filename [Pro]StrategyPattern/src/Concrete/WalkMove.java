package Concrete;

import Frame.Move;

public class WalkMove implements Move {

        @Override
        public void move() {
                System.out.println("Walk Move!");
        }
}
