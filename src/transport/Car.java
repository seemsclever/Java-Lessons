package transport;

import java.awt.*;

public class Car extends Transport implements Competing{
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int amountOfSeats;
    private boolean isSummerTires;
    protected String horn = "Horn!";
    protected float fuelPercentage;

    private float bestCircleTime;
    private int maxSpeed;

    public enum BodyType{
        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String bodyTypeName;

        BodyType(String bodyTypeName) {
            this.bodyTypeName = bodyTypeName;
        }

        public String getBodyTypeName() {
            return bodyTypeName;
        }
    }

    public Car(Brand brand, String model, float engineDisplacement){
        super(brand, model);
        this.engineDisplacement = engineDisplacement;
    }

    public Car(Brand brand, String model, float engineDisplacement, String color, int maxSpeed, int yearOfProduction, String countryOfAssembly, String transmission, BodyType bodyType, String registrationNumber, int amountOfSeats, boolean isSummerTires) {
        super(brand, model, yearOfProduction, countryOfAssembly, color, maxSpeed);
        setEngineDisplacement(engineDisplacement);
        setTransmission(transmission);
        this.bodyType = bodyType.getBodyTypeName();
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
            this.registrationNumber = "Unknown";
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = checkAndReturnValue(transmission, "Unknown");
    }

    public float getFuelPercentage() {
        return fuelPercentage;
    }

    private void setFuelPercentage(float fuelPercentage) {
        this.fuelPercentage = checkAndReturnValue(fuelPercentage, 0f);
    }

    @Override
    public void makePitStop() {
        System.out.println("Сделан пит-стоп " + brand.getName() + " " + model);
    }

    @Override
    public void setBestCircleTime(float bestCircleTime) {
        this.bestCircleTime = bestCircleTime;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doCheckout(){
        System.out.println("Произведена диагностика легкового автомобиля " + this.getBrand() + " " + this.getModel());
    }
}

