public interface Salary {
    double salaryToPay(double hours, double rate);

    default double salaryForOvertime(double overtimeHours, double rate) {
        return overtimeHours * rate;
    }

    static int bonus(int yearsOfExperience) {
        if (yearsOfExperience > 5) {
            return 100;
        } else {
            return 0;
        }
    }
}
