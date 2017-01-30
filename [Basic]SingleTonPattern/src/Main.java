public class Main {
        public static void main(String[] args) {
                SystemSpeaker speaker1 = SystemSpeaker.getInstance();
                SystemSpeaker speaker2 = SystemSpeaker.getInstance();
                
                speaker1.setVolum(10);
                speaker2.setVolum(20);
                System.out.println(speaker2.getVolum());
                
                speaker1.setVolum(30);
                speaker2.setVolum(40);
                System.out.println(speaker1.getVolum());
                
                speaker1.setVolum(50);
                speaker2.setVolum(60);
                System.out.println(speaker1.getVolum());
        }
}
