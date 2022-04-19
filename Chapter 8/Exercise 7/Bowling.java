import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Bowling {
    public static void main(String[] args) {
        int remainingthrows = 2;
        int remainingPins=10;
        int randomNumber;
        int scorePerFrame=0;
        int framesPlayed=1;
        ArrayList<Player> players = new ArrayList<Player>();
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Players: ");
        int numberOfPlayers = Integer.parseInt(input.nextLine());
        for(int i=0;i<numberOfPlayers;i++){
            Player addplayer=new Player(i+1);
            players.add(addplayer);           
        }
        while(framesPlayed<11){
            System.out.printf("Frame #%d\n",framesPlayed);
            for (Player player : players) {
                while(remainingthrows!=0){
                    randomNumber = rand.nextInt(remainingPins+1);
                    remainingPins-=randomNumber;
                    scorePerFrame+=randomNumber;
                    System.out.printf("Knocked down %d pin(s)!\n",randomNumber);
                    remainingthrows--;
                    if(remainingPins ==0&&remainingthrows!=0){
                        System.out.println("Strike!");
                        scorePerFrame=20;
                        break;
                    }
                    else if(remainingPins==0)
                    {
                        System.out.println("halfstrike");
                        scorePerFrame=15;
                    }
                }
                player.setFrameScore(scorePerFrame);
                System.out.printf("Player: %d\n",player.getPlayerid());
                System.out.printf("Score: %d\n\n",player.getScore());
                remainingthrows = 2;
                remainingPins=10;
                scorePerFrame=0;
            }
            framesPlayed++;
        }
        input.close();
    }

}
