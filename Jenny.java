//incomplete

import java.util.Scanner;

class Jenny extends Entity{

  int count = 0;

  public Jenny(String n, int h, int a){
    super(n, h, a);
    n = "Jenny Greenteeth";
    h = 200;
    a = 75;
    System.out.println("The swamp makes you feel uneasy, as if you are not alone. \nYou seem to be stuck on the other side of the water. \nHowever, you see what appears to be a path of grass that leads to the other side of the river. \nAs you step on it, the path sinks under the water. /nYou catch yourself and make it back on the shore. \nYou see a disgusting, horrible creature rise out of the water. \nYou have met Jenny Greenteeth. \nYou are surprised.");
    Player.takeDamage(10);

    System.out.println("What do you do? \nAttack (a)     Heal (h)");
    String choice = scan.nextLine();

    if(choice == "a"){
      Player.Attack();
    } else if(choice == "h"){
      Player.heal();
    }
  }
}
