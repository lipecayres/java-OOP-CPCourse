import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    // Program 1 ===============
    System.out.println("Program 1: ");

    Scanner sc = new Scanner(System.in);

    // array of names
    ArrayList<String> names = new ArrayList<>();

    // random game
    System.out.println("Lucky prize... Let's start!");

    // get participants name
    String name;
    do {
      System.out.print("Insert participant name: ");
      name = sc.nextLine();

      if (!name.equalsIgnoreCase("quit")) {
        names.add(name);
      }

      System.out.println("Type 'quit' to exit or type new participant name");
    } while (!name.equalsIgnoreCase("quit"));

    // printing names
    System.out.println("Participants:");
    for (String people : names) {
      System.out.println(people);
    }

    // generate new number
    Random rnd = new Random();
    int randomNumber = rnd.nextInt(names.size());

    // print first winner
    System.out.print("First Winner: ");
    System.out.print(names.get(randomNumber));

    // remove name from array and generate new random number
    names.remove(randomNumber);
    randomNumber = rnd.nextInt(names.size());

    // print second winner
    System.out.print("\nSecond Winner: ");
    System.out.print(names.get(randomNumber));

    // Program 2 ======================
    System.out.println("\nProgram 2:");
    // array of names
    ArrayList<Animal> landAnimals = new ArrayList<>();

    // creating animal type
    Animal cheetah = new Animal("cheetah", 8);
    Animal gazelle = new Animal("gazelle", 7);
    Animal dog = new Animal("dog", 3);
    Animal horse = new Animal("horse", 5);
    Animal leopard = new Animal("leopard", 9);

    // adding in array landAnimals
    landAnimals.add(cheetah);
    landAnimals.add(gazelle);
    landAnimals.add(dog);
    landAnimals.add(horse);
    landAnimals.add(leopard);

    // iterate animals and print name
    for (Animal animal : landAnimals) {
      System.out.println(animal.getName());
    }

    // select fastest animal

    String fastestAnimal = "";
    double speed, maxSpeed = 0;

    for (Animal i : landAnimals) {
      speed = i.getTopSpeed();

      if (speed > maxSpeed) {
        maxSpeed = speed;
        fastestAnimal = i.getName();

      }
    }

    System.out.println("\nFastest animal:");
    System.out.println(fastestAnimal);

  }
}
