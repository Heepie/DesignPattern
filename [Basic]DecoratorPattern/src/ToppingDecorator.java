import Frame.Cookie;

public abstract class ToppingDecorator implements Cookie {
        protected Cookie cookie;
        
        public ToppingDecorator(Cookie cookie) {
                this.cookie = cookie;
        }
        
        public abstract String getName();
}
