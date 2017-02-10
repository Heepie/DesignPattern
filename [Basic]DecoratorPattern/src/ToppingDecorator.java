import Frame.Cookie;

public abstract class AbsTopping implements Cookie {
        protected Cookie cookie;
        
        public AbsTopping(Cookie cookie) {
                this.cookie = cookie;
        }
        
        public abstract String getName();
}
