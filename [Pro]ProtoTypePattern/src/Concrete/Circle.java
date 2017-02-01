package Concrete;

import Frame.Shape;

public class Circle extends Shape {
        private int x, y, r;
        private String color;
        
        public Circle (int id, int x, int y, int r, String color) {
                super(id);
                this.x = x;
                this.y = y;
                this.r = r;
                this.color = color;
        }
        
        @Override
        public void showInfo() {
                System.out.println("Circle");
                super.showInfo();
                System.out.println(" x: " + x + " y: " + y + " r: " + r + " color: " + color);
        }
        
        @Override
        public Circle createClone() throws CloneNotSupportedException {
                Circle circle = (Circle) clone();
                super.setId(super.getId()+1);
                circle.x += 1;
                circle.y += 1;
                return circle;
        }
}
