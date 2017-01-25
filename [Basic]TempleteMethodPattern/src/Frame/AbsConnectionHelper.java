package Frame;
public abstract class AbsConnectionHelper {
        protected abstract String doSecurity(String encodedInfo);
        protected abstract boolean authentication(String id, String password);
        protected abstract int authorization(String userName);
        protected abstract void connection();
        
        public void requestConnection(String encodedInfo) {
                // step1. check security and decode encodedInfo
                String decodedInfo = doSecurity(encodedInfo);
                
                // step2. authenticate user
                // get id and password from decodedInfo
                String id = "id";
                String password = "password";
                if(!authentication(id, password)) 
                        throw new Error("incorrected id or password");
                
                // step3. authorizate user
                // get userName from decodedInfo
                String userName = "userName";
                int userType = authorization(userName);
                
                switch(userType) {
                case 0:
                        System.out.println("#userType: Manager");
                        break;
                case 1:
                        System.out.println("#userType: Free user");
                        break;
                case 2:
                        System.out.println("#userType: Paid user");
                        break;
                default:
                        System.out.println("#userType: etc..");
                        break;
                }
                
                // step4. connection
                connection();
        }
}
