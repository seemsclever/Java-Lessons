package transport;

public class Bus extends Transport {

    public Bus(Brand brand, String model, int yearOfProduction, String countryOfAssembly, String color, int maxSpeed) {
        super(brand, model, yearOfProduction, countryOfAssembly, color, maxSpeed);
    }

    public String toString(){
        return "Марка - " + brand + "; Модель - " + model + "; Год производства - " + yearOfProduction + "; Страна сборки - " + countryOfAssembly + "; Цвет - " + color + "; Максимальная скорость - " + maxSpeed;
    }
}
