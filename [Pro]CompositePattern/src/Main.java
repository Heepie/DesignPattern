public class Main {
        public static void main(String[] args) {
                StarcraftUnit
                marin1 = new marin(),
                marin2 = new marin(),
                marin3 = new marin(),
                medic1 = new medic(),
                medic2 = new medic(),
                medic3 = new medic(),
                bettlecruiser1 = new bettlecruiser();
                
                Composite
                corps1 = new Composite("corps1"),
                corps2 = new Composite("corps2");
                
                corps1.add(marin1)
                          .add(marin2)
                          .add(medic1)
                          .add(bettlecruiser1);
                
                corps1.showUnitList();
                corps1.move();
                corps1.attack();
                
                corps2.add(marin3)
                          .add(medic2)
                          .add(medic3);
                
                corps2.showUnitList();
                corps2.move();
                corps2.attack();
                        
                
                
        }
}
