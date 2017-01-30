package Concrete;

import Frame.Creator;
import Frame.Item;

public class MPCreator extends Creator {

        @Override
        protected void getInfoFromDB() {
                System.out.println("get Info(color, weight, check vaild item .. etc) From DB");
        }

        @Override
        protected Item createItem() {
                System.out.println("Create MPPotion!");
                return new MPPotion();
        }

        @Override
        protected void putInfoIntoDB() {
                System.out.println("put Info(create time, identity number .. etc) Into DB");
        }

}
