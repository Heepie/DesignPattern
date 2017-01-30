package Frame;

public abstract class Creator {
        public Item Ctreate() {
                getInfoFromDB();
                Item item = createItem();
                putInfoIntoDB();
                
                return item;
        }
        
        protected abstract void getInfoFromDB ();
        
        protected abstract Item createItem();
        
        protected abstract void putInfoIntoDB();
        
        
        
}
