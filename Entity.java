import java.util.Random;


public class Entity{
  protected int maxhp, hp, atk;
  protected String name;

  //Have the entity take damage, if it dies return true
  public boolean takeDamage(int dmg){
    hp -= dmg;
    System.out.format("%s takes %d damage\n", name, dmg);
    if(hp <= 0){
      System.out.format("%s has died\n", name);
      return true;
    }
    return false;
  }
  public Entity(String n, int h, int a){ //defines each variable used and their types
    name = n;
    maxhp = h;
    hp = h;
    atk = a;
  }
  public int Attack(){ //generates random number between 1 and the entity's attack stat when attacking a monster
    Random rand = new Random();
    return rand.nextInt(atk);
  }
  public boolean isAlive(){ //keeps track of whether an entity is still alive or not
    return hp > 0;
  }
}
