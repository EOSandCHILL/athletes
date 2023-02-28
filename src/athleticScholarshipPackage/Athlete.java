package athleticScholarshipPackage;

public class Athlete {
    private int rank;
    private String sport;
    private String firstName;
    private String lastName;
    private String hometown;
    private String phoneNumber;
    private String playerPosition;
    private double height;
    private int weight;
    private String highSchool;
    private boolean signed;
    private String college;

    public Athlete() {

    }

    public Athlete(int rank, String sport, String firstName,
                   String lastName,
                   String hometown, String phoneNumber,
                   String playerPosition,
                   double height, int weight,
                   String highSchool,
                   boolean signed, String college) {
        this.rank = rank;
        this.sport = sport;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hometown = hometown;
        this.phoneNumber = phoneNumber;
        this.playerPosition = playerPosition;
        this.height = height;
        this.weight = weight;
        this.highSchool = highSchool;
        this.signed = signed;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "rank=" + rank +
                ", sport='" + sport + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hometown='" + hometown + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", playerPosition='" + playerPosition + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", highSchool='" + highSchool + '\'' +
                ", signed=" + signed +
                ", college='" + college + '\'' +
                '}';
    }

    public void playerProfileCard() {
        System.out.println("-----------------------");
        System.out.println("Player Profile Card (M)");
        System.out.println("-----------------------");
        System.out.println("Rank: #" + rank);
        System.out.println("Sport: " + sport);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Hometown: " + hometown);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Position: " + playerPosition);
        System.out.println("Height: " + height + " ft");
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("High School: " + highSchool);
        System.out.println("Committed: " + signed);
        if (!signed) {
            System.out.println("College: TBD");
        } else {
            System.out.println("College: " + college);
        }
        System.out.println("-----------------------");
    }

    public void fortyYardDash(double time) {
        System.out.println("Player Performance Card");
        System.out.println("-----------------------");
        String event = "40-yard dash results: ";
        if (time <= 4.5) {
            System.out.println(event + "Under Review");
        } else if (time <= 4.6 && time >=  4.9) {
            System.out.println(event + "Fastest Speed");
        } else if (time >= 5.0 && time >=  5.6) {
            System.out.println(event + "Fast Speed");
        } else {
            System.out.println(event + "Average Speed");
        }
    }

    public void squatMax(int weight) {
        String event = "Squat Results: ";
        if (weight >= 700) {
            System.out.println(event + "Under Review");
        } else if (weight <= 550 && weight >=  699) {
            System.out.println(event + "Heaviest Squat");
        } else if (weight >= 450 && weight <=  549) {
            System.out.println(event + "Heavy Squat");
        } else {
            System.out.println(event + "Average Squat");
        }
    }

    public void benchMax(int weight) {
        String event = "Bench Press Results: ";
        if (weight >= 515) {
            System.out.println(event + "Under Review");
        } else if (weight <= 514 && weight >=  450) {
            System.out.println(event + "Heaviest Bench Press");
        } else if (weight >= 300 && weight <=  449) {
            System.out.println(event + "Heavy Bench Press");
        } else {
            System.out.println(event + "Average Bench Press");
        }
    }
}
