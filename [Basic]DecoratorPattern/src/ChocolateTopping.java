import Frame.Cookie;

public class ChocolateTopping extends ToppingDecorator {
        public ChocolateTopping (Cookie cookie) {
                super(cookie);
        }
        
        @Override
        public String getName() {
                return "Chocolate " + cookie.getName();
        }
}
