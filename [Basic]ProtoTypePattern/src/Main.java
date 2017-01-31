public class Main {
        public static void main(String[] args) throws CloneNotSupportedException {
                circle c1 = new circle(1, 1, 8);
                circle c2 = c1.copy();
                
                System.out.println(c1.getX() + ", "
                                        + c1.getY() + ", "
                                        + c1.getR());
                
                System.out.println(c2.getX() + ", "
                                        + c2.getY() + ", "
                                        + c2.getR());
        }
}
