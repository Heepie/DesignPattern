package Concrete;

import ExpressMethod.printMorseCode;
import ExpressMethod.soundMorseCode;
import Frame.ExpressMorseCode;

public class Main {
        public static void main(String[] args) {
//                ExpressMorseCode MorseCodeHelper = new ExpressMorseCode(new printMorseCode());
                ExpressMorseCode MorseCodeHelper = new ExpressMorseCode(new soundMorseCode());
                MorseCodeHelper.h().e().e().p().i().e();
        }
}
