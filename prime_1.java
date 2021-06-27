import java.util.Scanner;
class prime_1 {
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number :");
    int x = input.nextInt();
    int prime = 1;
    for (int i = 2; i<x; i++){
      if (x%i == 0){
        prime = 0;
      }
      break;
    }
    if (prime == 1){
      System.out.println(x + " is a prime number");
    }
    else {
      System.out.println(x + " is not a prime number");
    }
  }
}
