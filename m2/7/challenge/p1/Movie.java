public class Movie {

    private String name;
    private String format;
    private double rating;

    // constructor
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    // copy constructor
    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getFormat() {
        return this.format;
    }

    public Double getRating() {
        return this.rating;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

}
