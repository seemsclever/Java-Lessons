package transport;

public class Car {
    private final String brand;
    private final String model;
    private final float engineDisplacement;
    private final String color;
    private final int yearOfProduction;
    private final String countryOfAssembly;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int amountOfSeats;
    private boolean isSummerTires;

    public Car(String brand, String model, float engineDisplacement, String color, int yearOfProduction, String countryOfAssembly, String transmission, String bodyType, String registrationNumber, int amountOfSeats, boolean isSummerTires) {
        this.brand = brand;
        this.model = model;
        this.engineDisplacement = engineDisplacement;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.amountOfSeats = amountOfSeats;
        this.isSummerTires = isSummerTires;
    }

    public String toString() {
        return "Марка - " + this.brand + "; Модель - " + this.model + "; Объем двигателя - " + this.engineDisplacement + "; Цвет - " + this.color + "; Год производства - "
                + this.yearOfProduction + "; Страна сборки - " + this.countryOfAssembly + "; Коробка передач - " + this.transmission + "; Тип кузова - " + this.bodyType
                + "; Регистрационный номер - " + this.registrationNumber + "; Количество мест - " + this.amountOfSeats + "; Летние ли шины - " + this.isSummerTires;
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

    public boolean getIsSummerTires() {
        return isSummerTires;
    }

    public void setIsSummerTires(boolean isSummerTires) {
        this.isSummerTires = isSummerTires;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = checkAndSetValue(amountOfSeats, 0);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        char[] arr = registrationNumber.toCharArray();
        if (arr.length == 9 && arr[0] == 'x' && arr[4] == 'x' && arr[5] == 'x'){
            this.registrationNumber = registrationNumber;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = checkAndSetValue(bodyType, "None");
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = checkAndSetValue(transmission, "None");
    }
}

