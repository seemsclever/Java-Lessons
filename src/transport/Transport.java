package transport;

public class Transport {
    public static class Brand{

        private String name;
        private String country;

        public Brand(String name, String country) {
            this.name = name;
            this.country = country;
        }

        public String toString(){
            return name + "(" + country + ")";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

    public class Owner{
        private String name;
        private String dateOfBirth;

        public Owner(String name, String dateOfBirth) {
            this.name = name;
            this.dateOfBirth = dateOfBirth;
        }

        public String toString(){
            return name + "(" + dateOfBirth + ")";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }

    protected Brand brand;
    protected String model;
    protected int yearOfProduction;
    protected String countryOfAssembly;
    protected String color;
    protected int maxSpeed;
    protected Owner owner;

    public Transport(Brand brand, String model, int yearOfProduction, String countryOfAssembly, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = Car.checkAndReturnValue(color, "Unknown");
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Car.checkAndReturnValue(maxSpeed, 0);
    }
}
