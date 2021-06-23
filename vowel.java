import java.util.Scanner; //Importing the scanner class
public class vowel {
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter any one character from the keyboard");
    char b = input.next().charAt(0);//Getting the input from the keyboard.
    int x;//Defining a helping variable for ease of coding.


    if (b == 'a'|| b == 'A'){
      x = 1;
    }
    else if (b == 'e' || b == 'E'){
      x = 1;
    }
    else if (b == 'i' || b == 'I'){
      x = 1;
    }
    else if (b == 'o' || b == 'O'){
      x = 1;
    }
    else if (b == 'u' || b == 'U'){
      x = 1;
    }
    //Defining possible errors
    else if (b == '1'|| b =='2'||b =='3'|| b=='4'||b=='5'||b=='6'||b=='7'||b=='8'||b=='9'||b=='0'){
      x = 2;
    }
    else if (b=='!'||b=='@'||b=='#'||b=='$'||b=='%'||b=='^'||b=='&'||b=='*'|| b=='('||b==')'||b=='-'||b=='_'||b=='+'||b=='='||b=='`'||b=='~'|| b== '{' || b=='}'||b =='['||b==']'||b=='?'|| b=='|'||b=='<'||b=='>'||b==','|| b=='.' || b=='/'){
      x = 2;
    }
    else {
      x = 0;
    }

    if (x==1){
      System.out.println("The entered character is a vowel(a,e,i,o,u)");
    }
    else if (x==2){
      System.out.println("Error : Please enter a character");
    }
    else {
      System.out.println("The entered character is a consonant.");
    }
  }
}
