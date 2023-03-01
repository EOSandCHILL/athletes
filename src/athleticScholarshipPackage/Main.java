package athleticScholarshipPackage;

public class Main {
    public static void main(String[] args) {
        BasketballPlayer mark = new BasketballPlayer(1, "Basketball", "Mark",
                "Jacobs", "Columbia, SC", "803-333-5655",
                "Power Forward", 6.6, 185,
                "Spring Valley High School",
                false, "University of South Carolina");
        mark.playerProfileCard();
        mark.fortyYardDash(4.7);
        mark.squatMax(501);
        mark.benchMax(500);
    }
}
