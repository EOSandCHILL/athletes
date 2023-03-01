package athleticScholarshipPackage;

public class BasketballPlayer extends Athlete {
    private int avgPointsPerGame;
    private int avgAssistsPerGame;
    private int avgOffensiveReboundsPerGame;
    private int avgDefensiveReboundsPerGame;
    private int avgStealsPerGame;
    private int avgBlocksPerGame;

    public BasketballPlayer() {
    }

    public BasketballPlayer(int rank, String sport, String firstName, String lastName,
                            String hometown, String phoneNumber, String playerPosition,
                            double height, int weight, String highSchool, boolean signed,
                            String college, int avgPointsPerGame, int avgAssistsPerGame,
                            int avgOffensiveReboundsPerGame, int avgDefensiveReboundsPerGame,
                            int avgStealsPerGame, int avgBlocksPerGame) {
        super(rank, sport, firstName, lastName, hometown, phoneNumber, playerPosition,
                height, weight, highSchool, signed, college);
        this.avgPointsPerGame = avgPointsPerGame;
        this.avgAssistsPerGame = avgAssistsPerGame;
        this.avgOffensiveReboundsPerGame = avgOffensiveReboundsPerGame;
        this.avgDefensiveReboundsPerGame = avgDefensiveReboundsPerGame;
        this.avgStealsPerGame = avgStealsPerGame;
        this.avgBlocksPerGame = avgBlocksPerGame;
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "avgPointsPerGame=" + avgPointsPerGame +
                ", avgAssistsPerGame=" + avgAssistsPerGame +
                ", avgOffensiveReboundsPerGame=" + avgOffensiveReboundsPerGame +
                ", avgDefensiveReboundsPerGame=" + avgDefensiveReboundsPerGame +
                ", avgStealsPerGame=" + avgStealsPerGame +
                ", avgBlocksPerGame=" + avgBlocksPerGame +
                '}';
    }

    public BasketballPlayer(int rank, String sport, String firstName,
                            String lastName, String hometown, String phoneNumber,
                            String playerPosition, double height, int weight,
                            String highSchool, boolean signed, String college) {
        super(rank, sport, firstName, lastName, hometown, phoneNumber,
                playerPosition, height, weight, highSchool, signed, college);
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
