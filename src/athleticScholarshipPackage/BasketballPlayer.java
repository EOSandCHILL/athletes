package athleticScholarshipPackage;

public class BasketballPlayer extends Athlete {
    private int assistsPerGame;
    private int offensiveReboundsPerGame;
    private int defensiveReboundsPerGame;
    private int stealsPerGame;
    private int blocksPerGame;

    public BasketballPlayer() {
        }

    public BasketballPlayer(int rank, String sport, String firstName, String lastName,
                            String hometown, String phoneNumber, String playerPosition,
                            double height, int weight, String highSchool, boolean signed,
                            String college) {
        super(rank, sport, firstName, lastName, hometown, phoneNumber, playerPosition,
                height, weight, highSchool, signed, college);

    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                ", assistsPerGame=" + assistsPerGame +
                ", offensiveReboundsPerGame=" + offensiveReboundsPerGame +
                ", defensiveReboundsPerGame=" + defensiveReboundsPerGame +
                ", stealsPerGame=" + stealsPerGame +
                ", blocksPerGame=" + blocksPerGame +
                '}';
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
    public void basketballStats(int assistsPerGame, int offensiveReboundsPerGame,
                                int defensiveReboundsPerGame, int stealsPerGame,
                                int blocksPerGame) {
            stats();
            System.out.println("Assists Per Game: " + assistsPerGame);
            System.out.println("Offensive Rebounds Per Game: " + offensiveReboundsPerGame);
            System.out.println("Defensive Rebounds Per Game: " + defensiveReboundsPerGame);
            System.out.println("Steals Per Game: " + stealsPerGame);
            System.out.println("Blocks Per Game: " + blocksPerGame);
        }
}
