import java.util.Scanner;
class prime{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int x = input.nextInt();
    int count = 0;
    for (int i = 1; i<=x; i++){
      int b = x%i;
      if (b==0){
        count = count + 1;
      }
    }
    if (count == 2){
      System.out.println(x+ " is a prime number");
    }
    else {
      System.out.println("This is not a prime number");
    }
  }
}
