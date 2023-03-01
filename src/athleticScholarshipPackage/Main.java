package athleticScholarshipPackage;

public class Main {
    public static void main(String[] args) {
        BasketballPlayer mark = new BasketballPlayer(1, "Basketball",
                "Mark","Jacobs", "Columbia, SC",
                "803-333-5655","Power Forward", 6.6,
                185,"Spring Valley High School",
                false, "", 5, 5,
                5, 5,
                5, 5);
        mark.playerProfileCard();
        mark.fortyYardDash(4.7);
        mark.squatMax(501);
        mark.benchMax(500);
        System.out.println();
        System.out.println();


        BasketballPlayer neko = new BasketballPlayer(2, "Basketball", "Neko", "Johnson",
                "Oahu, Hawaii", "808-366-9989", "Point Guard", 5.9, 160,
                "West Oahu High School", true, "University of Hawaii", 19, 11,
                1, 1, 3, 1);
        neko.playerProfileCard();
        neko.fortyYardDash(4.6);
        neko.squatMax(311);
        neko.benchMax(280);
    }
}
