public class CoffeeMoca implements Beverage {
        private String name;
        private String description;
        private int cost;
        
        public CoffeeMoca(String name, int cost, String description) {
                this.name = name;
                this.cost = cost;
                this.description = description;
        }
        
        @Override
        public String getName() {
                return name;
        }

        @Override
        public String getDescription() {
                return description;
        }

        @Override
        public int getCost() {
                return cost;
        }
}
