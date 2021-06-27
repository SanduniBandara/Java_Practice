import java.util.Scanner;
class CalArea{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the type of shape you want to find the area : circle/rectangle/triangle");
    String shape = input.nextLine();
    switch(shape){

      case "circle":
      System.out.println("Enter the radius of circle:");
      int radius = input.nextInt();
      double c_area = 3.14*radius*radius;
      System.out.println("Area of the circle = " + c_area);
      break;

      case "rectangle":
      System.out.println("Enter the width : ");
      int width = input.nextInt();
      System.out.println("Enter the length :");
      int length = input.nextInt();
      int r_area = width*length;
      System.out.println("Area of rectangle = " + r_area);
      break;

      case "triangle":
      System.out.println("Enter length of base : ");
      int base = input.nextInt();
      System.out.println("Enter height : ");
      int height = input.nextInt();
      double t_area = (base*height)/2;
      break;
      
      default:
      System.out.println("Invalid input");
    }
  }
}
