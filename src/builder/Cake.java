package builder;

public class Cake {

    private final double sugar;
    private final double butter;
    private final int eggs;
    private final double milk;
    private final int cocoa;
    private final int vanilla;

    public static class Builder {

        private double sugar;
        private double butter;
        private int eggs;
        private double milk;
        private int cocoa;
        private int vanilla;


        public Builder sugar(double cups) {
            this.sugar = cups;
            return this;
        }

        public Builder butter(double cups) {
            this.butter = cups;
            return this;
        }

        public Builder eggs(int spoons) {
            this.eggs = spoons;
            return this;
        }

        public Builder milk(double cups) {
            this.milk = cups;
            return this;
        }

        public Builder cocoa(int spoons) {
            this.cocoa = spoons;
            return this;
        }

        public Builder vanilla(int spoons) {
            this.vanilla = spoons;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }

    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.milk = builder.milk;
        this.cocoa = builder.cocoa;
        this.vanilla = builder.vanilla;
    }


}
