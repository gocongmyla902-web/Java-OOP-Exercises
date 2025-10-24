package Movie;

import java.util.ArrayList;
import java.util.List;

class Movie {
    private String title;
    private String director;
    private List<String> actors = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public Movie(String title, String director) { this.title = title; this.director = director; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public List<String> getActors() { return actors; }
    public void addActor(String actor) { actors.add(actor); }

    public List<String> getReviews() { return reviews; }
    public void addReview(String review) { reviews.add(review); }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
        System.out.println("Reviews: " + reviews);
    }
}

