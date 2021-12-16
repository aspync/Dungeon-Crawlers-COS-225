import java.util.Random;
import java.util.Scanner;

public class Player extends Entity{ //creates player class

  Player(){ //sets player variables to a default value
    super("Traveler", 10, 1);
  }
  Player(String name, int hp, int atk){ //gets name, hp, and attack from user
    super(name, hp, atk);
  }
  public String getName(){ //returns the name of the player
    return this.name;
  }
  public void setName(Scanner s){ //sets the player's name to the user's input for name
    String input;
    while(true){
      System.out.println("What is your name, traveler? ");
      input = s.nextLine();
      break;
    }
    name = input;
  }
  public int getAttack(){ //returns the player's attack stat
    return this.atk;
  }
  public void setAttack(Scanner s){ //sets the attack stat to the user's input
    int input;
    while(true){
      try{
        System.out.println("Your attack can be a number between 1 and 50");
        input = Integer.parseInt(s.nextLine());
        break;
      } catch (NumberFormatException e){
        System.out.println("That is not a valid input");
      }
    }
    atk = input;
  }
  public int getHP(){ //returns players hit points
    return this.hp;
  }
  public void setHP(Scanner s){ //sets the player's hit points to the user's input
    int input;
    while(true){
      try{
        System.out.println("Your hit points can be a number between 1 and 100");
        input = Integer.parseInt(s.nextLine());
        break;
      } catch (NumberFormatException e){
        System.out.println("That is not a valid input");
      }
    }
    hp = input;
    maxhp = input;
  }
  public void heal(){ //heals the player for 20 points when called
    this.hp += 20;
  }
}
