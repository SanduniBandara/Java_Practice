class odd19_1m{
  public static void main (String [] args){
    System.out.println("The odd numbers from 19 to 1 :");

    /*Given question states to display odd numbers from 19 to 1.
    Therefore the integer i is assigned 19 as its initial value.
    Then it get reduced by 2 per round by i = i - 2.*/

    for (int i = 19; i>=1; i=i-2){
      System.out.println(i);
    }
  }
}
