package Concrete;

public class Main {

        public static void main(String[] args) throws CloneNotSupportedException {
                Manager manager = new Manager();
                manager.setShape(new Triangle(1, 10, 10, "blue"));
                manager.showInfo();
                Triangle t1 = (Triangle) manager.Clone();
                t1.showInfo();
                
                manager.setShape(new Circle(1, 10, 10, 20, "yellow"));
                manager.showInfo();
                Circle c1 = (Circle) manager.Clone();
                c1.showInfo();
        }
}
