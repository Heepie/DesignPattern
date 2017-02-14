package Frame;

public abstract class Unit {
        protected Attack attack;
        protected Move move;

        public void attack() {
                attack.attack();
        }
        
        public void move() {
                move.move();
        }
        
        public void setAttack(Attack attack) {
                this.attack = attack;
        }
        public void setMove(Move move) {
                this.move = move;
        }
}
