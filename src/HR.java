import java.io.IOException;

public class HR {
    public static void main(String[] args) throws IOException {
    }

    Staff staff = new Staff();
    double salary = staff.salaryToPay(180, 20);
    double salaryover = staff.salaryForOvertime(10, 40);
    int bonus = Salary.bonus(6);
}

