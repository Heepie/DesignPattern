import Frame.Cookie;

public class ChocolateTopping extends AbsTopping {
        public ChocolateTopping (Cookie cookie) {
                super(cookie);
        }
        
        @Override
        public String getName() {
                return "Chocolate " + cookie.getName();
        }
}
