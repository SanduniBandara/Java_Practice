class countodd1_10{
  public static void main (String [] args){
    int count = 0;
    for (int i = 1; i<=10; i++){  //Inputting 1 to 10.
      if (i % 2 == 1){  //Checking for odd numbers.
        count = count+1;
      }
    }
    System.out.println("The number of odd numbers between 1 and 10 = " + count);
  }
}
