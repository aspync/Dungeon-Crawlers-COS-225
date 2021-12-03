class Game{

  static void doDamage(Entity x){
    x.takeDamage(10);
  }
  public static void main(String[]args){
    Monster a = new Monster("Goblin", 4, 1);
    Player b = new Player("Tim the Toolman", 900, 100);
    doDamage(a);
    doDamage(b);
  }
}
