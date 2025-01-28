public class Car {
    String brand;
    String model;
    float engineDisplacement;
    String color;
    int yearOfProduction;
    String countryOfAssembly;

    public Car(String brand, String model, float engineDisplacement, String color, int yearOfProduction, String countryOfAssembly){
        this.brand = checkAndSetValue("Марка", brand, "Default");
        this.model = checkAndSetValue("Модель", model, "Default");
        this.engineDisplacement = checkAndSetValue("Объем двигателя", engineDisplacement, 1.5f);
        this.color = checkAndSetValue("Цвет", color, "White");
        this.yearOfProduction = checkAndSetValue("Год производства", yearOfProduction, 2000);
        this.countryOfAssembly = checkAndSetValue("Страна сборки", countryOfAssembly, "Default");
    }

    public String checkAndSetValue(String fieldName, String value, String defaultValue){
        if (value == null || value.isEmpty()) {
            System.out.printf("Параметр \"%s\" не указан, установлено значение по умолчанию: %s%n", fieldName, defaultValue);
            return defaultValue;
        } else {
            return value;
        }
    }

    public int checkAndSetValue(String fieldName, int value, int defaultValue){
        if (value <= 0) {
            System.out.printf("Параметр \"%s\" не указан, установлено значение по умолчанию: %d%n", fieldName, defaultValue);
            return defaultValue;
        } else {
            return value;
        }
    }

    public float checkAndSetValue(String fieldName, float value, float defaultValue){
        if (value <= 0) {
            System.out.printf("Параметр \"%s\" не указан, установлено значение по умолчанию: %f%n", fieldName, defaultValue);
            return defaultValue;
        } else {
            return value;
        }
    }

    public String toString(){
        return "Марка - " + this.brand + "; Модель - " + this.model + "; Объем двигателя - " + this.engineDisplacement
                + "; Цвет - " + this.color + "; Год производства - " + this.yearOfProduction + "; Страна сборки - " + this.countryOfAssembly;
    }
}

