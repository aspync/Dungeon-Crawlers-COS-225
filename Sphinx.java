import java.util.Scanner;
// /equals.ignoreCase?
// .equalsIgnoreCase()
class Sphinx extends Entity{

  int count = 0;

  public Sphinx(){
    super("Sphinx",10000,10000);



  }

    public void riddle1(){
    System.out.println("\n \nIn the Desert a large statue is at rest.\nIt has the head of a human, the body of a lion, and the wings of a falcon.\nAs you approach, it comes to life and turns to face you.\n Approach traveler, do not be afraid. \n \n Answer these 3 riddles and be on your way.");

      Boolean cor = false;

      while(cor.equals(false)){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("I am something people celebrate or resist. I change people’s thoughts and lives. I am obvious to some people but, to others, I am a mystery. What am I?");

        String answer = scan.nextLine();
        if(answer.equalsIgnoreCase("age")){
            System.out.println("CORRECT");
            cor = true;
            riddle2();
      }
      else{
        count++;
        int chance = 3-count;
        if(chance == -1){
          player.takeDamage(101);
        }
        System.out.println("\n");
        System.out.format("Try Again, %d chances left",chance);
        System.out.println("\n");
      }
    }
    }

    public void riddle2(){
      Boolean cor2 = false;

    while(cor2.equals(false)){
      Scanner scan = new Scanner(System.in);
      System.out.println("\n");
      System.out.println("What grows up while growing down?");

      String answer = scan.nextLine();
      if(answer.equalsIgnoreCase("goose") || answer.equalsIgnoreCase("duck")){
        System.out.println("CORRECT");
        cor2 = true;
        riddle3();
      }
      else{
        count++;
        int chance = 3-count;
        if(chance == -1){
          player.takeDamage(101);
        }
        System.out.println("\n");
        System.out.format("Try Again, %d chances left",chance);
        System.out.println("\n");
    }
  }
  }

  public void riddle3(){
    Boolean cor3 = false;

  while(cor3.equals(false)){
    Scanner scan = new Scanner(System.in);
    System.out.println("\n");
    System.out.println("What bird do you associate with lifting weight?");

    String answer = scan.nextLine();
    if(answer.equalsIgnoreCase("crane")){
      System.out.println("CORRECT");
      cor3 = true;
      takeDamage(99999999);
    }
    else{
      count++;
      int chance = 3-count;
      if(chance == -1){
        player.takeDamage(101);
      }
      System.out.println("\n");
      System.out.format("Try Again, %d chances left",chance);
      System.out.println("\n");
  }
}
}



}
