package com.heepie.memento;
public class Originator {
        private String status;
               
        public void setStatus(String status) {
                this.status = status;
        }

        public Memento createMemento() {
                return new Memento(status);
        }
        
        public void restoreMemento(Memento mem) {
                
        }
        
        
}
