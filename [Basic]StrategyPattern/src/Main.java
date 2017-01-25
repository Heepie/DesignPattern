public class Main {
        /**
         * @param args
         */
        public static void main(String[] args) {
                player player1 = new player();

                player1.attack();
                
                player1.setWeapon(new ax());
                player1.attack();
                
                player1.setWeapon(new gun());
                player1.attack();
                
                player1.setWeapon(new knife());
                player1.attack();
        }
}
