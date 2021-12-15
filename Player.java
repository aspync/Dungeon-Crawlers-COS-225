import java.util.Random;
import java.util.Scanner;

public class Player{ //creates player class
  private int hp;
  private int attack;
  private String name;

  Player(){ //sets player variables to a default value
    name = "Traveler";
    attack = 1;
    hp = 10;
  }
  Player(String name, int attack, int hp){ //gets name, hp, and attack from user
    this.name = name;
    this.attack = attack;
    this.hp = hp;
  }
  public String getName(){ //returns the name of the player
    return this.name;
  }
  public void setName(String name){ //sets the player's name to the user's input for name
    if(name.equals(""))
      return;
    this.name = name;
  }
  public int getAttack(){ //returns the player's attack stat
    return this.attack;
  }
  public int setAttack(Scanner s){ //sets the attack stat to the user's input
    int input;
    while(true){
      try{
        System.out.println("Your attack can be a number between 1 and 50");
        input = Integer.parseInt(s.nextLine());
        break;
      } catch (NumberFormatException e){
        System.out.format("\n%s is not a valid input\n", input);
      }
    }
    return input;
  }
  public int getHP(){ //returns players hit points
    return this.hp;
  }
  public int setHP(Scanner s){ //sets the player's hit points to the user's input
    int input;
    while(true){
      try{
        System.out.println("Your hit points can be a number between 1 and 100");
        input = Integer.parseInt(s.nextLine());
        break;
      } catch (NumberFormatException e){
        System.out.format("\n%s is not a valid input\n", input);
      }
    }
    return input;
  }
  public int Attack(){ //generates random number between 1 and the player's attack stat when attacking a monster
    Random rand = new Random();
    return rand.nextInt(attack);
  }
  public void heal(){ //heals the player for 20 points when called
    this.hp += 20;
  }
  public boolean isAlive(){ //keeps track of whether the player is still alive or not
    return hp > 0;
  }
}
