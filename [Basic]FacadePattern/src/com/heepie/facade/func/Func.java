package com.heepie.facade.func;

public class Func {
        private FuncSystem01 funcSystem01;
        private FuncSystem02 funcSystem02;
        private FuncSystem03 funcSystem03;
        
        public Func() {
                funcSystem01 = new FuncSystem01();
                funcSystem02 = new FuncSystem02();
                funcSystem03 = new FuncSystem03();
        }
        
        public void process() {
                funcSystem01.process();
                funcSystem02.process();
                funcSystem03.process();
        }
}
