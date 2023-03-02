package athleticScholarshipPackage;

public class SoccerPlayer extends Athlete {
    private int avgGoalsPerGame;
    private int avgAssistsPerGame;
    private int avgPassesPerGame;
    private int avgShotsPerGame;
    private int avgTurnoversPerGame;
    private int avgFoulsPerGame;

    public SoccerPlayer() {

    }

    public SoccerPlayer(int rank, String sport, String firstName,
                        String lastName, String hometown, String phoneNumber,
                        String playerPosition, double height, int weight,
                        String highSchool, boolean signed, String college,
                        int avgGoalsPerGame, int avgAssistsPerGame, int avgPassesPerGame,
                        int avgShotsPerGame, int avgTurnoversPerGame, int avgFoulsPerGame) {
        super(rank, sport, firstName, lastName, hometown, phoneNumber,
                playerPosition, height, weight, highSchool, signed, college);
        this.avgGoalsPerGame = avgGoalsPerGame;
        this.avgAssistsPerGame = avgAssistsPerGame;
        this.avgPassesPerGame = avgPassesPerGame;
        this.avgShotsPerGame = avgShotsPerGame;
        this.avgTurnoversPerGame = avgTurnoversPerGame;
        this.avgFoulsPerGame = avgFoulsPerGame;
    }

    //    public SoccerPlayer(int avgGoalsPerGame, int avgAssistsPerGame,
//                        int avgPassesPerGame, int avgShotsPerGame,
//                        int avgTurnoversPerGame, int avgFoulsPerGame) {
//        this.avgGoalsPerGame = avgGoalsPerGame;
//        this.avgAssistsPerGame = avgAssistsPerGame;
//        this.avgPassesPerGame = avgPassesPerGame;
//        this.avgShotsPerGame = avgShotsPerGame;
//        this.avgTurnoversPerGame = avgTurnoversPerGame;
//        this.avgFoulsPerGame = avgFoulsPerGame;
//    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "avgGoalsPerGame=" + avgGoalsPerGame +
                ", avgAssistsPerGame=" + avgAssistsPerGame +
                ", avgPassesPerGame=" + avgPassesPerGame +
                ", avgShotsPerGame=" + avgShotsPerGame +
                ", avgTurnoversPerGame=" + avgTurnoversPerGame +
                ", avgFoulsPerGame=" + avgFoulsPerGame +
                "} " + super.toString();
    }

    @Override
    public void playerProfileCard() {
        super.playerProfileCard();
    }

    @Override
    public void fortyYardDash(double time) {
        super.fortyYardDash(time);
    }

    @Override
    public void squatMax(int weight) {
        super.squatMax(weight);
    }

    @Override
    public void benchMax(int weight) {
        super.benchMax(weight);
    }
}
