/* SingleTonPattern
 * 
 * This is the ticket maker to make ticket number by using SingleTonPattern.
 */
public class TicketMaker {
        private static TicketMaker ticketMaker = new TicketMaker();
        private static int ticketNumber = 1000;
        
        private TicketMaker() {
                System.out.println("Create Instance");
        }
        
        // to get the instance by accessing the class, NOT new 
        public static TicketMaker getInstance() {
                return ticketMaker;
        }
        
        public int getNextTicketNumber() {
                return ticketNumber++;
        }
        
}
