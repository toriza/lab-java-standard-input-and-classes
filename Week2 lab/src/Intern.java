public class Intern extends Employee {

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        if (salary >= 20000){
            salary = 20000;
        }
    }
}
