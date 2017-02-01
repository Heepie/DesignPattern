package Concrete;

import Frame.Shape;

public class Triangle extends Shape {
        private int x, h;
        private String color;
        
        public Triangle (int id, int x, int h, String color) {
                super(id);
                this.x = x;
                this.h = h;
                this.color = color;
        }
        
        @Override
        public void showInfo() {
                System.out.println("Triangle");
                super.showInfo();
                System.out.println(" x: " + x + " h: " + h + " color: " + color);
        }
        
        @Override
        public Triangle createClone() throws CloneNotSupportedException {
                Triangle triangle = (Triangle) clone();
                super.setId(super.getId()+1);
                triangle.x += 1;
                return triangle;
        }
}
