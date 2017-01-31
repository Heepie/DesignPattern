package Frame;

public abstract class Creator {
        public Item Ctreate(String itemName) {
                getInfoFromDB(itemName);
                Item item = createItem(itemName);
                putInfoIntoDB(itemName);
                
                return item;
        }
        
        protected abstract void getInfoFromDB (String itemName);
        
        protected abstract Item createItem(String itemName);
        
        protected abstract void putInfoIntoDB(String itemName);
        
        
        
}
