package design.pattern.creational.builder;

/**
 * @author Pramit Karmakar
 * @Date 16/Nov/2023
 */
public class Sandwich {

    private Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.veggies = builder.veggies;
        this.spread = builder.spread;
        this.meat = builder.meat;
    }

    private String bread;
    private String veggies;
    private String spread;
    private String meat;

    public String getBread() {
        return bread;
    }

    public String getVeggies() {
        return veggies;
    }

    public String getSpread() {
        return spread;
    }

    public String getMeat() {
        return meat;
    }

    public static class Builder {

        private String bread;
        private String veggies;
        private String spread;
        private String meat;

        public Builder() {}

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }
        public Builder veggies(String veggies){
            this.veggies = veggies;
            return this;
        }
        public Builder spread(String spread){
            this.spread = spread;
            return this;
        }
        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Bread:").append(this.bread == null ? "NA": this.bread).append(" ")
                .append("Veggis:").append(this.veggies == null ? "NA": this.veggies).append(" ")
                .append("Spread:").append(this.spread == null ? "NA": this.spread).append(" ")
                .append("Meat:").append(this.meat == null ? "NA": this.meat).toString();
    }
}
