public class Main {
    public static void main(String[] args) {

        // Задание 1

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        //Задание 2

        fullName = fullName.toUpperCase();
        System.out.println(fullName);

        //Задание 3

        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace('ё', 'е');
        System.out.println(fullName1);
    }
}