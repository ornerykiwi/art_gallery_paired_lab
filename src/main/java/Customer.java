public class Customer {

    private String name;
    private double wallet;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
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

    // Takes the artwork object and retrieves the price, which will be taken away from the wallet total
    // Will then add the price of the artwork to the gallery's till using gallery object
    public void buyArtwork(Artwork artwork, Gallery gallery) {
        if(!((wallet - artwork.getPrice()) <= 0)) {
            reduceWallet(artwork.getPrice());
            gallery.addMoney(artwork.getPrice());
        }
    }
}
