public class mul3{
  public static void main (String [] args){

    /*Here int i is chosen for the range between 1 and 40
    as given in the question.
    It is given to display all the multiples of 3 in between
    1 and 40. Therefore the if condition chosen here is
    to identify the multiples of 3 by dividing them by 3
    and looking at the remainder.
    No remainder means it is a multiple of 3.*/

    for (int i = 1; i<=40; i++){
      if(i % 3 == 0){
        System.out.println(i);
      }
    }
  }
}
