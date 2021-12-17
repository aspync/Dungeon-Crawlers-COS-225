import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Scoreboard {
    private ArrayList<Player> players = new ArrayList<Player>();

    public void addPlayer(Player player){
        this.players.add(player);

    }

    public Player createPlayer(String name, int hp, int attack){
        Player player = new Player(name, hp, attack);
        this.addPlayer(player);
        return player;
    }

    public void writeScoreboard(String fileName){
        File f = new File(fileName);
        try{
            FileWriter w = new FileWriter(f);
            w.write("player_name,player_hp,player_attack\n");
            for (int i = 0; i < this.players.size(); i++) {
                Player player = this.players.get(i);
                w.write(player.getName() + "," + player.getHp() + "," + player.getAttack() + "\n");
            }
            w.close();
        } catch (IOException e){
            System.out.println("Problem");

        }
    }
    public ArrayList<Player> readPlayers(String fileName) {
        this.players = new ArrayList<Player>();
        File f = new File(fileName);
        try {
            Scanner s = new Scanner(f);
            s.nextLine();
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] array = line.split(",");
                String player_name = array[0];
                int player_hp = Integer.parseInt(array[1]);
                int player_attack = Integer.parseInt(array[2]);
                Player t = new Player(player_name, player_hp, player_attack);
                this.players.add(t);

            }
            s.close();

        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        } catch (NumberFormatException e) {

        }
        return players;
    }

    public static void main (String[] args) {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.createPlayer("hayley", 4, 5);
        scoreboard.createPlayer("teddy", 50, 40);
        scoreboard.writeScoreboard("Scoreboard1.txt");
        Scoreboard scoreboard1 = new Scoreboard();
        scoreboard1.readPlayers("Scoreboard1.txt");
        scoreboard1.createPlayer("monster", 400, 5);
        scoreboard1.writeScoreboard("Scoreboard2.txt");
        System.out.println(scoreboard.getPlayers());
        System.out.println(scoreboard1.getPlayers());
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
