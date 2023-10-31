public class Cup {
    public static void main(String[] args) {
        final int CUP_VOLUME = 500;
        double cupFillingPercentage = 37.1;

        double waterInCup = calculateWaterInCup(CUP_VOLUME, cupFillingPercentage);

        System.out.println("Объём стакана: " + CUP_VOLUME + " мл");
        System.out.println("Процент заполнения стакана: " + cupFillingPercentage + "%");
        System.out.println("Количество воды в стакане: " + waterInCup + " мл");
    }

    public static double calculateWaterInCup(int cupVolume, double cupFillingPercentage) {
        return cupVolume * cupFillingPercentage / 100;
    }
}