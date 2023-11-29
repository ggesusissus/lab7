import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Person person = new Person();
      //  person.initialize();
      //  person.print();
        Staff staff = new Staff();
        HR hr = new HR();
       // staff.initialize1();
       // staff.print1();;
        System.out.println("The employee received a salary in the amount of " + hr.salary);
        System.out.println("The employee received a salary for overtime in the amount of " + hr.salaryover);
        System.out.println("The employee received a bonus in the amount of " + hr.bonus);

    }
}