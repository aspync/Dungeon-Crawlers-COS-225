import java.util.Scanner;

class Sphinx extends Entity{

  int count = 0;

  public Sphinx(String n,int h,int a){
    super(n,h,a);
    n = "Sphinx";
    h = 10000;
    a = 10000;
    System.out.println("In the Desert a large statue is at rest.\nIt has the head of a human, the body of a lion, and the wings of a falcon.\nAs you approach, it comes to life and turns to face you.\n Approach traveler, do not be afraid. Answer these 3 riddles and be on your way.");
    riddle1();
  }

    public void riddle1(){
      Scanner scan = new Scanner(System.in);
      System.out.println("I am something people celebrate or resist. I change people’s thoughts and lives. I am obvious to some people but, to others, I am a mystery. What am I?");

      String answer = scan.nextLine();
      scan.close();
      if(answer.equals("age") || answer.equals("AGE") || answer.equals("Age")){
        System.out.println("CORRECT");
        riddle2();
      }
      else{
        count=+1;
        int chance = 3-count;
        System.out.format("Try Again, %d chances left",chance);

      }
    }

    public void riddle2(){
      Scanner scan = new Scanner(System.in);
      System.out.println("What grows up while growing down?");

      String answer = scan.nextLine();
      scan.close();
      if(answer.equals("goose") || answer.equals("Goose") || answer.equals("GOOSE") ||
      answer.equals("duck") || answer.equals("Duck") || answer.equals("DUCK")){
        System.out.println("CORRECT");
        riddle3();
      }
      else{
        count=+1;
        int chance = 3-count;
        System.out.format("Try Again, %d chances left",chance);

    }
  }

  public void riddle3(){
    Scanner scan = new Scanner(System.in);
    System.out.println("What bird do you associate with lifting weight?");

    String answer = scan.nextLine();
    scan.close();
    if(answer.equals("crane")|| answer.equals("Crane") || answer.equals("CRANE")){
      System.out.println("CORRECT");
      takeDamage(10001);
    }
    else{
      count=+1;
      int chance = 3-count;
      System.out.format("Try Again, %d chances left",chance);

  }
}



}
