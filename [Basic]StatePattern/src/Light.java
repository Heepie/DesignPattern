public class Light {
        private LightState lightState;
        
        private LightState onState = new LightState() {

                @Override
                public void on() {
                        System.out.println("Nothing");
                }

                @Override
                public void off() {
                        System.out.println("Off Light");
                        lightState = offState;
                }
        };
        
        private LightState offState = new LightState() {

                @Override
                public void on() {
                        System.out.println("On Light");
                        lightState = onState;
                }

                @Override
                public void off() {
                        System.out.println("Nothing");
                }
        };
        
        public Light(){
                lightState = offState;
        }
        
        public void on() {
                lightState.on();
        }
        
        public void off() {
                lightState.off();
        }
   }

interface LightState {
        public void on();
        public void off();
}