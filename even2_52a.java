class even2_52a {
  public static void main (String [] args){
    System.out.println("The even numbers from 2 upto 52 : ");
    /*In the question asked, it says to display the even
    numbers from 2 to 52.
    We can consider this as a sequence hence this starts with 2.
    We can continualy go by adding 2 to the previous number.*/
    for (int i = 2; i<=52; i=i+2){
      System.out.println(i);
    }
  }
}
