import java.util.Scanner;
class Dosage{
  public static void main(String [] args){
    Scanner x = new Scanner(System.in);
    System.out.println("Are you a kid, teenager or an adult?");
    String user_input = x.nextLine();
    switch(user_input){
      case "kid":
        System.out.println("take 1 tablet at night");
        break;

      case "teenager":
        System.out.println("take 1 tablet at night");
        break;

      case "adult":
        System.out.println("take 2 tablets at night");
        break;

      default:
        System.out.println("Invalid input");
    }
  }
}
