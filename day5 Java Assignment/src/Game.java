import java.util.Scanner;

public class Game {
    private String name;
    private int maxNumPlayers;

    public Game(String name, int maxNumPlayers){
        this.name = name;
        this.maxNumPlayers = maxNumPlayers;
    }
    public String getName(){
        return name;
    }
    public int getMaxNumPlayers(){
        return maxNumPlayers;
    }
    public String toString(){
        return "Max Num of Players for " + name + " is " + maxNumPlayers;
    }
}
class GameWithTimeLimit extends Game {
    private int timeLimit;

    public GameWithTimeLimit(String name, int maxNumPlayers, int timeLimit) {
        super(name, maxNumPlayers);
        this.timeLimit = timeLimit;
    }
    public int getTimeLimit(){
        return timeLimit;
    }
    public String toString(){
        return super.toString() + "TimeLimit for " + getName() + " is " + timeLimit+" minutes ";
    }
}
class Program3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a game");
        String gameName1 = sc.nextLine();
        System.out.println("Enter max num of players");
        int players1 = sc.nextInt();
        sc.nextLine();
        Game game1 = new Game(gameName1, players1);
        System.out.println(game1.toString());
        System.out.println("Enter a game that has time limit");
        String gameName2 = sc.nextLine();
        System.out.println("Enter max num of players");
        int players2 = sc.nextInt();
        System.out.println("Enter time limit in mins");
        int timeLimit = sc.nextInt();

        GameWithTimeLimit game2 = new GameWithTimeLimit(gameName2, players2, timeLimit);
        System.out.println(game2.toString());
        sc.close();
    }
}