package com.heepie.memento;
public class Memento {
        private String status;
       
        // public -> protected 
        // cuzNot to access outside
        protected Memento(String status) {
                this.status = status;
        }

        public String getStatus() {
                return status;
        }
}
