package transport;

public class Car extends Transport{

    private float engineDisplacement;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int amountOfSeats;
    private boolean isSummerTires;
    protected String howToDrive = "It Is Easy To Drive Me";
    protected float fuelPercentage;

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
                + "; Регистрационный номер - " + this.registrationNumber + "; Количество мест - " + this.amountOfSeats + "; Летние ли шины - " + this.isSummerTires + "; Владелец - " + this.owner + "; Процент топлива - " + this.fuelPercentage;
    }

    @Override
    public void refill() {
        fuelPercentage = 100f;
        System.out.println("Автомобиль заправлен до 100%");
    }

    public String knowHowToDrive() {
        return "It Is Easy To Drive Me";
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

    public float getFuelPercentage() {
        return fuelPercentage;
    }

    private void setFuelPercentage(float fuelPercentage) {
        this.fuelPercentage = checkAndReturnValue(fuelPercentage, 0f);
    }
}

