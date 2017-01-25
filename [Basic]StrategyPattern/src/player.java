public class player {
        Weapon weapon;

        public void setWeapon(Weapon weapon) {
                this.weapon = weapon;
        }
        
        public void attack() {
                if (weapon == null) {
                        System.out.println("Standard Attack!");
                } else {
                        // Delegate
                        weapon.attack();
                }
        }
}
