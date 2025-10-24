package Course;

    public class Course {
    private String courseName;
    private String instructor;
    private int credits;

    public Course(String courseName, String instructor, int credits) { this.courseName = courseName; this.instructor = instructor; this.credits = credits; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public void displayDetails() { System.out.println("Course: " + courseName + ", Instructor: " + instructor + ", Credits: " + credits); }
}

class OnlineCourse extends Course {
    private String platform;
    private int durationWeeks;

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int durationWeeks) {
        super(courseName, instructor, credits);
        this.platform = platform; this.durationWeeks = durationWeeks;
    }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public int getDurationWeeks() { return durationWeeks; }
    public void setDurationWeeks(int durationWeeks) { this.durationWeeks = durationWeeks; }

    public boolean eligibleForCertificate() { return durationWeeks >= 4; }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform + ", Duration: " + durationWeeks + " weeks");
    }
}

