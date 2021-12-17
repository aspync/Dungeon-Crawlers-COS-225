import java.util.Scanner;


class Sphinx extends Monster{ //The Sphinx class is created specifically to make a Sphinx, which inherits the aspects of the Monster class.
  Player a = new Player();
  public Sphinx(){ //This function gives the Sphinx some stats
    super("Sphinx",10000,10000);
  }


    public static void riddle1(Player a, Monster b, Scanner scan){ //This function describes the Sphinx, presents the player with the first riddle, and determines whether their answer is correct or not
    int count = 0;
    System.out.println("\n \nIn the Desert a large statue is at rest.\nIt has the head of a human, the body of a lion, and the wings of a falcon.\nAs you approach, it comes to life and turns to face you.\n Approach traveler, do not be afraid. \n \n Answer these 3 riddles and be on your way.");

      Boolean cor = false;

      while(cor.equals(false)){
        System.out.println("\n");
        System.out.println("I am something people celebrate or resist. I change people’s thoughts and lives. I am obvious to some people but, to others, I am a mystery. What am I?");

        String answer = scan.nextLine();
        if(answer.equalsIgnoreCase("age")){
            System.out.println("CORRECT");
            cor = true;
            riddle2(a,b,scan);
      }
      else{
        count++;
        int chance = 3-count;
        if(chance == 0){
          a.takeDamage(1000);
          if(!a.isAlive()){
            System.exit(0);
          }
        }
        System.out.println("\n");
        System.out.format("Try Again, %d chances left",chance);
        System.out.println("\n");
      }
    }
    }

    public static void riddle2(Player a, Monster b, Scanner scan){ //This function presents the player with the second riddle and determines whether their answer is correct or not
      int count = 0;
      Boolean cor2 = false;

    while(cor2.equals(false)){
      System.out.println("\n");
      System.out.println("What grows up while growing down?");

      String answer = scan.nextLine();
      if(answer.equalsIgnoreCase("goose") || answer.equalsIgnoreCase("duck")){
        System.out.println("CORRECT");
        cor2 = true;
        riddle3(a,b,scan);
      }
      else{
        count++;
        int chance = 3-count;
        if(chance == -1){
          a.takeDamage(1000);
          if(!a.isAlive()){
            System.exit(0);
          }
        }
        System.out.println("\n");
        System.out.format("Try Again, %d chances left",chance);
        System.out.println("\n");
    }
  }
  }

  public static void riddle3(Player a, Monster b, Scanner scan){ //This function presents the player with the third riddle and determines whether their answer is correct or not
    int count = 0;
    Boolean cor3 = false;

  while(cor3.equals(false)){
    System.out.println("\n");
    System.out.println("What bird do you associate with lifting weight?");

    String answer = scan.nextLine();
    if(answer.equalsIgnoreCase("crane")){
      System.out.println("CORRECT");
      cor3 = true;
      b.takeDamage(99999999);
    }
    else{
      count++;
      int chance = 3-count;
      if(chance == -1){
        a.takeDamage(1000);
        if(!a.isAlive()){
          System.exit(0);
        }
      }
      System.out.println("\n");
      System.out.format("Try Again, %d chances left",chance);
      System.out.println("\n");
  }
}
}



}
