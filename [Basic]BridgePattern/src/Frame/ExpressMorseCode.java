package Frame;
public class ExpressMorseCode {
        MorseCode morseCode;
        
        public ExpressMorseCode(MorseCode morseCode) {
                this.morseCode = morseCode;
        }
        
        // Suppose a(), b(), c(), d() ..... x(), y(), z()
        public ExpressMorseCode h() {
                morseCode.dot();
                morseCode.dot();
                morseCode.dot();
                morseCode.dot();
                morseCode.space();
                return this;
        }
        public ExpressMorseCode e() {
                morseCode.dot();
                morseCode.space();
                return this;
        }
        public ExpressMorseCode p() {
                morseCode.dot();
                morseCode.dash();
                morseCode.dash();
                morseCode.dot();
                morseCode.space();
                return this;
        }
        public ExpressMorseCode i() {
                morseCode.dot();
                morseCode.dot();
                morseCode.space();
                return this;
        }
}
