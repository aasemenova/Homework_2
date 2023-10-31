public class NumberOfEmployeesOnTheProject {
    public static void main(String[] args) {
        // Объявляем значения переменных
        int programmers = 3;
        int testersPerProgrammer = 2;
        int supportSpecialistsPerProgrammer = 2;

        // Вычисляем количество сотрудников на проекте
        int testersOnProject = calculateTestersOnProject(programmers, testersPerProgrammer);
        int supportSpecialistsOnProject = calculateSupportSpecialistsOnProject(programmers, supportSpecialistsPerProgrammer);
        int allSpecialistsOnProject = calculateAllSpecialistsOnProject(programmers, testersOnProject, supportSpecialistsOnProject);

        // Выводим результат
        System.out.println("Количество программистов: " + programmers);
        System.out.println("Количество тестировщиков на одного программиста: " + testersPerProgrammer);
        System.out.println("Количество специалистов поддержки на одного программиста: " + supportSpecialistsPerProgrammer);
        System.out.println("Количество тестировщиков на проекте: " + testersOnProject);
        System.out.println("Количество специалистов поддержки на проекте: " + supportSpecialistsOnProject);
        System.out.println("Общее количество специалистов на проекте: " + allSpecialistsOnProject);
    }

    // Метод для расчета количества тестировщиков, требуемого на проекте
    public static int calculateTestersOnProject(int programmers, int testersPerProgrammer) {
        return programmers * testersPerProgrammer;
    }

    // Метод для расчета количества специалистов поддержки, требуемого на проекте
    public static int calculateSupportSpecialistsOnProject(int programmers, int supportSpecialistsPerProgrammer) {
        return programmers * supportSpecialistsPerProgrammer;
    }

    // Метод для расчета общего количества специалистов на проекте
    public static int calculateAllSpecialistsOnProject(int programmers, int testersOnProject, int supportSpecialistsOnProject) {
        return programmers + testersOnProject + supportSpecialistsOnProject;
    }
}