import javax.naming.Name;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String Name = scanner.nextLine();
        System.out.println("Введите Ваше отчество: ");
        String middleName = scanner.nextLine();
        System.out.println("Введите Вашу фамилию: ");
        String lastName = scanner.nextLine();
        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt();

        Person person = new Person(Name, middleName, lastName, age);
        person.printFullName();
        person.printAge();
        person.toString();
        person.printName();
        person.setName("Маша");
        person.printName();
        person.setAge(30);
        person.getAge();
        person.printAge();

    }
}