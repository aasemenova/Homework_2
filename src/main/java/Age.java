public class Age {
    public static void main(String[] args) {
        long universeAge = 13000000000L;
        int ageOfHumanRace = 100000;

        long ratio = calculateRatio(universeAge, ageOfHumanRace);

        System.out.println("Возраст Вселенной: " + universeAge + " лет");
        System.out.println("Возраст человека, как вида: " + ageOfHumanRace + " лет");
        System.out.println("Во сколько раз Вселенная старше людей: " + ratio + " раз");
    }

    public static long calculateRatio(long universeAge, int ageOfHumanRace) {
        return universeAge / ageOfHumanRace;
    }
}