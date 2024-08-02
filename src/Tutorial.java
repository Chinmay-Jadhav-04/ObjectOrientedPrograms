public class Tutorial {
    // Fields
    private int tid;
    private String tname;
    private String description;
    private String comments;

    // Default constructor
    public Tutorial() {
        this.tid = 0;
        this.tname = "Unknown";
        this.description = "No description";
        this.comments = "No comments";
    }

    // Constructor with tid and tname
    public Tutorial(int tid, String tname) {
        this.tid = tid;
        this.tname = tname;
        this.description = "No description";
        this.comments = "No comments";
    }

    // Constructor with description and comments
    public Tutorial(String description, String comments) {
        this.tid = 0;
        this.tname = "Unknown";
        this.description = description;
        this.comments = comments;
    }

    // Method to display the data
    public void displayData() {
        System.out.println("Tutorial ID: " + tid);
        System.out.println("Tutorial Name: " + tname);
        System.out.println("Description: " + description);
        System.out.println("Comments: " + comments);
    }

    public static void main(String[] args) {
        // Using default constructor
        Tutorial tutorial1 = new Tutorial();
        System.out.println("Tutorial 1:");
        tutorial1.displayData();
        System.out.println();

        // Using constructor with tid and tname
        Tutorial tutorial2 = new Tutorial(1, "Java Basics");
        System.out.println("Tutorial 2:");
        tutorial2.displayData();
        System.out.println();

        // Using constructor with description and comments
        Tutorial tutorial3 = new Tutorial("This is a Java tutorial.", "Great for beginners.");
        System.out.println("Tutorial 3:");
        tutorial3.displayData();
    }
}