public class MainPerson {
    public static void main(String[] args) {

        Person person = new Person("Иван", "Иванович", "Иванов");

        person.setAge(30);

        System.out.println("Год рождения: " + person.getYearOfBirth());
    }
}

class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middleName, String familyName) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - age;
    }

    @Override
    public String toString() {
        return familyName + " " + name + " " + middleName + ", возраст: " + age;
    }
}
