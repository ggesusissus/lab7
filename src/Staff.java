import java.io.IOException;
public  class Staff extends Person implements Salary{
    String education, position;
    void initialize1() throws IOException {
        initialize();
        System.out.println("Please enter the education:");
        education = reader.readLine();
        System.out.println("\nPlease enter the position:");
        position = reader.readLine();
    }
    void print1() throws IOException
    {
        print();
        System.out.println( "\n" + education + "\n" +position );
    }

    @Override
    public double salaryToPay(double hours, double rate) {
        return hours * rate;
    }
    public double salaryForOvertime(double overtimeHours, double rate) {
        return overtimeHours * (1.5 * rate);
    }
}
