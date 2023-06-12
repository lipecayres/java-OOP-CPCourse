import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //
        // open clients.txt, output data to the file then close clients.txt
      
        try (Formatter output = new Formatter("students.csv")) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ",
                    "Enter full name, phone number, zipcode and province.",
                    "Enter end-of-file indicator(Ctrl+D) to end input.");
            
            String fullName = "", phoneNumber = "", zipcode = "", province = "";

            String[] provinces = {"NL", "PE", "NS", "NB", "QC", "ON", "MB", "SK", "AB", "BC", "YT", "NT", "NU"};
            
            System.out.println("Full name:");
            while (input.hasNext()) { 
              
              while (!fullName.matches("^[A-Z][a-zA-Z]*\\s[A-Z][a-zA-Z]*$")){
                System.out.println("Full Name:");
                fullName = input.nextLine();                
              }
              
              while (!phoneNumber.matches("^\\d{3}[-]\\d{3}[-]\\d{4}")) {
                System.out.println("Phone (xxx-xxx-xxxx):");
                phoneNumber = input.nextLine();                
              }
              
              while (!zipcode.matches("^[a-zA-Z]\\d{1}[a-zA-Z]\\s\\d{1}[a-zA-Z]\\d{1}")) {
                System.out.println("zipcode (A0A 0A0):");
                zipcode = input.nextLine();                
              }

              boolean isProvince = false;
              while (!isProvince) {
                System.out.println("Province (XX):");
                province = input.nextLine(); 

                for (String i: provinces){
                  if (i.equalsIgnoreCase(province)){
                    isProvince = true;
                  }
                }
              }
              
                // if(flag==-1)
                // break;
                try {
                    // output new record to file; assumes valid input
                    output.format("%s, %s, %s, %s%n", fullName, phoneNumber, zipcode, province);

                    fullName = "";
                    phoneNumber = "";
                    zipcode = "" ;
                    province = "";
                  
                } catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine(); // discard input so user can try again
                }

                System.out.print("? ");
                System.out.print("Full name:");
              
            }
            System.out.println("End of file reached");
        }

        catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }

        // reading file

        // open clients.txt, read its contents and close the file
        try (Scanner input = new Scanner(Paths.get("students.csv"))) {
            System.out.printf("%-15s%-15s%-15s%15s%n", "Full Name",
                    "Phone Number", "Zipcode", "Province");

            // %s %-10s
            // 1000 1000______Taran

            // read record from file
            while (input.hasNext()) { // while there is more to read

                String fullName = input.next() + " " + input.next();
                // display record contents
                System.out.printf("%-15s%-15s%-15s%15s%n", fullName,
                        input.next(), input.next(), input.next());
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

        // 905-488-1234
        // L5X 8AZ
        // ON MT BC NT

        // csv - comma sepearated values
    }
}
