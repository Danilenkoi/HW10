import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println("Exercise 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.print("ФИО сотрудника — " + fullName);

        // Exercise 2
        System.out.println("\n Exercise 2");
        String capitalLettersInName = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + capitalLettersInName);

        // Exercise 3
        System.out.println("\n Exercise 3");
        String fullName1 = "Иванов Семён Семёнович ";
        fullName1 = fullName1.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName1);
    }
}