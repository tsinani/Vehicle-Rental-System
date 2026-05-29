// Bike.java
    public class bike extends vehicle {
        private boolean hasCargoBox;
        public bike(String id, String brand, String model,
                    double rate, boolean hasCargoBox) {
            super(id, brand, model, rate);
            this.hasCargoBox = hasCargoBox;
        }
        @Override
        public String getType() {
            return "Bike";
        }
        //getter
    public boolean getHasCargoBox() {
        return hasCargoBox;
    }
    }

