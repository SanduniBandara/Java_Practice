class mul1_10 {
  public static void main(String [] args){
    //Q3 states to display multiplication of all numbers from 1 - 10.
    //int mul is assigned 1.
    int mul = 1;
    for (int i = 1; i<=10; i++){
      mul = mul*i;
    }
    System.out.println("Multiplication of all numbers from 1 to 10 = " + mul);
  }
}
