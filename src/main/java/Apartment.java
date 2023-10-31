public class Apartment {
    public static void main(String[] args) {
        int apartmentCost = 4720000;
        double downPaymentPercent = 0.2;

        double downPaymentAmount = calculateDownPaymentAmount(apartmentCost, downPaymentPercent);

        System.out.println("Стоимость квартиры: " + apartmentCost + " руб.");
        System.out.println("Процент первоначального взноса по ипотеке: " + (downPaymentPercent * 100) + "%");
        System.out.println("Сумма первоначального взноса: " + downPaymentAmount + " руб.");
    }

    public static double calculateDownPaymentAmount(int apartmentCost, double downPaymentPercent) {
        return apartmentCost * downPaymentPercent;
    }
}