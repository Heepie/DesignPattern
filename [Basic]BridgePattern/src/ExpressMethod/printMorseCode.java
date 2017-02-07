package ExpressMethod;

import Frame.MorseCode;

public class printMorseCode implements MorseCode {

        @Override
        public void dot() {
                System.out.print(".");
        }

        @Override
        public void dash() {
                System.out.print("_");                
        }

        @Override
        public void space() {
                System.out.print(" ");                
        }
}
