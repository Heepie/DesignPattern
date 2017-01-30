/*SingleTonPattern
 * 
 * SingleTonPattern is the pattern to create only one instance.
 * The reason why create only one instance is to guarantee there is just only one instance.
 */

public class SystemSpeaker {
        private static SystemSpeaker instance;
        private static int volum;
        
        public static SystemSpeaker getInstance() {
                if (instance == null) {
                        System.out.println("Create instance");
                        instance = new SystemSpeaker();
                } else {
                        System.out.println("Already exist instance");
                }
                return instance;
        }

        public static int getVolum() {
                return volum;
        }

        public static void setVolum(int volum) {
                SystemSpeaker.volum = volum;
        }
}
