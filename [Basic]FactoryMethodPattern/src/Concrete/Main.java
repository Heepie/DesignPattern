package Concrete;

import Frame.Creator;
import Frame.Item;

public class Main {

        public static void main(String[] args) {
/*
                Creator hpCreator = new HPCreator();
                Creator mpCreator = new MPCreator();
                
                hpCreator.Ctreate();
                System.out.println("");
                mpCreator.Ctreate();
*/ 
                Creator defaultCreator = new DefaultCreator();
                Item hp = defaultCreator.Ctreate("HP");
                hp.use();
                
                Item mp = defaultCreator.Ctreate("MP");
                mp.use();
        }
}
