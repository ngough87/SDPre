import java.util.Scanner;
public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;
    int num1 = 1;
    int num2 = 2;
    int num3 = 3;

    while(true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      if(selection == num1) {

        System.out.println(" Hello Human");
      }
      else if(selection == num2) {

        System.out.println("Apples, Bananas, Coconuts");
      }
      else if(selection == num3) {

        System.out.println("Goodbye");

        scanner.close();
      }
    }
  }
}
