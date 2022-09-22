import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int userAge = input.nextInt();
    currentYear = 2017;
    birthYear = currentYear - userAge;

    System.out.println("You were born in " + birthYear);

  }
}
