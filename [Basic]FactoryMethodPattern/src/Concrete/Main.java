package Concrete;

import Frame.Creator;

public class Main {

        public static void main(String[] args) {
                Creator hpCreator = new HPCreator();
                Creator mpCreator = new MPCreator();
                
                hpCreator.Ctreate();
                System.out.println("");
                mpCreator.Ctreate();
                
        }
}
