public class Student {
    private String name;
    private int age;
    private String group;

    // Конструктор
    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    // Метод вывода информации
    public void printInfo() {
        System.out.println("Студент: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Группа: " + group);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Иван Иванов", 19, "ИС-21");
        Student student2 = new Student("Анна Смирнова", 20, "ПИ-22");

        student1.printInfo();
        student2.printInfo();
    }
}
