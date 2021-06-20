class PassOrFail53 {
  public static void main(String[] args) {
    int science_mark ;
    char Result;
    science_mark=75;
    if (science_mark > 40){
      Result='p';
    }
    else {
      Result='f';
    }
    if (science_mark < 0){
      Result='i';
    }
    if (science_mark > 100){
      Result='i';
    }
    System.out.println(Result);
    System.out.println("If obtained a p, means pass, if obtained f means fail, if obtained i means invalid marks");
  }

}
