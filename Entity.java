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
  public Entity(String n, int h, int a){
    name = n;
    maxhp = h;
    hp = h;
    atk = a;
  }
}
