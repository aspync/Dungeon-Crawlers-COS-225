import java.util.Random;

class Player{
  private int hp;
  private int attack;
  private String name;

  Player(){
    name = "Traveler";
    attack = 1;
    hp = 10;
  }
  Player(String name, int attack, int hp){
    this.name = name;
    this.attack = attack;
    this.hp = hp;
  }
    public boolean takeDamage(int dmg){
    hp -= dmg;
    System.out.format("%s takes %d damage\n", name, dmg);
    if(hp <= 0){
        System.out.format("%s has died\n", name);
        return true;
    }
    return false;
  
  
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    if(name.equals(""))
      return;
    this.name = name;
  }
  public int attack(){
    Random rand = new Random();
    return rand.nextInt(attack);
  }
  public void heal(){
    this.hp += 20;
  }
  public boolean isAlive(){
    return hp > 0;
  }
}
