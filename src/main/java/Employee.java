public class Employee {

    private final String name;
    private final String surname;
    private int age;
    private float baseSalary;
    private float bonus;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, float baseSalary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String surname, int age, float baseSalary, float bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public String getShortDescriptionOfEmployee() {
        return "Employee name: " + name + " " + surname;
    }

    public String getLongDescriptionOfEmployee() {
        return "Employee details: " + name + " "+ surname + " is " + age;
    }

    public float getTotalSalary() {
        return baseSalary + bonus;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public float getBonus() {
        return bonus;
    }

}

