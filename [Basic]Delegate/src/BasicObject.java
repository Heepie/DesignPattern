public class BasicObject {
          BasicInterface basicInterface;
          
          public BasicObject() {
                    basicInterface = new BasicInterfaceImpl();
          }
          
          public void basic() {
                    // Delegate
                    basicInterface.basic();
                    
                    // Custermizing by myself
                    System.out.println("Custermizing");
          }
}
