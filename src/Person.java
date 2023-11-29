import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
     String surname,firstname,street,zipcode,city;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     void initialize() throws IOException {
         System.out.println("Please enter the surname:");
         surname = reader.readLine();
         System.out.println("\nPlease enter the name:");
         firstname = reader.readLine();
         System.out.println("\nPlease enter the street:");
         street = reader.readLine();
         System.out.println("\nPlease enter the zipcode:");
         zipcode = reader.readLine();
         System.out.println("\nPlease enter the city:");
         city = reader.readLine();
     }
     void print()
     {
         System.out.println("Your data:\n" + surname + "\n" + firstname + "\n" + street + "\n" + zipcode + "\n" + city);
     }
}
