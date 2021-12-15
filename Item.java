import java.util.ArrayList;
import java.util.Random;

class Item{

// sword - +2 attack
// health ring +2 HP
// shield +2 defense
// magic hat +1 to all stats
// mysterious box - kills you instantly

  protected int points;
  protected String name;
  protected String type;
  //attack hp defense kill instantly and all stats

  public static void main(String[] args) {
    ArrayList<Item> items = Item.getItems();
    System.out.println(items);
  }

  public static ArrayList<Item> getItems(){
    ArrayList<Item> items = new ArrayList<Item>();
    items.add(new Item("sword",2,"attack"));
    items.add(new Item("health ring",2,"HP"));
    items.add(new Item("shield",2,"defense"));
    items.add(new Item("magic hat",1,"all stats"));
    items.add(new Item("mysterious box",0,"kills instantly"));
    items.add(new Item("sKey",10,"entry to the next room"));
    items.add(new Item("jKey",10,"entry to the next room"));
    items.add(new Item("iKey",10,"entry to the next room"));
    return items;
  }

  public Item(String n, int p, String t){
    this.name = n;
    this.points = p;
    this.type = t;
  }

  public static Item getRandomItem(){
    Random random = new Random();
    ArrayList<Item> items = getItems();
    int index = random.nextInt(items.size());
    return items.get(index);
  }

  public String toString() {
    return name;
  }

}
