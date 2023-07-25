import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Program2 {

  public static void main(String[] args) {

    int total = 0;
    int num = 0;
    File myFile = null;
    Scanner inputFile = null;

    try {
      myFile = new File("inFile.txt");
      inputFile = new Scanner(myFile);
  
      while (inputFile.hasNext()) {
        num = inputFile.nextInt();
        total += num;
      }
  
      System.out.println("The total value is " + total);
        
    } catch (InputMismatchException e) {
      System.out.println("Error - Input");
    } catch (FileNotFoundException e) {
      System.out.println("Error- File not found");
    } finally {
      System.out.println("Yes, we are good here!");
    }
        
  }
}