public class Motorcycle {

    static final int wheelsCount = 2;
    int horsePower;
    String color;
    String type;
    Brand brand;

    public Motorcycle(int horsePower, String color, String type, Brand brand) {
        this.horsePower = horsePower;
        this.color = color;
        this.type = type;
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    static class Brand {
        String country;
        String brandName;

        public Brand(String country, String brandName) {
            this.country = country;
            this.brandName = brandName;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }
    }

}
