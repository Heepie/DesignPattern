package ExpressMethod;

import Frame.MorseCode;

public class soundMorseCode implements MorseCode {

        @Override
        public void dot() {
                System.out.print("bi");
        }

        @Override
        public void dash() {
                System.out.print("bm~");
        }

        @Override
        public void space() {
                System.out.print(" ");
        }

}
