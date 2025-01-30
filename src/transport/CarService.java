package transport;

public class CarService {
    public void changeTiresToSummer(Car car) {
        car.setIsSummerTires(true);
    }
    public void changeTiresToWinter(Car car) {
        car.setIsSummerTires(false);
    }
}