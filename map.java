import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.NumberFormatException;

class map{
  static int north = 0;
  static int east = 1;
  static int south = 2;
  static int west = 3;

  public static void main(String[] args){
    Scanner t = new Scanner(System.in);

    System.out.println("Welcome to Dungeon Crawler");
    System.out.println("Select map: map");

    String map = t.nextLine() + ".txt";
    t.close();

 Room dungeon[][] = new Room[13][16];

//dungeon [1][3] = new Room;


    Room start = new Room();

    File f = new File(map);

    try{
      int row = 0;
      Scanner s = new Scanner(f);
      while(s.hasNextLine()){
        String temp = s.nextLine();
      //  System.out.println(temp);
        String[] temp2 = temp.split(",");

  //     System.out.println(temp2);
       for(int i = 0; i < temp2.length; i++){
         dungeon[row][i] = new Room(temp2[i]);
         System.out.println(dungeon[row][i]);

      }
         row++;
  }
      s.close();


    } catch (FileNotFoundException e){
      System.out.println("Could not find file");
    } catch (NumberFormatException e){
      System.out.println("Bad Input File");
    }










/*    start.Room();
    start.createRoom(north,"tundra");
    start.createRoom(east,"desert");
    start.createRoom(west,"tunnel");
    start.createRoom(south,"clouds");


    a = start.directions[east];
    a.createRoom(north,"swamp");
    a.createRoom(east,"desert");
    //a.createRoom(west,tunnel); goes to start
    a.createRoom(south,"desert");

    b = a.directions[east];
    b.createRoom(north,"swamp");
    b.createRoom(east,"desert");
    //b.createRoom(west,tunnel); goes to A
    b.createRoom(south,"desert");


    c = b.directions[east];
    c.createRoom(north,"swamp");
    c.createRoom(east,"wall");
    //c.createRoom(west,tunnel); goes to B
    c.createRoom(south,"desert");

    d = c.directions[east];
    d.createRoom(north,"swamp");
    d.createRoom(east,"desert");
    //d.createRoom(west,"tunnel"); goes to C
    d.createRoom(south,"wall");

    e = d.directions[north];
    e.createRoom(north,"swamp");
    e.createRoom(east,"wall");
    e.createRoom(west,"swamp"); //GOES TO AN ALREADY LINK..PROBLEM?
    //e.createRoom(south,"clouds"); goes to E

    f = e.directions[north];
    f.createRoom(north,"swamp");
    f.createRoom(east,"wall");
    f.createRoom(west,"wall");
    //f.createRoom(south,"clouds");

    g = f.directions[north];
    g.createRoom(north,"swamp");
    g.createRoom(east,"wall");
    g.createRoom(west,"swamp");
  //  g.createRoom(south,"clouds");

    h = g.directions[north];
    h.createRoom(north,"swamp");
    h.createRoom(east,"wall");
    h.createRoom(west,"swamp");
  //  h.createRoom(south,"clouds");

    i = h.directions[north];
  //  i.createRoom(north,"tundra");
    i.createRoom(east,"wall");
    i.createRoom(west,"swamp");
  //  i.createRoom(south,"clouds");

//IF NO WALL, DOESNT EXIST, CAN THEY ACCESS

    j = i.directions[west];
    //j.createRoom(north,"tundra");
  //  j.createRoom(east,"desert");
    j.createRoom(west,"wall");
    j.createRoom(south,"swamp"); // already linked?


    k = j.directions[west];
  //  k.createRoom(north,"tundra");
  //  k.createRoom(east,"desert");
    k.createRoom(west,"swamp");
    k.createRoom(south,"swamp");

*/

// it does not auto link
//check if wall, check if null

//attempt to read from file






    //x.east.west = x;
    //x.east.east = new Room("Also filled with lava");
    //x.east.east.west = x.east;

  /*  while(true){
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

    */


  }


}
