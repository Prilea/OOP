import java.util.Calendar;


class Person {

    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);

    private String Name;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String Name, String middleName, String lastName, int age) {
        this.Name = Name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printName() {
        System.out.println("Имя: " + Name);
    }

    public void printFullName() {
        System.out.println("Ваше ФИО: " + lastName + " " + Name + " " + middleName);
    }

    public void printAge() {
        System.out.println("Ваш год рождения: " + (year - age));
    }

    public String toString() {
        return "{" + lastName + " " + Name + " " + middleName + "}";
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        if (!(Name.length() == 0)) {
            this.Name = Name;
            System.out.println("Имя изменено");
        }

    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Ваш год рождения был изменен");
    }

}