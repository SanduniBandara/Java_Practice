class even2_52{
  public static void main(String [] args){
    for (int i = 2; i<=52; i++){
      /*This condition here checks whether the given number
      is odd or even. Since we are considering even numbers,
      only even numbers are printed line by line. */
      if (i%2==0){
        System.out.println(i);
      }
    }
  }
}
