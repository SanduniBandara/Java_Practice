import java.util.Scanner;
class pnz {
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int x = input.nextInt();
    if (x == 0){
      System.out.println("The entered number is zero.");
    }
    else if (x > 0){
      System.out.println("The entered number is a positive number.");
    }
    else {
      System.out.println("The entered number is a negative number.");
    }
  }
}
