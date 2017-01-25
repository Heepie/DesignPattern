public class Main {
          /**
           * @param args
           */
          public static void main(String[] args) {
                    Adapter adapter = new AdapterImpl();
                    System.out.println(adapter.multi(100f));
                    System.out.println(adapter.dev(100f));
          }
}
