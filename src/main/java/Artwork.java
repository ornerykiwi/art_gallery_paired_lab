public class Artwork {

    private String title;
    private Artist artist;
    private double price;

    // Constructor to create piece of artwork and assign a title, artist and price to the object
    public Artwork(String title, Artist artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

}
