import Frame.Cookie;

public class Main {
        /**
         * @param args
         */
        public static void main(String[] args) {
                Cookie standardCookie = new StandardCookie();
                System.out.println(standardCookie.getName());
                Cookie mt = new MilkTopping(standardCookie);
                System.out.println(mt.getName());
                
                Cookie ct = new ChocolateTopping(standardCookie);
                System.out.println(ct.getName());
                
                Cookie mt2 = new MilkTopping(mt);
                System.out.println(mt2.getName());
        }
}
