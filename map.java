import java.util.Scanner;


class map{
  static int north = 0;
  static int east = 1;
  static int south = 2;
  static int west = 3;

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = s.nextLine();
    System.out.format("Hello %s\n", name);

    Terrain x = new Terrain();
    x.createTerrain(east,"The terrain is filled with lava");
    x.createTerrain(west,"The terrain is filled with poison");
    x = x.directions[east];
    x.createTerrain(east,"Lava with a bit of steam");
    //x.east.west = x;
    //x.east.east = new Terrain("Also filled with lava");
    //x.east.east.west = x.east;

    while(true){
      System.out.println("What direction?");
      String u = s.nextLine();
      if(u.equals("east")) {
        if(x.directions[east] == null) System.out.println("Theres a wall there");
        else {
          x = x.directions[east];
          System.out.println(x.getDesc());
        }
      }
    }


  }


}
