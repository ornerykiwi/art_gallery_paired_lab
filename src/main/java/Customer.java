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

    public void reduceWallet(double artworkPrice) {
        wallet -= artworkPrice;
    }

    public void setArtCollection(Artwork artwork){
        artCollection.add(artwork);
    } //adds artwork to art collection

    public boolean checkArtCollection(Artwork artwork){
        if (artCollection.contains(artwork)){
            return true;
        }
        return false;
    }

    // Takes the artwork object and retrieves the price, which will be taken away from the wallet total
    // Will then add the price of the artwork to the gallery's till using gallery object
    public void buyArtwork(Artwork artwork, Gallery gallery) {
        if(!((wallet - artwork.getPrice()) <= 0)) {
            reduceWallet(artwork.getPrice());
            gallery.addMoney(artwork.getPrice());
            setArtCollection(artwork);
            gallery.stockRemoved(artwork);
        }
    }


}
