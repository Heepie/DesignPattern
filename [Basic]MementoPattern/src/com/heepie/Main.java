package com.heepie;
import java.util.Stack;

import com.heepie.memento.Memento;
import com.heepie.memento.Originator;

public class Main {
        public static void main(String[] args) {
                Stack<Memento> stack = new Stack<>();
                
                Originator originator = new Originator();
                
                originator.setStatus("status 1");
                stack.push(originator.createMemento());                

                originator.setStatus("status 2");
                stack.push(originator.createMemento());
                
//                It's possible to access Memento by a outsider
//                Memento mem = new Memento("Memento made by hacker");
//                stack.push(mem);
                
                originator.setStatus("status 3");
                stack.push(originator.createMemento());
                
                for(Memento m:stack) {
                        System.out.println(m.getStatus());
                }
        }
}
