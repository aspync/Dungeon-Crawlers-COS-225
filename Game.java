import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.NumberFormatException;
import java.util.*;
import java.util.ArrayList;

public class Game{

  public static final Scanner userInput = new Scanner(System.in);
  public static final Random rand = new Random();

  public static void main(String[]args){ //this is the welcome screen for the game
    System.out.println("Welcome, traveler...");
    System.out.println(" ");
    System.out.println("To the The Chaos Tombs!");
    System.out.println("--------------------");

    Player newPlayer = new Player(); //Lets the user create a new new character
    newPlayer.setName(userInput);
    newPlayer.setAttack(userInput);
    newPlayer.setHP(userInput);

    ArrayList<Item> inventory = new ArrayList<Item>();

//these two x and y sets the starting location of the game
    int x = 6;
    int y = 10;

//if(dungeon[x][y]).isWall(){
//  System.out.print("Cannot enter wall there;")
//}


    Room dungeon[][] = new Room[13][16]; //This function creates the dungeon based on a pre-made map
    File f = new File("map.txt");
    try{
      int row = 0;
      Scanner s = new Scanner(f);
      while(s.hasNextLine()){
        String temp = s.nextLine();
        String[] temp2 = temp.split(",");
       for(int i = 0; i < temp2.length; i++){
         dungeon[row][i] = new Room(temp2[i]);
      }
         row++;
  }
      s.close();
    } catch (FileNotFoundException e){
      System.out.println("Could not find file");
    } catch (NumberFormatException e){
      System.out.println("Bad Input File");
    }


    while(true){ //This function allows the user to move to a new room. If there is a monster in the room, it will trigger the battle
    try{
      System.out.println(dungeon[x][y].getDesc());


      if(dungeon[x][y].getEnvironment().equals("Sphinx")){
        Sphinx.riddle1(newPlayer,dungeon[x][y].M,userInput);
        if(newPlayer.isAlive()){
          inventory.add(new Item("The Sphinx's key", 10, "Unlocks gate"));
          System.out.println("You got the Sphinx's key!");
        }
      }
      if(dungeon[x][y].getEnvironment().equals("jenny")){
        dungeon[x][y].M.Battle(newPlayer, userInput);
        if(!dungeon[x][y].M.isAlive()){
          inventory.add(new Item("Jenny's key", 10, "Unlocks gate"));
          System.out.println("You got Jenny's key!");
        }
      }
      if(!newPlayer.isAlive()){
        System.exit(0);
      }

      if(dungeon[x][y].getEnvironment().equals("Gate")){
        boolean hasJKey = false;
        boolean hasSKey = false;
        for(int i = 0; i < inventory.size(); i++){
          System.out.println(inventory.get(i).getName());
          if(inventory.get(i).getName().equals("Jenny's key")){
            hasJKey = true;
          }
          if(inventory.get(i).getName().equals("The Sphinx's key")){
            hasSKey = true;
          }
        }
        if(hasJKey == true && hasSKey == true){
          System.out.println("You've made it out!");
          System.exit(0);
        }
      }
      System.out.println("Which direction? (north, south, east, west)");
      String dir = userInput.nextLine();


      if(dir.equalsIgnoreCase("north")){ //These functions are used when the player tries to enter a room that is actually a wall
      if(!dungeon[x-1][y].getEnvironment().equals("wall")){
          x--;
        }
      else{System.out.println("There is a wall there.\n");}
      }

      if(dir.equalsIgnoreCase("south")){
      if(!dungeon[x+1][y].getEnvironment().equals("wall")){
          x++;
        }
      else{System.out.println("There is a wall there.\n");}
      }

      if(dir.equalsIgnoreCase("east")){
      if(!dungeon[x][y+1].getEnvironment().equals("wall\n")){
          y++;
        }
      else{System.out.println("There is a wall there.\n");}
      }

      if(dir.equalsIgnoreCase("west")){
      if(!dungeon[x][y-1].getEnvironment().equals("wall")){
          y--;
        }
      else{System.out.println("There is a wall there.\n");}
      }

    }
    catch (ArrayIndexOutOfBoundsException e){ //This function prevents the player from going out of bounds from the map
      System.out.println("Cannot go that way.");
      System.out.println("Which direction? (north, south, east, west)");
      String dir = userInput.nextLine();
    }
  }



  }
}
