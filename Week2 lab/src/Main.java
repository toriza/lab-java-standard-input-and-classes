import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        Employee employee1 = new Employee("Michael Robinson", "robinson@smth.com", 31, 30000);
        Employee employee2 = new Employee("Francis Smith", "smith@smth.com", 45, 50000);
        Intern employee3 = new Intern("Amanda Minter", "minter@smth.com", 23, 19000);
        Employee employee4 = new Employee("Elaine Porter", "porter@smth.com", 35, 46000);
        Employee employee5 = new Employee("Leroy Bowen", "bowen@smth.com", 65, 55000);
        Employee employee6 = new Employee("Landen Hurley", "hurley@smth.com", 25, 50000);
        Employee employee7 = new Employee("Marisol Wu", "wu@smth.com", 37, 46000);
        Intern employee8 = new Intern("Kyng Barrett", "barrett@smth.com", 24, 35000);
        Intern employee9 = new Intern("Oaklyn Ramirez", "ramirez@smth.com", 20, 18000);
        Employee employee10 = new Employee("Jessica Armstrong", "armstrong@smth.com", 41, 50000);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10};

        try {
            FileWriter writer = new FileWriter("employees.txt", false);
            for(int i = 0; i < employees.length; i++) {
                int employeeNum = i + 1;
                if (employees[i] instanceof Intern && employees[i].salary >= 20000){
                    writer.write(employeeNum + " " + employees[i].toString() + " !Needs attention, this intern has a higher salary than expected!\n");
                } else {
                    writer.write(employeeNum + " " + employees[i].toString()+ '\n');
                }
            }

            writer.close();

            System.out.println("Data has been appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}