import java.util.Scanner;

public class Objective4Lab2 {
  public static void main (String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 1, num2 = 7, num3 = 5;
    int sum1 = num1 + num2 +num3;
    double dub1 = 1.1, dub2 = 2.2, dub3 = 3.3;
    double sum2 = dub1 + dub2 +dub3;



    System.out.println("Please enter the first whole number you would like to add.");
    String inputNum1 = keyboard.nextLine();
    System.out.println("Please enter the second whole number you would like to add.");
    String inputNm2 = keyboard.nextLine();
    System.out.println("Please enter the third whole number you would like to add.");
    String inputNum3 = keyboard.nextLine();
    System.out.println("Please enter the first decimal number you would like to add.");
    String inputdub1 = keyboard.nextLine();
    System.out.println("Please enter the second decimal number you would like to add.");
    String inputdub2 = keyboard.nextLine();
    System.out.println("Please enter the third decimal number you would like to add.");
    String inputdub3 = keyboard.nextLine();
    System.out.println(num1 + " + " + num2 + " + " + num3 + " + " + " = " + sum1);
    System.out.println(dub1 + " + " + dub2 + " + " + dub3 + " + " + " = " + sum2);
  }
}
