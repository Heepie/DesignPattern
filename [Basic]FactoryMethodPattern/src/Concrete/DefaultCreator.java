package Concrete;

import Frame.Creator;
import Frame.Item;

public class DefaultCreator extends Creator {

        @Override
        protected void getInfoFromDB(String itemName) {
                // processing of info by using item name
                System.out.println("get Info(color, weight, check vaild item .. etc) From DB");
        }

        @Override
        protected Item createItem(String itemName) {
                // processing of info by using item name.
                switch (itemName) {
                case "HP":
                        return new HPPotion();
                case "MP":
                        return new MPPotion();
                default:
                        throw new Error("There is NOT vaild item :(");
                }
        }

        @Override
        protected void putInfoIntoDB(String itemName) {
                // processing of info by using item name
                System.out.println("put Info(create time, identity number .. etc) Into DB");   
        }

}
