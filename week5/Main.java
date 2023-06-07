import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //
        // open clients.txt, output data to the file then close clients.txt
        try (Formatter output = new Formatter("clients.txt")) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ",
                    "Enter account number, first name, last name and balance.",
                    "Enter end-of-file indicator(Ctrl+D) to end input.");

            while (input.hasNext()) { // loop until end-of-file indicator
                int accNo = input.nextInt();
                String fn = input.next();
                String ln = input.next();
                double balance = input.nextDouble();
                // if(flag==-1)
                // break;
                try {
                    // output new record to file; assumes valid input
                    output.format("%d %s %s %.2f%n", accNo, fn, ln, balance);
                } catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine(); // discard input so user can try again
                }

                System.out.print("? ");
            }
            System.out.println("End of file reached");
        }

        catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }

        // reading file

        // open clients.txt, read its contents and close the file
        try (Scanner input = new Scanner(Paths.get("clients.txt"))) {
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                    "First Name", "Last Name", "Balance");

            // %s %-10s
            // 1000 1000______Taran

            // read record from file
            while (input.hasNext()) { // while there is more to read
                // display record contents
                System.out.printf("%-10s%-12s%-12s%10s%n", input.next(),
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
