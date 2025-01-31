package transport;

public class CarService {
    public static void changeTiresToSummer(Car car) {
        car.setIsSummerTires(true);
    }
    public static void changeTiresToWinter(Car car) {
        car.setIsSummerTires(false);
    }
}