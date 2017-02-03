package Frame;

public abstract class AbsFactory {
        public abstract Body createBody();
        public abstract Wheel createWheel();
        
        public void assembleBicycle() {
                createBody();
                createWheel();
        }
}
