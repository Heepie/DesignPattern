package concrete;

import Frame.AbsConnectionHelper;

public class Main {
        public static void main(String[] args) {
                AbsConnectionHelper connectionHelper = new DefaultConnectionHelper();
                
                connectionHelper.requestConnection("EncodedInfo");
        }
}
