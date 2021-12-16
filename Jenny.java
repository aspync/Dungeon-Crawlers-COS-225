import java.util.Random;
import java.util.Scanner;

class Jenny extends Monster{

  Random rand = new Random();
  Scanner s = new Scanner(System.in);

  public Jenny(){ //creates the monster, Jenny Greenteeth
    super("Jenny Greenteeth", 200, 75);
  }
}
//Description: "The swamp makes you feel uneasy, as if you are not alone. \nYou seem to be stuck on the other side of the water. \nHowever, you see what appears to be a path of grass that leads to the other side of the river. \nAs you step on it, the path sinks under the water. /nYou catch yourself and make it back on the shore. \nYou see a disgusting, horrible creature rise out of the water. \nYou have met Jenny Greenteeth. \nYou are surprised."
