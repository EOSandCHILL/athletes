package athleticScholarshipPackage;

public class Main {
    public static void main(String[] args) {
        Athlete test = new Athlete(1, "Soccer", "Mark",
                "Jacobs", "Columbia, SC", "803-333-5655",
                "Forward", 5.8, 155,
                "Spring Valley High School",
                false, "University of South Carolina");
        test.playerProfileCard();
        test.fortyYardDash(4.7);
        test.squatMax(501);
        test.benchMax(500);
    }
}
