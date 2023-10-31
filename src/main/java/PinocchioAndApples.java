public class PinocchioAndApples {
    public static void main(String[] args) {
        // Объявляем значения переменных
        int pinocchioApples = 7;
        int karabasApples = 3;

        // Вычисляем оставшееся количество яблок у Буратино
        int remainingApples = calculateRemainingApples(pinocchioApples, karabasApples);

        // Выводим результат
        System.out.println("Количество яблок у Буратино: " + pinocchioApples);
        System.out.println("Количество яблок, отобранных Карабасом-Барабасом: " + karabasApples);
        System.out.println("Оставшееся количество яблок у Буратино: " + remainingApples);
    }

    // Метод для вычисления оставшегося количества яблок у Буратино
    public static int calculateRemainingApples(int pinocchioApples, int karabasApples) {
        return pinocchioApples - karabasApples;
    }
}