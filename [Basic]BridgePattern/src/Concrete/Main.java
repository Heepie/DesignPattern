package Concrete;

import ExpressMethod.printMorseCode;
import Frame.ExpressMorseCode;

public class Main {
        public static void main(String[] args) {
                ExpressMorseCode MorseCodeHelper = new ExpressMorseCode(new printMorseCode());
                MorseCodeHelper.h().e().e().p().i().e();
        }
}
