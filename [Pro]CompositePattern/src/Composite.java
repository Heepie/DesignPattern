import java.util.ArrayList;

public class Composite extends StarcraftUnit {
        private ArrayList<StarcraftUnit> unitList = new ArrayList<>();
        private String name;

        public Composite(String name) {
                setName(name);
        }
        
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Composite add(StarcraftUnit unit) {
                unitList.add(unit);
                return this;
        }
        
        public void showUnitList() {
                for (StarcraftUnit s : unitList)
                        System.out.println((s.getClass()).getSimpleName());
        }

        @Override
        public void attack() {
                System.out.println(name + " Attack!");
        }

        @Override
        public void move() {
                System.out.println(name + " Move");
        }
}
