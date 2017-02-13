import java.util.Stack;

public class Main {
        public static void main(String[] args) {
                Stack<Memento> stack = new Stack<>();
                
                Originator originator = new Originator();
                
                stack.push(originator.createMemento("status 1"));
                
                stack.push(originator.createMemento("status 2"));
                
                stack.push(originator.createMemento("status 3"));
                
                for(Memento m:stack) {
                        System.out.println(m.getStatus());
                }
        }
}
