import java.util.Scanner;
class p_s {
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the number of the day : ");
    int a = input.nextInt();

    if (a == 1){
      System.out.println("Monday");
    }
    else if (a == 2){
      System.out.println("Tuesday");
    }
    else if (a == 3){
      System.out.println("Wednesday");
    }
    else if (a == 4){
      System.out.println("Thursday");
    }
    else if (a ==5 ){
      System.out.println("Friday");
    }
    else if (a == 6){
      System.out.println("Saturday");
    }
    else if (a == 7){
      System.out.println("Sunday");
    }
    else if (a>7){
      System.out.println("Invalid day of week");
    }
    else  if (a<0){
      System.out.println("Invalid day of week");
    }
  }
}
