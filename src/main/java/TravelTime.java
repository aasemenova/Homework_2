public class TravelTime {
    public static void main(String[] args) {
        final int DISTANCE_FROM_HOME_TO_OFFICE = 30;
        double taxiSpeed = 60.0;
        double transportDecelerationCoefficient = 0.2;

        double timeFromHomeToOffice = calculateTimeFromHomeToOffice(DISTANCE_FROM_HOME_TO_OFFICE, taxiSpeed);
        double timeFromOfficeToHome = calculateTimeFromOfficeToHome(timeFromHomeToOffice, transportDecelerationCoefficient);

        System.out.println("Расстояние от дома до офиса: " + DISTANCE_FROM_HOME_TO_OFFICE + " км");
        System.out.println("Средняя скорость такси: " + taxiSpeed + " км/ч");
        System.out.println("Время, за которое тестировщик добирается от дома до офиса: " + timeFromHomeToOffice + " часа");
        System.out.println("Коэффициент замедления транспорта вечером: " + transportDecelerationCoefficient);
        System.out.println("Время, за которое тестировщик добирается с работы домой: " + timeFromOfficeToHome + " часа");
    }

    public static double calculateTimeFromHomeToOffice(int distanceFromHomeToOffice, double taxiSpeed) {
        return distanceFromHomeToOffice / taxiSpeed;
    }

    public static double calculateTimeFromOfficeToHome(double timeFromHomeToOffice, double transportDecelerationCoefficient) {
        return timeFromHomeToOffice * transportDecelerationCoefficient;
    }
}