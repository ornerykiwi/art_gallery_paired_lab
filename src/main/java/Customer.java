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
        if(!((wallet - artworkPrice) <= 0)) {
            wallet -= artworkPrice;
        }
    }

    // Takes the artwork object and retrieves the price, which will minused from the wallet total
    public void buyArtwork(Artwork artwork) {
        reduceWallet(artwork.getPrice());
    }
}
