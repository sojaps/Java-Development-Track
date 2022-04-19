public class Player {
    private int playerid;
    private int Score=0;
    private int frameScore=0;

    public Player(int player){
        this.playerid = player;
    }
    public void setFrameScore(int frameScore) {
        this.frameScore = frameScore;
        this.Score+=frameScore;
    }
    public int getFrameScore() {
        return frameScore;
    }
    public int getScore() {
        return Score;
    }
    public int getPlayerid() {
        return playerid;
    }
}
