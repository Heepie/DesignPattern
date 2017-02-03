package Frame;

public abstract class AbsFactory {
        public abstract void createBody(Body body);
        public abstract void createWheel(Wheel wheel);
        
        public void assembleBicycle() {
                createBody()
                createWheel
        }
}
