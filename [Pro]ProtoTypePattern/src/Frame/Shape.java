package Frame;

public abstract class Shape implements Cloneable {
        private int id;
        
        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public Shape(int id) {
                this.id = id;
        }
        
        public void showInfo() {
                System.out.print("id: " + id);
        }
        public abstract Shape createClone() throws CloneNotSupportedException;
}
