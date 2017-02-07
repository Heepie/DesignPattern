import Frame.Cookie;

public class MilkTopping extends AbsTopping {
        public MilkTopping (Cookie cookie) {
                super(cookie);
        }
        
        @Override
        public String getName() {
                return "Milk " + cookie.getName();
        }

}
