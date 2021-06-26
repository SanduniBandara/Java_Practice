class even50_1min{
  public static void main (String [] args){
    System.out.println("The even numbers from 50 to 1 :");
    //Question states to display even numbers from 50 to 1.
    for (int i = 50; i>1; i=i-2){
      System.out.println(i);
    }
    /*The int i used here is taken to show the even numbers.
    Since we can consider this particular set of numbers
    as a sequence, using a if conditional statement is
    unnessary.
    In order to carry out the if's part the ending part of
    'for' loop is used as i = i-2 in order to deduct 2 from
    i's value. */
  }
}
