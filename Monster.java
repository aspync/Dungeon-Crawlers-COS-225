import java.util.Scanner;

class Monster extends Entity{
  public Monster(String n, int h, int a){
    super(n, h, a);
//System.out.println("Monster created");
//Creating/defining the monster and their name hp and attack
  }
  public void Battle(Player a, Scanner s){
    while(a.isAlive() && isAlive()){
      System.out.format("%s, %d hit points\n", name, hp);
      System.out.format("%s, %d hit points\n", a.getName(), a.getHP());
      System.out.println("What do you do? \nAttack (a)        Heal (h)");
      String attack_heal = s.nextLine();
      if(attack_heal.equals("a")){
        this.takeDamage(a.Attack());
      } else if(attack_heal.equals("h")){
        a.heal();
      }
      a.takeDamage(this.Attack());
//Takes in the numbers entered and earned by the user/player
//Prints out the totals of each and their progress
    }
  }
}
