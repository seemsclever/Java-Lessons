package transport;

public class Car extends Transport{

    private float engineDisplacement;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int amountOfSeats;
    private boolean isSummerTires;

    public Car(Brand brand, String model, float engineDisplacement, String color, int maxSpeed, int yearOfProduction, String countryOfAssembly, String transmission, String bodyType, String registrationNumber, int amountOfSeats, boolean isSummerTires) {
        super(brand, model, yearOfProduction, countryOfAssembly, color, maxSpeed);
        setEngineDisplacement(engineDisplacement);
        setTransmission(transmission);
        this.bodyType = bodyType;
        setRegistrationNumber(registrationNumber);
        this.amountOfSeats = amountOfSeats;
        setIsSummerTires(isSummerTires);
    }

    public String toString() {
        return "Марка - " + this.brand + "; Модель - " + this.model + "; Объем двигателя - " + this.engineDisplacement + "; Цвет - " + this.color + "; Год производства - "
                + this.yearOfProduction + "; Максимальная скорость - " + this.maxSpeed + "; Страна сборки - " + this.countryOfAssembly + "; Коробка передач - " + this.transmission + "; Тип кузова - " + this.bodyType
                + "; Регистрационный номер - " + this.registrationNumber + "; Количество мест - " + this.amountOfSeats + "; Летние ли шины - " + this.isSummerTires + "; Владелец - " + this.owner;
    }

    public static String checkAndReturnValue(String value, String defaultValue) {
        if (value != null && !value.isBlank()) {
            return value;
        } else {
            return defaultValue;
        }
    }

    public static int checkAndReturnValue(int value, int defaultValue) {
        if (value <= 0) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public static float checkAndReturnValue(float value, float defaultValue) {
        if (value <= 0.0F) {
            return defaultValue;
        } else {
            return value;
        }
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
        this.transmission = checkAndReturnValue(transmission, "None");
    }

    public void setEngineDisplacement(float engineDisplacement) {
        this.engineDisplacement = checkAndReturnValue(engineDisplacement, 0f);
    }

    public float getEngineDisplacement() {
        return engineDisplacement;
    }
}

