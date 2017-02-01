package Concrete;

import Frame.Shape;

public class Manager {
        Shape shape;

        public void setShape(Shape shape) {
                this.shape = shape;
        }
        
        public void showInfo() {
                shape.showInfo();
        }
        
        public Shape Clone() throws CloneNotSupportedException {
                return shape.createClone();
        }
}
