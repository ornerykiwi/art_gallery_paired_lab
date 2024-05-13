import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    // Reduces wallet amount by the price of the artwork
    public void reduceWallet(double artworkPrice) {
        wallet -= artworkPrice;
    }

    // Adds the artwork to the customers own art collection
    public void setArtCollection(Artwork artwork) {
        artCollection.add(artwork);
    }

    // Check the customers art collection to see if they actually have the artwork in their collection
    public boolean checkArtCollection(Artwork artwork) {
        if (artCollection.contains(artwork)){
            return true;
        }
        return false;
    }

    // Firstly checks to see if the customer can afford the artwork, by checking if the wallet - artwork is greater than zero.
    // Then reduces the wallet amount by the artwork price, if above condition is true.
    // Will then add the price of the artwork to the gallery's till using gallery object
    // Artwork will then be added to the customers own art collection
    // Artwork will be removed from Gallery's stock
    public void buyArtwork(Artwork artwork, Gallery gallery) {
        if(!((wallet - artwork.getPrice()) <= 0)) {
            reduceWallet(artwork.getPrice());
            gallery.addMoney(artwork.getPrice());
            setArtCollection(artwork);
            gallery.stockRemoved(artwork);
        }
    }


}
