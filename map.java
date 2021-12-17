import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.NumberFormatException;

//create key check in gate Room
//create End /Winning screen

class map{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    Player a = new Player();
//these two x and y sets the starting location of the game
    int x = 6;
    int y = 10;

    Room dungeon[][] = new Room[13][16];
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


    while(true){
    try{
      System.out.println(dungeon[x][y].getDesc());
      System.out.println();
      System.out.println("Which direction?");
      System.out.println();
      String dir = scan.nextLine();

      if(dungeon[x][y].getEnvironment().equals("Sphinx")){
        Sphinx.riddle1(a,dungeon[x][y].M,scan);
      }
      if(dungeon[x][y].getEnvironment().equals("jenny")){
        dungeon[x][y].M.Battle(a,scan);
      }


      if(dir.equalsIgnoreCase("north")){
      if(!dungeon[x-1][y].getEnvironment().equals("wall")){
          x--;
          if(dungeon[x][y].getEnvironment().equals("tundra")){
            System.out.println("It's really cold...\n");
            a.takeDamage(1);
            System.out.println();
          }
          if(dungeon[x][y].getEnvironment().equals("lava")){
            System.out.println("It's too hot!!\n");
            a.takeDamage(10);
            System.out.println();
          }
        }
      else{System.out.println("There is a wall there.\n");}
      }

      if(dir.equalsIgnoreCase("south")){
      if(!dungeon[x+1][y].getEnvironment().equals("wall")){
          x++;
          if(dungeon[x][y].getEnvironment().equals("tundra")){
            System.out.println("It's really cold...\n");
            a.takeDamage(1);
            System.out.println();
          }
          if(dungeon[x][y].getEnvironment().equals("lava")){
            System.out.println("It's too hot!!\n");
            a.takeDamage(10);
            System.out.println();
          }
        }
      else{System.out.println("There is a wall there.\n");}
      }

      if(dir.equalsIgnoreCase("east")){
      if(!dungeon[x][y+1].getEnvironment().equals("wall\n")){
          y++;
          if(dungeon[x][y].getEnvironment().equals("tundra")){
            System.out.println("It's really cold...\n");
            a.takeDamage(1);
            System.out.println();
          }
          if(dungeon[x][y].getEnvironment().equals("lava")){
            System.out.println("It's too hot!!\n");
            a.takeDamage(10);
            System.out.println();
          }
        }
      else{System.out.println("There is a wall there.\n");}
      }

      if(dir.equalsIgnoreCase("west")){
      if(!dungeon[x][y-1].getEnvironment().equals("wall")){
          y--;
          if(dungeon[x][y].getEnvironment().equals("tundra")){
            System.out.println("It's really cold...\n");
            a.takeDamage(1);
            System.out.println();
          }
          if(dungeon[x][y].getEnvironment().equals("lava")){
            System.out.println("It's too hot!!\n");
            a.takeDamage(10);
            System.out.println();
          }
        }
      else{System.out.println("There is a wall there.\n");}
      }

    }
    catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Cannot go that way.");
      System.out.println("Which direction?");
      String dir = scan.nextLine();
    }
  }





  }


}
