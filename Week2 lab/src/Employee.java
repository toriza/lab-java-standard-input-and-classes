public class Employee {
    public String name;
    public String email;
    public int age;
    public double salary;

    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name + " " + email + " " + age + " " + salary;
    }

}

