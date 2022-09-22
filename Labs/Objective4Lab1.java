public class Objective4Lab1 {
  public static void main(String[] args) {

    java.util.Scanner input = new java.util.Scanner(System.in);

    String fname = "John";
    String lname = "Doe";
    String favoriteAnimal = "Lemur";
    String favoriteFood = "Tacos";
    String favoriteSong = "Twinkle Twinkle Little Star";

    System.out.println("What is your first name?");
    String inputFname = input.nextLine();
    System.out.println("What is your last name?");
    String inputLname = input.nextLine();
    System.out.println("What is your favorite animal?");
    String inputFavoriteAnimal = input.nextLine();
    System.out.println("What is your favorite food?");
    String inputfavoriteFood = input.nextLine();
    System.out.println("What is your favorite song?");
    String inputFavoritesong = input.nextLine();

    System.out.println("My name is " + fname + lname);
    System.out.println("My favorite animal is " + favoriteAnimal);
    System.out.println("My favorite food is " + favoriteFood);
    System.out.println("my favorite song is " + favoriteSong);



  }
}
