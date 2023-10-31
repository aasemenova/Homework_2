public class SarumanAndLannisters {
    public static void main(String[] args) {
        // Объявляем значения переменных
        int infantrymen = 236;
        int orcs = 411;

        // Вычисляем общее количество войск
        int wholeArmy = calculateWholeArmy(infantrymen, orcs);

        // Выводим результат
        System.out.println("Количество пехотинцев у Ланнистеров: " + infantrymen);
        System.out.println("Количество орков в войске Сарумана: " + orcs);
        System.out.println("Общая армия Ланнистеров и Сарумана: " + wholeArmy);
    }

    // Метод для вычисления общего количества войск
    public static int calculateWholeArmy(int infantrymen, int orcs) {
        return infantrymen + orcs;
    }
}