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
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    if(name.equals(""))
      return;
    this.name = name;
  }
}
