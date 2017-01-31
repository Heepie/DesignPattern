/*SingleTonPattern
 * 
 * SingleTonPattern is the pattern to create only one instance.
 * The reason why create only one instance is to guarantee there is just only one instance.
 */

public class SystemSpeaker {
        private static SystemSpeaker instance;
        private static int volum;
        
        // to get the instance by accessing the class, NOT new 
        // if threads access getInstance method at the same time, there is the possibility to create many instances.  
        // So must set "synchronized" or create the instance on the top.
        public static synchronized SystemSpeaker getInstance() {
                if (instance == null) {
                        System.out.println("Create instance");
                        instance = new SystemSpeaker();
                } else {
                        System.out.println("Already exist instance");
                }
                return instance;
        }

        public int getVolum() {
                return volum;
        }

        public void setVolum(int volum) {
                SystemSpeaker.volum = volum;
        }
}
