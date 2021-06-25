public class even50_1{
  public static void main (String [] args){
    /*The condition is put in the decreasing order.
    Since this asks to write even numbers from 50 to 1,
    starting value of i is taken as 50. Then it is
    reduced by one in each time due to operator i-- */
    for (int i = 50; i>=1; i--){

      /* Since even numbers are considered, the remainder
      when i divided by 2 is checked.*/
      if(i % 2 == 0){
        System.out.println(i);
      }
    }
  }
}
