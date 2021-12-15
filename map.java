import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.NumberFormatException;

//create key check in gate Room
//create walls impassible
//create End /Winning screen
//create instakill function for Player





class map{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Dungeon Crawler");
  //  System.out.println("Select map: map");

//    String map = t.nextLine() + ".txt";
  //  t.close();


//start the game;
    int x = 6;
    int y = 10;




//if(dungeon[x][y]).isWall(){
//  System.out.print("Cannot enter wall there;")
//}


    Room dungeon[][] = new Room[13][16];

    File f = new File("map.txt");

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
    //     System.out.println(dungeon[row][i]);

      }

         row++;
  }
      s.close();


    } catch (FileNotFoundException e){
      System.out.println("Could not find file");
    } catch (NumberFormatException e){
      System.out.println("Bad Input File");
    }

    while(true){
      //add start at dungeon[7][11];

    try{
      System.out.println(dungeon[x][y].getDesc());
      System.out.println("Which direction?");
      String dir = scan.nextLine();
      if(dir.equalsIgnoreCase("north")) x--;
      if(dir.equalsIgnoreCase("south")) x++;
      if(dir.equalsIgnoreCase("east")) y++;
      if(dir.equalsIgnoreCase("west")) y--;
    }
    catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Cannot go that way.");
      System.out.println("Which direction?");
      String dir = scan.nextLine();
    }
  }





  }


}
