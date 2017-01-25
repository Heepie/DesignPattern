package concrete;
import Frame.AbsConnectionHelper;

public class DefaultConnectionHelper extends AbsConnectionHelper {

        @Override
        protected String doSecurity(String encodedInfo) {
                System.out.println("check security and decode encodedInfo");
                return null;
        }

        @Override
        protected boolean authentication(String id, String password) {
                System.out.println("authenticate user");
                return true;
        }

        @Override
        protected int authorization(String userName) {
                System.out.println("authorizate user");
                return 0;
        }

        @Override
        protected void connection() {
                System.out.println("connection");
        }
}
