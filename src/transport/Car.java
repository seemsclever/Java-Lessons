package transport;

public class Car {
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

    private final Brand brand;
    private final String model;
    private float engineDisplacement;
    private String color;
    private final int yearOfProduction;
    private final String countryOfAssembly;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int amountOfSeats;
    private boolean isSummerTires;
    private Owner owner;

    public Car(Brand brand, String model, float engineDisplacement, String color, int yearOfProduction, String countryOfAssembly, String transmission, String bodyType, String registrationNumber, int amountOfSeats, boolean isSummerTires) {
        this.brand = brand;
        this.model = model;
        setEngineDisplacement(engineDisplacement);
        setColor(color);
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
        setTransmission(transmission);
        this.bodyType = bodyType;
        setRegistrationNumber(registrationNumber);
        this.amountOfSeats = amountOfSeats;
        setIsSummerTires(isSummerTires);
    }

    public String toString() {
        return "Марка - " + this.brand + "; Модель - " + this.model + "; Объем двигателя - " + this.engineDisplacement + "; Цвет - " + this.color + "; Год производства - "
                + this.yearOfProduction + "; Страна сборки - " + this.countryOfAssembly + "; Коробка передач - " + this.transmission + "; Тип кузова - " + this.bodyType
                + "; Регистрационный номер - " + this.registrationNumber + "; Количество мест - " + this.amountOfSeats + "; Летние ли шины - " + this.isSummerTires + "; Владелец - " + owner;
    }

    public String checkAndSetValue(String value, String defaultValue) {
        if (value != null && !value.isEmpty()) {
            return value;
        } else {
            return defaultValue;
        }
    }

    public int checkAndSetValue(int value, int defaultValue) {
        if (value <= 0) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public float checkAndSetValue(float value, float defaultValue) {
        if (value <= 0.0F) {
            return defaultValue;
        } else {
            return value;
        }
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

    public String getBodyType() {
        return bodyType;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public boolean getIsSummerTires() {
        return isSummerTires;
    }

    public void setIsSummerTires(boolean isSummerTires) {
        this.isSummerTires = isSummerTires;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        char[] arr = registrationNumber.toCharArray();
        if (arr.length == 9 && arr[0] == 'x' && arr[4] == 'x' && arr[5] == 'x'){
            this.registrationNumber = registrationNumber;
        }
        else {
            this.registrationNumber = "None";
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = checkAndSetValue(transmission, "None");
    }

    public void setEngineDisplacement(float engineDisplacement) {
        this.engineDisplacement = checkAndSetValue(engineDisplacement, 0f);
    }

    public void setColor(String color) {
        this.color = checkAndSetValue(color, "None");
    }

    public float getEngineDisplacement() {
        return engineDisplacement;
    }

    public String getColor() {
        return color;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

