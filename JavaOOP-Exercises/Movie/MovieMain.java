package Movie;

public class MovieMain {
    public static void main(String[] args) {
        Movie m = new Movie("Inception", "Christopher Nolan");
        m.addActor("Leonardo DiCaprio");
        m.addReview("Excellent sci-fi thriller!");
        m.displayDetails();
    }
}

